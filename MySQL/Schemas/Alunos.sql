CREATE DATABASE db_escola;
USE db_escola;

CREATE TABLE tb_alunos(
id bigint auto_increment,
nome_aluno varchar(255) not null,
periodo varchar(255),
data_nascimento date,
nota decimal not null,
PRIMARY KEY (id)
);

INSERT INTO tb_alunos(nome_aluno, periodo, data_nascimento, nota)
VALUES("Betty", "Matutino", "1998-12-01", 7.0),
("Andre", "Matutino", "1999-06-03", 8.5),
("Josefino", "Vespertino", "2004-09-01", 5.6),
("Luiza",  "Vespertino", "2017-09-21", 6.0),
("Julia", "Vespertino", "2015-03-01", 4.0);

SELECT * FROM tb_alunos WHERE nota >= 7.0;
SELECT * FROM tb_alunos WHERE nota < 7.0;

UPDATE tb_alunos SET nota = 8 WHERE id = 2; 
UPDATE tb_alunos SET nota = 6 WHERE id = 3; 