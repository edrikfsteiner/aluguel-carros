CREATE TABLE marca (
id_marca INT PRIMARY KEY,
marca VARCHAR(20)
);

CREATE TABLE modelo (
id_modelo INT PRIMARY KEY,
modelo VARCHAR(20),
id_marca INT,
FOREIGN KEY (id_marca) REFERENCES marca(id_marca)
);

CREATE TABLE cor (
id_cor INT PRIMARY KEY,
cor VARCHAR(20)
);

CREATE TABLE cliente (
cd_cliente INT PRIMARY KEY,
nm_cliente VARCHAR(200),
telefone BIGINT,
email VARCHAR(200),
cpf BIGINT
);

CREATE TABLE endereco (
cd_cliente INT,
uf CHAR(2),
cep CHAR(8),
cidade VARCHAR(100),
bairro VARCHAR(50),
rua VARCHAR(200),
numero INT,
FOREIGN KEY (cd_cliente) REFERENCES cliente(cd_cliente)
);

CREATE TABLE veiculos (
placa CHAR(7) PRIMARY KEY,
ano DATE,
id_cor INT,
id_modelo INT,
FOREIGN KEY (id_cor) REFERENCES cor(id_cor),
FOREIGN KEY (id_modelo) REFERENCES modelo(id_modelo)
);

CREATE TABLE aluguel (
id_aluguel INT PRIMARY KEY,
cd_cliente INT,
placa CHAR(7),
data_inicio DATETIME,
data_fim DATETIME,
valor DECIMAL(11,2),
FOREIGN KEY (cd_cliente) REFERENCES cliente(cd_cliente),
FOREIGN KEY (placa) REFERENCES veiculos(placa)
);

CREATE TABLE forma_pagamento (
cd_forma_pagamento INT PRIMARY KEY,
tipo_pagamento VARCHAR(20)
);

CREATE TABLE pagamento (
id_aluguel INT,
cd_forma_pagamento INT,
valor DECIMAL(11,2),
FOREIGN KEY (id_aluguel) REFERENCES aluguel(id_aluguel),
FOREIGN KEY (cd_forma_pagamento) REFERENCES forma_pagamento(cd_forma_pagamento)
);