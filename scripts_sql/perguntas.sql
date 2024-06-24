--Pergunta 2:
-- Subconsulta para obter a contagem de aluguéis e valor total gerado por modelo e estado
WITH alugueis_por_modelo_estado AS (
    SELECT 
        m.modelo,
        e.uf,
        COUNT(a.id_aluguel) AS total_alugueis,
        SUM(a.valor) AS valor_total
    FROM 
        aluguel a
        JOIN veiculos v ON a.placa = v.placa
        JOIN modelo m ON v.id_modelo = m.id_modelo
        JOIN cliente c ON a.cd_cliente = c.cd_cliente
        JOIN endereco e ON c.id_endereco = e.id_endereco
    GROUP BY 
        m.modelo, e.uf
),
-- Subconsulta para obter o modelo mais alugado em cada estado
modelo_mais_alugado_por_estado AS (
    SELECT 
        uf,
        modelo,
        total_alugueis,
        valor_total,
        RANK() OVER (PARTITION BY uf ORDER BY total_alugueis DESC, valor_total DESC) AS ranking
    FROM 
        alugueis_por_modelo_estado
)
-- Selecionar os modelos mais alugados em cada estado
SELECT 
    uf,
    modelo,
    total_alugueis,
    valor_total
FROM 
    modelo_mais_alugado_por_estado
WHERE 
    ranking = 1
ORDER BY 
    uf;

-- Ranking dos modelos mais alugados e seus respectivos estados
SELECT 
    modelo,
    uf,
    total_alugueis,
    valor_total,
    RANK() OVER (ORDER BY total_alugueis DESC, valor_total DESC) AS ranking
FROM 
    alugueis_por_modelo_estado
ORDER BY 
    ranking;


--Pergunta 3:
SELECT 
    m.modelo,
    COUNT(a.id_aluguel) AS total_alugueis
FROM 
    aluguel a
    JOIN veiculos v ON a.placa = v.placa
    JOIN modelo m ON v.id_modelo = m.id_modelo
    JOIN cliente c ON a.cd_cliente = c.cd_cliente
    JOIN endereco e ON c.id_endereco = e.id_endereco
    JOIN pagamento p ON a.id_pagamento = p.id_pagamento
    JOIN forma_pagamento fp ON p.cd_forma_pagamento = fp.cd_forma_pagamento
WHERE 
    e.uf = 'SC' 
    AND fp.tipo_pagamento = 'Cheque'
    AND YEAR(a.data_inicio) = 2023
GROUP BY 
    m.modelo
ORDER BY 
    total_alugueis DESC;