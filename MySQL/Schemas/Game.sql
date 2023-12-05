CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classes(
id_classe BIGINT AUTO_INCREMENT,
categoria VARCHAR(255) NOT NULL,
habilidade VARCHAR(255) NOT NULL,
PRIMARY KEY (id_classe)
);

CREATE TABLE tb_personagens(
id_personagem bigint AUTO_INCREMENT,
nome VARCHAR(255) NOT NULL,
nivel VARCHAR(255) NOT NULL,
vida DECIMAL,
mana DECIMAL,
id_classe BIGINT,
PRIMARY KEY (id_personagem),
FOREIGN KEY (id_classe) REFERENCES tb_classes(id_classe)
);

INSERT INTO tb_classes (categoria, habilidade)
VALUES ('Guerreiro', 'Jumping Strike'),
    ('Sacerdote', 'Holy Lighthouse'),
    ('Patrulheiro', 'Volley'),
    ('Vampiro', 'Blade Explosion'),
    ('Maga', 'Ataque de relâmpago');
    
SELECT * FROM tb_classes;
    
INSERT INTO tb_personagens (nome, nivel, vida, mana, id_classe)
VALUES ('Paladino', 150, 89, 76, 1),
	('Hexblade', 40, 80, 80, 1),
    
    ('Celestial', 250, 78, 88, 2),
    ('Oráculo', 100, 79, 90, 2),
    
    ('Sniper (Sharpshoot)', 300, 99, 65, 3),
    ('Jungle Hunter', 150, 98 , 60, 3),
    
    ('Flamebring', 220, 89, 56, 4),
    ('Phantom Master', 10, 77, 65, 4),
	
    ('Elementalista', 351, 99, 79, 5),
    ('Arcanista ou Arcanista', 14, 97, 92, 5);

/*
Faça um SELECT que retorne todes os personagens cujo poder de ataque seja maior
*/    
SELECT *
FROM tb_personagens
WHERE nivel > 200;

/*
Faça um SELECT que retorne todes os personagens cujo poder de defesa esteja no intervalo  
*/
SELECT *
FROM tb_personagens
WHERE nivel BETWEEN 10 AND 15;

/*
Faça um SELECT utilizando o operador LIKE, buscando todes os personagens que possuam a letra C no atributo nome.
*/
SELECT *
FROM tb_personagens
WHERE nome LIKE '%C%';

/*
Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens 
com os dados da tabela tb_classes.
*/
SELECT *
FROM tb_classes INNER JOIN tb_personagens
ON tb_classes.id_classe = tb_personagens.id_classe;

/* 
Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens 
com os dados da tabela tb_classes, onde traga apenas os personagens que pertençam a uma 
classe específica (Exemplo: Todes os personagens da classe dos arqueiros) 
*/
SELECT *
FROM tb_personagens INNER JOIN tb_classes
ON tb_personagens.id_classe = tb_classes.id_classe
WHERE tb_personagens.id_classe = 2;
