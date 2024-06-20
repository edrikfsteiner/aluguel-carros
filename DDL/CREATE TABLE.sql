CREATE TABLE marca (
id_marca INT identity PRIMARY KEY,
marca VARCHAR(20)
);

CREATE TABLE modelo (
id_modelo INT identity PRIMARY KEY,
modelo VARCHAR(20),
id_marca INT,
FOREIGN KEY (id_marca) REFERENCES marca(id_marca)
);

CREATE TABLE cor (
id_cor INT identity PRIMARY KEY,
cor VARCHAR(20)
);

CREATE TABLE endereco (
id_endereco INT identity PRIMARY KEY,
uf CHAR(2),
cep CHAR(15),
cidade VARCHAR(100),
bairro VARCHAR(50),
rua VARCHAR(200),
numero INT
);

CREATE TABLE cliente (
cd_cliente INT identity PRIMARY KEY,
nm_cliente VARCHAR(200),
telefone BIGINT,
email VARCHAR(200),
cpf BIGINT,
id_endereco INT,
FOREIGN KEY (id_endereco) REFERENCES endereco(id_endereco)
);

CREATE TABLE veiculos (
placa CHAR(7) PRIMARY KEY,
ano DATE,
id_cor INT,
id_modelo INT,
FOREIGN KEY (id_cor) REFERENCES cor(id_cor),
FOREIGN KEY (id_modelo) REFERENCES modelo(id_modelo)
);

CREATE TABLE forma_pagamento (
cd_forma_pagamento INT identity PRIMARY KEY,
tipo_pagamento VARCHAR(50)
);

CREATE TABLE pagamento (
id_pagamento INT identity PRIMARY KEY,
cd_forma_pagamento INT,
valor DECIMAL(11,2),
FOREIGN KEY (cd_forma_pagamento) REFERENCES forma_pagamento(cd_forma_pagamento)
);

CREATE TABLE aluguel (
id_aluguel INT identity PRIMARY KEY,
cd_cliente INT,
placa CHAR(7),
id_pagamento INT,
data_inicio DATETIME,
data_fim DATETIME,
valor DECIMAL(11,2),
FOREIGN KEY (cd_cliente) REFERENCES cliente(cd_cliente),
FOREIGN KEY (placa) REFERENCES veiculos(placa),
FOREIGN KEY (id_pagamento) REFERENCES pagamento(id_pagamento)
);