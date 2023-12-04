CREATE DATABASE db_ecommerce;
USE db_ecommerce;

CREATE TABLE tb_ecommerce(
id bigint auto_increment,
nome_produto varchar(255) not null unique,
categoria varchar(255),
quantidade int,
data_vendido date,
valor decimal not null,
PRIMARY KEY (id)
);

INSERT INTO tb_ecommerce(nome_produto, categoria, quantidade, data_vendido, valor)
VALUES("Fone de Ouvido", "Eletrônico", 1, "2023-11-01", 50.00),
("Carregador Turbo", "Eletrônico", 2, "2023-12-02", 80.00),
("Celular Moto g78 5g", "Eletrônico", 5, "2023-05-20", 1600.00),
("Aspirador",  "Eletrônico", 3, "2023-09-01", 300.00),
("Microondas", "Eletrodomésticos", 1, "2023-08-11", 450.00),
("Fogão", "Eletrodomésticos", 1, "2023-08-22", 500.00),
("Máquina de lavar louça", "Eletrodomésticos", 1, "2023-09-08", 700.00),
("Cafeteira", "Eletrodomésticos", 1, "2023-12-02", 180.00);

SELECT * FROM tb_ecommerce WHERE valor >= 500.00;
SELECT * FROM tb_ecommerce WHERE valor < 500.00;

UPDATE tb_ecommerce SET valor = 480.00 WHERE id = 5; 