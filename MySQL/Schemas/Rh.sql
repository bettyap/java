CREATE DATABASE db_rh;
USE db_rh;

CREATE TABLE tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
cargo varchar(255),
data_admissao date,
cpf varchar(255) unique not null,
PRIMARY KEY (id)
);

INSERT INTO tb_funcionarios(nome, cargo, data_admissao, cpf)
VALUES("Betty", "Desenvolvedora Júnior", "2023-12-01", "111.111.111-11"),
("Andre", "Desenvolvedor Pleno", "2023-11-01", "222.222.222-22"),
("Josefino", "Desenvolvedora Senior", "2023-09-01", "333.333.333-33"),
("Luiza",  "QA", "2023-09-01", "444.444.444-44"),
("Julia", "Scrum Master", "2023-08-01", "555.555.555-55");

SELECT * FROM tb_funcionarios;

ALTER TABLE tb_funcionarios ADD salario decimal not null;

UPDATE tb_funcionarios SET salario = 1800.00 WHERE id = 1; 
UPDATE tb_funcionarios SET salario = 6000.00 WHERE id = 2; 
UPDATE tb_funcionarios SET salario = 12000.00 WHERE id = 3;   
UPDATE tb_funcionarios SET salario = 9000.00 WHERE id = 4;
UPDATE tb_funcionarios SET salario = 14000.00 WHERE id = 5;  

SELECT * FROM tb_funcionarios WHERE salario >= 2000.00;

SELECT * FROM tb_funcionarios WHERE salario <= 2000.00;
