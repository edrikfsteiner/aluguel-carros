-- Insert statements for table marca
INSERT INTO marca (marca) VALUES ('Ford');
INSERT INTO marca (marca) VALUES ('Toyota');
INSERT INTO marca (marca) VALUES ('Honda');
INSERT INTO marca (marca) VALUES ('Chevrolet');
INSERT INTO marca (marca) VALUES ('Nissan');
INSERT INTO marca (marca) VALUES ('Volkswagen');
INSERT INTO marca (marca) VALUES ('Hyundai');
INSERT INTO marca (marca) VALUES ('Kia');
INSERT INTO marca (marca) VALUES ('BMW');
INSERT INTO marca (marca) VALUES ('Mercedes-Benz');

-- Insert statements for table modelo
INSERT INTO modelo (modelo, id_marca) VALUES ('Fiesta', 1);
INSERT INTO modelo (modelo, id_marca) VALUES ('Corolla', 2);
INSERT INTO modelo (modelo, id_marca) VALUES ('Civic', 3);
INSERT INTO modelo (modelo, id_marca) VALUES ('Cruze', 4);
INSERT INTO modelo (modelo, id_marca) VALUES ('Sentra', 5);
INSERT INTO modelo (modelo, id_marca) VALUES ('Golf', 6);
INSERT INTO modelo (modelo, id_marca) VALUES ('Elantra', 7);
INSERT INTO modelo (modelo, id_marca) VALUES ('Optima', 8);
INSERT INTO modelo (modelo, id_marca) VALUES ('3 Series', 9);
INSERT INTO modelo (modelo, id_marca) VALUES ('C-Class', 10);

-- Insert statements for table cor
INSERT INTO cor (cor) VALUES ('Vermelho');
INSERT INTO cor (cor) VALUES ('Azul');
INSERT INTO cor (cor) VALUES ('Preto');
INSERT INTO cor (cor) VALUES ('Branco');
INSERT INTO cor (cor) VALUES ('Prata');
INSERT INTO cor (cor) VALUES ('Cinza');
INSERT INTO cor (cor) VALUES ('Verde');
INSERT INTO cor (cor) VALUES ('Amarelo');
INSERT INTO cor (cor) VALUES ('Marrom');
INSERT INTO cor (cor) VALUES ('Roxo');

-- Insert statements for table endereco
INSERT INTO endereco (uf, cep, cidade, bairro, rua, numero) VALUES ('SC', '88800-000', 'Criciuma', 'Centro', 'Rua A', 1);
INSERT INTO endereco (uf, cep, cidade, bairro, rua, numero) VALUES ('SC', '88701-000', 'Tubarao', 'Vila Moema', 'Rua B', 2);
INSERT INTO endereco (uf, cep, cidade, bairro, rua, numero) VALUES ('SC', '88790-000', 'Laguna', 'Centro', 'Rua C', 3);
INSERT INTO endereco (uf, cep, cidade, bairro, rua, numero) VALUES ('SC', '88820-000', 'Icara', 'Presidente Vargas', 'Rua D', 4);
INSERT INTO endereco (uf, cep, cidade, bairro, rua, numero) VALUES ('SC', '88900-000', 'Ararangua', 'Cidade Alta', 'Rua E', 5);
INSERT INTO endereco (uf, cep, cidade, bairro, rua, numero) VALUES ('SC', '88801-000', 'Criciuma', 'Comerciario', 'Rua F', 6);
INSERT INTO endereco (uf, cep, cidade, bairro, rua, numero) VALUES ('SC', '88702-000', 'Tubarao', 'Oficinas', 'Rua G', 7);
INSERT INTO endereco (uf, cep, cidade, bairro, rua, numero) VALUES ('SC', '88791-000', 'Laguna', 'Progresso', 'Rua H', 8);
INSERT INTO endereco (uf, cep, cidade, bairro, rua, numero) VALUES ('SC', '88821-000', 'Icara', 'Centro', 'Rua I', 9);
INSERT INTO endereco (uf, cep, cidade, bairro, rua, numero) VALUES ('SC', '88901-000', 'Ararangua', 'Centro', 'Rua J', 10);

