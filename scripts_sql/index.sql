CREATE NONCLUSTERED INDEX idx_endereco_rua ON endereco(rua) INCLUDE(id_endereco, cidade, bairro);

CREATE NONCLUSTERED INDEX idx_cliente_endereco ON cliente(id_endereco) INCLUDE(cd_cliente, nm_cliente);

CREATE NONCLUSTERED INDEX idx_cliente_telefone ON cliente(telefone) INCLUDE(cd_cliente, email, cpf);

CREATE NONCLUSTERED INDEX idx_veiculos_modelo ON veiculos(id_modelo) INCLUDE(placa, id_cor);

CREATE NONCLUSTERED INDEX idx_aluguel_cliente ON aluguel(cd_cliente) INCLUDE(id_aluguel, placa);

CREATE NONCLUSTERED INDEX idx_aluguel_pagamento ON aluguel(id_pagamento) INCLUDE(id_aluguel, valor);

-- Exemplo de uso dos índices:
-- Pesquisa sem índice nonclustered
-- SELECT data_inicio, data_fim, valor FROM aluguel
-- WHERE valor = 400.60;

-- Pesquisa com índice nonclustered e include
-- SELECT nm_cliente, id_endereco FROM cliente
-- WHERE id_endereco = 3;
