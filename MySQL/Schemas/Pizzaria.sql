CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categorias(
id_categoria BIGINT AUTO_INCREMENT,
categoria VARCHAR(255) NOT NULL,
tamanho VARCHAR(255) NOT NULL,
PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_pizzas(
id_pizza bigint AUTO_INCREMENT,
nome VARCHAR(255) NOT NULL,
borda VARCHAR (255) NOT NULL, 
valor DECIMAL,
pagamento VARCHAR (255) NOT NULL,
id_categoria BIGINT,
PRIMARY KEY (id_pizza),
FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
);

INSERT INTO tb_categorias (categoria, tamanho)
VALUES ('Doce', 'Brotinho '),
    ('Doce', 'Média'),
    ('Tradicional', 'Pequena'),
    ('Tradicional', 'Média'),
    ('Tradicional', 'Grande');
    
SELECT * FROM tb_categorias;

INSERT INTO tb_pizzas (nome, borda, valor, pagamento, id_categoria)
VALUES ('Nutella', 'Não', 20.00, 'Dinheiro', 1),
	('Mesclado com morango', 'Não', 40.00,'Pix', 1),
    
    ('Mesclado com uvas', 'Sim', 22.00, 'Débito', 2),
    ('Paçoca', 'Sim', 10.00, 'Crédito', 2),
    
    ('Escarola', 'Sim', 8.00, 'Crédito', 3),
    ('Queijo', 'Não', 12.00, 'Débito', 3),
    
    ('4 Queijos', 'Não', 38.00, 'Crédito', 4),
    ('Portuguesa', 'Sim', 30.00, 'Crédito', 4),
    
    ('Marguerita', 'Sim', 50.00, 'Crédito', 5),
    ('Frango com Catupiry', 'Sim', 60.00, 'Débito', 5);
    
/*
Faça um SELECT que retorne todas as pizzas cujo valor seja maior do que R$ 45,00.
*/
SELECT nome, valor
FROM tb_pizzas
WHERE valor > 45.00;

/*Faça um SELECT que retorne todas as pizzas cujo valor esteja no intervalo*/
SELECT nome, valor
FROM tb_pizzas
WHERE valor BETWEEN 35 AND 60;

/*
Faça um SELECT utilizando o operador LIKE, buscando todas as pizzas que possuam a letra M no atributo nome.
*/
SELECT nome
FROM tb_pizzas
WHERE nome LIKE '%M%';

/*
Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da 
tabela tb_categorias
*/
SELECT *
FROM tb_categorias INNER JOIN tb_pizzas
ON tb_categorias.id_categoria = tb_pizzas.id_categoria;

/*
Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados 
da tabela tb_categorias, onde traga apenas as pizzas que pertençam a uma categoria específica (Exemplo: 
Todas as pizzas que são doce)
*/
SELECT *
FROM tb_pizzas INNER JOIN tb_categorias
ON tb_pizzas.id_categoria = tb_categorias.id_categoria
WHERE tb_pizzas.id_categoria BETWEEN 1 AND 2 ;