-- Insert statements for table cliente
INSERT INTO cliente (nm_cliente, telefone, email, cpf, id_endereco) VALUES ('Joao Silva', 11987654321, 'joao.silva@example.com', 12345678901, 1);
INSERT INTO cliente (nm_cliente, telefone, email, cpf, id_endereco) VALUES ('Maria Santos', 21987654321, 'maria.santos@example.com', 12345678902, 2);
INSERT INTO cliente (nm_cliente, telefone, email, cpf, id_endereco) VALUES ('Pedro Costa', 31987654321, 'pedro.costa@example.com', 12345678903, 3);
INSERT INTO cliente (nm_cliente, telefone, email, cpf, id_endereco) VALUES ('Ana Lima', 41987654321, 'ana.lima@example.com', 12345678904, 4);
INSERT INTO cliente (nm_cliente, telefone, email, cpf, id_endereco) VALUES ('Carlos Souza', 51987654321, 'carlos.souza@example.com', 12345678905, 5);
INSERT INTO cliente (nm_cliente, telefone, email, cpf, id_endereco) VALUES ('Fernanda Pereira', 61987654321, 'fernanda.pereira@example.com', 12345678906, 6);
INSERT INTO cliente (nm_cliente, telefone, email, cpf, id_endereco) VALUES ('Lucas Oliveira', 71987654321, 'lucas.oliveira@example.com', 12345678907, 7);
INSERT INTO cliente (nm_cliente, telefone, email, cpf, id_endereco) VALUES ('Juliana Almeida', 81987654321, 'juliana.almeida@example.com', 12345678908, 8);
INSERT INTO cliente (nm_cliente, telefone, email, cpf, id_endereco) VALUES ('Rafael Fernandes', 91987654321, 'rafael.fernandes@example.com', 12345678909, 9);
INSERT INTO cliente (nm_cliente, telefone, email, cpf, id_endereco) VALUES ('Patricia Gomes', 101987654321, 'patricia.gomes@example.com', 12345678910, 10);

-- Insert statements for table veiculos
INSERT INTO veiculos (placa, ano, id_cor, id_modelo) VALUES ('ABC1234', '2015-01-01', 1, 1);
INSERT INTO veiculos (placa, ano, id_cor, id_modelo) VALUES ('DEF5678', '2016-01-01', 2, 2);
INSERT INTO veiculos (placa, ano, id_cor, id_modelo) VALUES ('GHI9012', '2017-01-01', 3, 3);
INSERT INTO veiculos (placa, ano, id_cor, id_modelo) VALUES ('JKL3456', '2018-01-01', 4, 4);
INSERT INTO veiculos (placa, ano, id_cor, id_modelo) VALUES ('MNO7890', '2019-01-01', 5, 5);
INSERT INTO veiculos (placa, ano, id_cor, id_modelo) VALUES ('PQR2345', '2020-01-01', 6, 6);
INSERT INTO veiculos (placa, ano, id_cor, id_modelo) VALUES ('STU6789', '2021-01-01', 7, 7);
INSERT INTO veiculos (placa, ano, id_cor, id_modelo) VALUES ('VWX1234', '2022-01-01', 8, 8);
INSERT INTO veiculos (placa, ano, id_cor, id_modelo) VALUES ('YZA5678', '2023-01-01', 9, 9);
INSERT INTO veiculos (placa, ano, id_cor, id_modelo) VALUES ('BCD9012', '2024-01-01', 10, 10);

