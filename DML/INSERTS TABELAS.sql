-- Insert statements for marca
INSERT INTO marca (id_marca, marca) VALUES
(1, 'Ford'),
(2, 'Chevrolet'),
(3, 'Toyota'),
(4, 'Honda'),
(5, 'BMW'),
(6, 'Audi'),
(7, 'Mercedes'),
(8, 'Volkswagen'),
(9, 'Hyundai'),
(10, 'Nissan');

-- Insert statements for modelo
INSERT INTO modelo (id_modelo, modelo, id_marca) VALUES
(1, 'Fiesta', 1),
(2, 'Cruze', 2),
(3, 'Corolla', 3),
(4, 'Civic', 4),
(5, '3 Series', 5),
(6, 'A4', 6),
(7, 'C-Class', 7),
(8, 'Golf', 8),
(9, 'Elantra', 9),
(10, 'Altima', 10);

-- Insert statements for cor
INSERT INTO cor (id_cor, cor) VALUES
(1, 'Red'),
(2, 'Blue'),
(3, 'Black'),
(4, 'White'),
(5, 'Silver'),
(6, 'Green'),
(7, 'Yellow'),
(8, 'Gray'),
(9, 'Brown'),
(10, 'Orange');

-- Insert statements for cliente
INSERT INTO cliente (cd_cliente, nm_cliente, telefone, email, cpf) VALUES
(1, 'John Doe', 1234567890, 'john@example.com', 11122233344),
(2, 'Jane Smith', 1234567891, 'jane@example.com', 11122233345),
(3, 'Robert Johnson', 1234567892, 'robert@example.com', 11122233346),
(4, 'Michael Brown', 1234567893, 'michael@example.com', 11122233347),
(5, 'William Jones', 1234567894, 'william@example.com', 11122233348),
(6, 'David Miller', 1234567895, 'david@example.com', 11122233349),
(7, 'Richard Davis', 1234567896, 'richard@example.com', 11122233350),
(8, 'Joseph Wilson', 1234567897, 'joseph@example.com', 11122233351),
(9, 'Charles Moore', 1234567898, 'charles@example.com', 11122233352),
(10, 'Thomas Taylor', 1234567899, 'thomas@example.com', 11122233353);

-- Insert statements for endereco
INSERT INTO endereco (cd_cliente, uf, cep, cidade, bairro, rua, numero) VALUES
(1, 'SC', '88801000', 'Criciúma', 'Centro', 'Rua A', 100),
(2, 'SC', '88704000', 'Tubarão', 'Centro', 'Rua B', 200),
(3, 'SC', '88820000', 'Içara', 'Centro', 'Rua C', 300),
(4, 'SC', '88790000', 'Laguna', 'Centro', 'Rua D', 400),
(5, 'SC', '88900000', 'Araranguá', 'Centro', 'Rua E', 500),
(6, 'SC', '88801001', 'Criciúma', 'Centro', 'Rua F', 600),
(7, 'SC', '88704001', 'Tubarão', 'Centro', 'Rua G', 700),
(8, 'SC', '88820001', 'Içara', 'Centro', 'Rua H', 800),
(9, 'SC', '88790001', 'Laguna', 'Centro', 'Rua I', 900),
(10, 'SC', '88900001', 'Araranguá', 'Centro', 'Rua J', 1000);

-- Insert statements for veiculos
INSERT INTO veiculos (placa, ano, id_cor, id_modelo) VALUES
('ABC1234', '2020-01-01', 1, 1),
('DEF5678', '2019-02-01', 2, 2),
('GHI9101', '2018-03-01', 3, 3),
('JKL1121', '2021-04-01', 4, 4),
('MNO3141', '2017-05-01', 5, 5),
('PQR5161', '2016-06-01', 6, 6),
('STU7181', '2020-07-01', 7, 7),
('VWX9202', '2019-08-01', 8, 8),
('YZA1223', '2018-09-01', 9, 9),
('BCD3245', '2021-10-01', 10, 10);

-- Insert statements for aluguel
INSERT INTO aluguel (id_aluguel, cd_cliente, placa, data_inicio, data_fim, valor) VALUES
(1, 1, 'ABC1234', '2023-01-01 10:00:00', '2023-01-05 10:00:00', 200.00),
(2, 2, 'DEF5678', '2023-02-01 11:00:00', '2023-02-06 11:00:00', 250.00),
(3, 3, 'GHI9101', '2023-03-01 12:00:00', '2023-03-05 12:00:00', 220.00),
(4, 4, 'JKL1121', '2023-04-01 13:00:00', '2023-04-07 13:00:00', 300.00),
(5, 5, 'MNO3141', '2023-05-01 14:00:00', '2023-05-05 14:00:00', 180.00),
(6, 6, 'PQR5161', '2023-06-01 15:00:00', '2023-06-06 15:00:00', 280.00),
(7, 7, 'STU7181', '2023-07-01 16:00:00', '2023-07-05 16:00:00', 260.00),
(8, 8, 'VWX9202', '2023-08-01 17:00:00', '2023-08-05 17:00:00', 240.00),
(9, 9, 'YZA1223', '2023-09-01 18:00:00', '2023-09-06 18:00:00', 320.00),
(10, 10, 'BCD3245', '2023-10-01 19:00:00', '2023-10-05 19:00:00', 210.00);

-- Insert statements para forma_pagamento
INSERT INTO forma_pagamento (cd_forma_pagamento, tipo_pagamento) VALUES
(1, 'Cartão de Crédito'),
(2, 'Cartão de Débito'),
(3, 'Dinheiro'),
(4, 'Pix'),
(5, 'Paypal'),
(6, 'Apple Pay'),
(7, 'Google Pay'),
(8, 'Boleto'),
(9, 'Cheque'),
(10, 'Transf. Bancária');

-- Insert statements for pagamento
INSERT INTO pagamento (id_aluguel, cd_forma_pagamento, valor) VALUES
(1, 1, 200.00),
(2, 2, 250.00),
(3, 3, 220.00),
(4, 4, 300.00),
(5, 5, 180.00),
(6, 6, 280.00),
(7, 7, 260.00),
(8, 8, 240.00),
(9, 9, 320.00),
(10, 10, 210.00);
