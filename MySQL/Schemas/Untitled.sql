-- Criar o banco de dados
CREATE DATABASE db_quitanda;

CREATE TABLE tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
quantidade int ,
data_validade date,
preco decimal not null,
PRIMARY KEY (id)
);

INSERT INTO tb_produtos(nome, quantidade, data_validade, preco)
VALUES("tomato", 100, "2023-12-20", 8.00);

INSERT INTO tb_produtos(nome, quantidade, data_validade, preco)
VALUES("banana", 100, "2023-12-20", 11.00),
("laranja", 100, "2023-12-20", 15.00),
("uva", 100, "2023-12-20", 30.00),
("melancia", 100, "2023-12-10", 8.00),
("goiaba", 100, "2023-12-20", 22.00);


SELECT * FROM tb_produtos;

ALTER TABLE tb_produtos MODIFY preco decimal(6,2);

UPDATE tb_produtos SET preco = 11.90 WHERE id = 4;

UPDATE tb_produtos SET preco = 11.90;

SET SQL_SAFE_UPDATES = 0;


DELETE FROM tb_produtos WHERE id = 3;

ALTER TABLE tb_produtos ADD descricao varchar(255);

ALTER TABLE tb_produtos DROP descricao;

ALTER TABLE tb_produtos CHANGE nome nome_produto varchar(255);

SELECT nome_produto, preco FROM tb_produtos;

SELECT * FROM tb_produtos WHERE id = 1;

SELECT * FROM tb_produtos WHERE data_validade = "2023-12-20";

SELECT * FROM tb_produtos WHERE preco > 15.00;

SELECT * FROM tb_produtos WHERE preco > 10 OR nome_produto = "maça" ;

SELECT * FROM tb_produtos WHERE preco > 15.00 AND nome_produto = "maça" ;

SELECT nome, CONCAT('R$ ',FORMAT(preco, 2, 'pt_BR')) AS preco FROM tb_produtos;

SELECT nome_produto, DATE_FORMAT(date_validade, '%d/%m/%Y') AS Data_Validade;

DROP database db_quitanda;