-- Insert statements for table forma_pagamento
INSERT INTO forma_pagamento (tipo_pagamento) VALUES ('Cartão de Crédito');
INSERT INTO forma_pagamento (tipo_pagamento) VALUES ('Cartão de Débito');
INSERT INTO forma_pagamento (tipo_pagamento) VALUES ('Dinheiro');
INSERT INTO forma_pagamento (tipo_pagamento) VALUES ('Pix');
INSERT INTO forma_pagamento (tipo_pagamento) VALUES ('PayPal');
INSERT INTO forma_pagamento (tipo_pagamento) VALUES ('Apple Pay');
INSERT INTO forma_pagamento (tipo_pagamento) VALUES ('Google Pay');
INSERT INTO forma_pagamento (tipo_pagamento) VALUES ('Cheque');
INSERT INTO forma_pagamento (tipo_pagamento) VALUES ('Transf. Bancária');
INSERT INTO forma_pagamento (tipo_pagamento) VALUES ('Voucher');

-- Insert statements for table pagamento
INSERT INTO pagamento (cd_forma_pagamento, valor) VALUES (1, 150.50);
INSERT INTO pagamento (cd_forma_pagamento, valor) VALUES (2, 200.75);
INSERT INTO pagamento (cd_forma_pagamento, valor) VALUES (3, 100.00);
INSERT INTO pagamento (cd_forma_pagamento, valor) VALUES (4, 300.20);
INSERT INTO pagamento (cd_forma_pagamento, valor) VALUES (5, 250.00);
INSERT INTO pagamento (cd_forma_pagamento, valor) VALUES (6, 175.80);
INSERT INTO pagamento (cd_forma_pagamento, valor) VALUES (7, 225.90);
INSERT INTO pagamento (cd_forma_pagamento, valor) VALUES (8, 400.60);
INSERT INTO pagamento (cd_forma_pagamento, valor) VALUES (9, 320.40);
INSERT INTO pagamento (cd_forma_pagamento, valor) VALUES (10, 500.00);

-- Insert statements for table aluguel
INSERT INTO aluguel (cd_cliente, placa, id_pagamento, data_inicio, data_fim, valor) VALUES (1, 'ABC1234', 1, '2023-01-01 09:00:00', '2023-01-05 09:00:00', 150.50);
INSERT INTO aluguel (cd_cliente, placa, id_pagamento, data_inicio, data_fim, valor) VALUES (2, 'DEF5678', 2, '2023-02-01 09:00:00', '2023-02-07 09:00:00', 200.75);
INSERT INTO aluguel (cd_cliente, placa, id_pagamento, data_inicio, data_fim, valor) VALUES (3, 'GHI9012', 3, '2023-03-01 09:00:00', '2023-03-03 09:00:00', 100.00);
INSERT INTO aluguel (cd_cliente, placa, id_pagamento, data_inicio, data_fim, valor) VALUES (4, 'JKL3456', 4, '2023-04-01 09:00:00', '2023-04-10 09:00:00', 300.20);
INSERT INTO aluguel (cd_cliente, placa, id_pagamento, data_inicio, data_fim, valor) VALUES (5, 'MNO7890', 5, '2023-05-01 09:00:00', '2023-05-08 09:00:00', 250.00);
INSERT INTO aluguel (cd_cliente, placa, id_pagamento, data_inicio, data_fim, valor) VALUES (6, 'PQR2345', 6, '2023-06-01 09:00:00', '2023-06-05 09:00:00', 175.80);
INSERT INTO aluguel (cd_cliente, placa, id_pagamento, data_inicio, data_fim, valor) VALUES (7, 'STU6789', 7, '2023-07-01 09:00:00', '2023-07-10 09:00:00', 225.90);
INSERT INTO aluguel (cd_cliente, placa, id_pagamento, data_inicio, data_fim, valor) VALUES (8, 'VWX1234', 8, '2023-08-01 09:00:00', '2023-08-12 09:00:00', 400.60);
INSERT INTO aluguel (cd_cliente, placa, id_pagamento, data_inicio, data_fim, valor) VALUES (9, 'YZA5678', 9, '2023-09-01 09:00:00', '2023-09-05 09:00:00', 320.40);
INSERT INTO aluguel (cd_cliente, placa, id_pagamento, data_inicio, data_fim, valor) VALUES (10, 'BCD9012', 10, '2023-10-01 09:00:00', '2023-10-15 09:00:00', 500.00);