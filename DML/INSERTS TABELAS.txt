INSERT INTO marca (id_marca, marca) VALUES 
(1, 'Ford'),
(2, 'Chevrolet'),
(3, 'Toyota'),
(4, 'Honda'),
(5, 'BMW'),
(6, 'Mercedes-Benz'),
(7, 'Volkswagen'),
(8, 'Nissan'),
(9, 'Hyundai'),
(10, 'Kia');

INSERT INTO cor (id_cor, cor) VALUES 
(1, 'Preto'),
(2, 'Branco'),
(3, 'Vermelho'),
(4, 'Azul'),
(5, 'Prata'),
(6, 'Cinza'),
(7, 'Verde'),
(8, 'Amarelo'),
(9, 'Laranja'),
(10, 'Marrom');

INSERT INTO forma_pagamento (cd_forma_pagamento, tipo_pagamento) VALUES 
(1, 'Cartão de Crédito'),
(2, 'Cartão de Débito'),
(3, 'Dinheiro'),
(4, 'Pix'),
(5, 'Boleto'),
(6, 'Transferência Bancária'),
(7, 'Cheque'),
(8, 'Vale-aluguel'),
(9, 'Paypal'),
(10, 'Criptomoeda');


INSERT INTO modelo (id_modelo, modelo, marca) VALUES 
(1, 'Fiesta', 1),
(2, 'Onix', 2),
(3, 'Corolla', 3),
(4, 'Civic', 4),
(5, 'X5', 5),
(6, 'C-Class', 6),
(7, 'Golf', 7),
(8, 'Sentra', 8),
(9, 'Elantra', 9),
(10, 'Sportage', 10);

INSERT INTO cliente (cd_cliente, nm_cliente, telefone, email, cpf) VALUES 
(1, 'João Silva', 11987654321, 'joao.silva@example.com', 12345678901),
(2, 'Maria Santos', 21987654321, 'maria.santos@example.com', 12345678902),
(3, 'Pedro Oliveira', 31987654321, 'pedro.oliveira@example.com', 12345678903),
(4, 'Ana Pereira', 41987654321, 'ana.pereira@example.com', 12345678904),
(5, 'Lucas Costa', 51987654321, 'lucas.costa@example.com', 12345678905),
(6, 'Carla Souza', 61987654321, 'carla.souza@example.com', 12345678906),
(7, 'Paulo Almeida', 71987654321, 'paulo.almeida@example.com', 12345678907),
(8, 'Fernanda Lima', 81987654321, 'fernanda.lima@example.com', 12345678908),
(9, 'Ricardo Rocha', 91987654321, 'ricardo.rocha@example.com', 12345678909),
(10, 'Juliana Ramos', 101987654321, 'juliana.ramos@example.com', 12345678910);

INSERT INTO endereco (cd_cliente, uf, cep, cidade, bairro, rua, numero) VALUES 
(1, 'SP', '01001000', 'São Paulo', 'Centro', 'Rua A', 100),
(2, 'RJ', '20040002', 'Rio de Janeiro', 'Centro', 'Rua B', 200),
(3, 'MG', '30140071', 'Belo Horizonte', 'Savassi', 'Rua C', 300),
(4, 'RS', '90020003', 'Porto Alegre', 'Moinhos de Vento', 'Rua D', 400),
(5, 'PR', '80020004', 'Curitiba', 'Batel', 'Rua E', 500),
(6, 'SC', '88020005', 'Florianópolis', 'Centro', 'Rua F', 600),
(7, 'BA', '40020006', 'Salvador', 'Pelourinho', 'Rua G', 700),
(8, 'PE', '50020007', 'Recife', 'Boa Viagem', 'Rua H', 800),
(9, 'CE', '60020008', 'Fortaleza', 'Meireles', 'Rua I', 900),
(10, 'AM', '69020009', 'Manaus', 'Centro', 'Rua J', 1000);

INSERT INTO veiculos (placa, ano, cor, modelo) VALUES 
('ABC1234', '2020-01-01', 1, 1),
('DEF5678', '2019-05-12', 2, 2),
('GHI9012', '2021-03-23', 3, 3),
('JKL3456', '2018-07-15', 4, 4),
('MNO7890', '2020-11-30', 5, 5),
('PQR1234', '2017-02-28', 6, 6),
('STU5678', '2021-09-10', 7, 7),
('VWX9012', '2019-06-25', 8, 8),
('YZA3456', '2020-10-05', 9, 9),
('BCD7890', '2018-04-14', 10, 10);

INSERT INTO aluguel (id_aluguel, cd_cliente, placa, data_inicio, data_fim, valor) VALUES 
(1, 1, 'ABC1234', '2023-01-10 10:00:00', '2023-01-15 10:00:00', 500.00),
(2, 2, 'DEF5678', '2023-02-05 09:00:00', '2023-02-10 09:00:00', 600.00),
(3, 3, 'GHI9012', '2023-03-15 11:00:00', '2023-03-20 11:00:00', 700.00),
(4, 4, 'JKL3456', '2023-04-20 08:00:00', '2023-04-25 08:00:00', 800.00),
(5, 5, 'MNO7890', '2023-05-25 12:00:00', '2023-05-30 12:00:00', 900.00),
(6, 6, 'PQR1234', '2023-06-30 07:00:00', '2023-07-05 07:00:00', 1000.00),
(7, 7, 'STU5678', '2023-07-05 06:00:00', '2023-07-10 06:00:00', 1100.00),
(8, 8, 'VWX9012', '2023-08-10 05:00:00', '2023-08-15 05:00:00', 1200.00),
(9, 9, 'YZA3456', '2023-09-15 04:00:00', '2023-09-20 04:00:00', 1300.00),
(10, 10, 'BCD7890', '2023-10-20 03:00:00', '2023-10-25 03:00:00', 1400.00);

INSERT INTO pagamento (id_aluguel, cd_forma_pagamento, valor) VALUES 
(1, 1, 500.00),
(2, 2, 600.00),
(3, 3, 700.00),
(4, 4, 800.00),
(5, 5, 900.00),
(6, 6, 1000.00),
(7, 7, 1100.00),
(8, 8, 1200.00),
(9, 9, 1300.00),
(10, 10, 1400.00);