CREATE INDEX idx_cliente ON cliente(cd_cliente);

CREATE NONCLUSTERED INDEX idx_endereco ON cliente(id_endereco) INCLUDE(cd_cliente, nm_cliente);

CREATE INDEX idx_veiculos ON veiculos(placa);

CREATE INDEX idx_aluguel ON aluguel(id_aluguel);