CREATE FUNCTION ListarClientesPorCorEPeriodo(@cor VARCHAR(20), @data_inicio DATETIME, @data_fim DATETIME)
RETURNS TABLE
AS
RETURN
    SELECT
        c.nm_cliente,
        c.telefone,
        c.email,
        c.cpf
    FROM
        cliente c
    JOIN
        aluguel a ON c.cd_cliente = a.cd_cliente
    JOIN
        veiculos v ON a.placa = v.placa
    JOIN
        cor co ON v.id_cor = co.id_cor
    WHERE
        co.cor = @cor
        AND a.data_inicio BETWEEN @data_inicio AND @data_fim
    GROUP BY
        c.nm_cliente,
        c.telefone,
        c.email,
        c.cpf;

-- Exemplo de uso da função:
-- SELECT *
-- FROM ListarClientesPorCorEPeriodo('Preto', '2023-01-01', '2023-12-31');