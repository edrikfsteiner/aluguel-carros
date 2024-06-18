-- Criar a nova trigger DescontoPIX
CREATE TRIGGER DescontoPIX
ON pagamento
AFTER INSERT
AS
BEGIN
    SET NOCOUNT ON;

    DECLARE @id_pagamento INT;
    DECLARE @valor DECIMAL(11,2);
    DECLARE @cd_forma_pagamento INT;

    SELECT 
        @id_pagamento = id_pagamento,
        @valor = valor,
        @cd_forma_pagamento = cd_forma_pagamento
    FROM inserted;

    -- Verificar se a forma de pagamento é PIX
    IF EXISTS (SELECT 1 FROM forma_pagamento WHERE cd_forma_pagamento = @cd_forma_pagamento AND tipo_pagamento = 'Pix')
    BEGIN
        -- Aplicar desconto de 10%
        UPDATE pagamento
        SET valor = @valor * 0.9
        WHERE id_pagamento = @id_pagamento;
    END;
END;
GO

-- Inserir um pagamento via PIX
INSERT INTO pagamento (cd_forma_pagamento, valor)
VALUES (7, 1500.00); -- Valor antes do desconto: 1500.00 (7 pode ser diferente dependendo de qual o id do Pix)

-- Verificar se o desconto foi aplicado
SELECT * FROM pagamento;