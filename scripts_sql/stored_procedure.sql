CREATE OR ALTER PROCEDURE ListarClientesPorMarcaEFormaPagamento
    @p_marca_nome VARCHAR(20),
    @p_tipo_pagamento VARCHAR(50)
AS
BEGIN
    SELECT 
        c.nm_cliente,
        c.telefone,
        c.email,
        c.cpf,
        MAX(a.data_fim) AS ultima_data_aluguel
    FROM 
        cliente c
    JOIN 
        aluguel a ON c.cd_cliente = a.cd_cliente
    JOIN 
        veiculos v ON a.placa = v.placa
    JOIN 
        modelo m ON v.id_modelo = m.id_modelo
    JOIN 
        marca ma ON m.id_marca = ma.id_marca
    JOIN 
        pagamento p ON a.id_pagamento = p.id_pagamento
    JOIN 
        forma_pagamento fp ON p.cd_forma_pagamento = fp.cd_forma_pagamento
    WHERE 
        ma.marca = @p_marca_nome AND
        fp.tipo_pagamento = @p_tipo_pagamento
    GROUP BY 
        c.cd_cliente, c.nm_cliente, c.telefone, c.email, c.cpf;
END;

EXEC ListarClientesPorMarcaEFormaPagamento @p_marca_nome = 'Ford', @p_tipo_pagamento = 'Cartão de Crédito';
--Valor da marca e do tipo de pagamento pode mudar.
