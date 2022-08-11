DROP DATABASE IF EXISTS JOGAE;
CREATE DATABASE JOGAE;

USE JOGAE;

/*
	Significado das siglas:
	ID: Identification
	NM: Name
	FL: Flag
	DT: Date
	DH: Date and Hour
	CD: Code Date
*/

-- TABELA STATUS DE CADASTRO
CREATE TABLE STATUS_CADASTRO (
	ID_STATUS_CADASTRO INT NOT NULL,
	NM_STATUS_CADASTRO CHAR(10) NOT NULL,
    CONSTRAINT PK_STATUS_CADASTRO PRIMARY KEY (ID_STATUS_CADASTRO)
);
-- TABELA FUNCAO
CREATE TABLE FUNCAO (
	ID_FUNCAO INT NOT NULL AUTO_INCREMENT,
	NM_FUNCAO CHAR(25) NOT NULL,
    CONSTRAINT PK_FUNCAO PRIMARY KEY(ID_FUNCAO)
);
-- TABELA JOGADOR
CREATE TABLE JOGADOR (
	NM_NICK VARCHAR(60) NOT NULL,
    VL_JOGADOR INT NOT NULL,
    RANK_JOGADOR INT NOT NULL,
    CONSTRAINT PK_JOGADOR PRIMARY KEY(NM_NICK)
);
-- TABELA GENERO_JOGO
CREATE TABLE GENERO_JOGO (
	ID_GENERO_JOGO INT NOT NULL,
	NM_GENERO_JOGO VARCHAR(40) NOT NULL,
    VL_GENERO INT NOT NULL,
    CONSTRAINT PK_GENERO_JOGO PRIMARY KEY(ID_GENERO_JOGO)
);
-- TABELA JOGO
-- nm_jogo (escolhemos uns 50 jogos dentro dos gêneros)
CREATE TABLE JOGO(
	ID_JOGO INT NOT NULL AUTO_INCREMENT,
	NM_JOGO VARCHAR(60) NOT NULL,
	ID_GENERO_JOGO INT,
    VL_JOGO INT NOT NULL,
    RANK_JOGO INT NOT NULL,
	CONSTRAINT FK_GENERO_JOGO_JOGO FOREIGN KEY (ID_GENERO_JOGO) REFERENCES GENERO_JOGO (ID_GENERO_JOGO),
    CONSTRAINT PK_JOGO PRIMARY KEY(ID_JOGO)
);


-- INCLUSAO DE DADOS NA TABELA DE GENERO DE JOGO
INSERT INTO GENERO_JOGO (ID_GENERO_JOGO, NM_GENERO_JOGO) VALUES
	(1, 'AÇÃO'),
	(2, 'ARCADE'),
	(3, 'AVENTURA'),
	(4, 'CITY-BUILDING'),
	(5, 'ESTRATÉGIA'),
	(6, 'JOGO DE CARTAS'),
	(7, 'JOGOS DE SOBREVIVÊNCIA'),
	(8, 'JOGOS EDUCATIVOS'),
	(9, 'JOGOS MUSICAIS'),
	(10, 'LIFE SIM'),
	(11, 'MOBA - MULTIPLAYER ONLINE BATTLE ARENA'),
	(12, 'PLATAFORMA'),
	(13, 'PUZZLES'), 
	(14, 'RPG'),
	(15, 'SANDBOX'),
	(16, 'JOGOS DE TIRO'),
	(17, 'SIMULAÇÃO'),
	(18, 'TERROR');

-- INCLUSAO DE DADOS NA TABELA DE FUNCAO
INSERT INTO FUNCAO (ID_FUNCAO, NM_FUNCAO) VALUES
		(1, 'MASTER JOGAE'),
		(2, 'ADMINISTRADOR JOGAE'),
		(3, 'JOGADOR AMADOR'),
		(4, 'JOGADOR SEMIPROFISSIONAL'),
		(5, 'JOGADOR PROFISSIONAL');
        
-- INCLUSAO DE DADOS NA TABELA DE STATUS
INSERT INTO STATUS_CADASTRO (ID_STATUS_CADASTRO, NM_STATUS_CADASTRO) VALUES 
	(1, 'ATIVO'),
	(2, 'INATIVO'),
	(3, 'BLOQUEADO'),
	(4, 'CANCELADO');

-- TABELA GRUPO
CREATE TABLE GRUPO (
	ID_GRUPO INT NOT NULL,
	NM_GRUPO VARCHAR(40) NOT NULL, 
	ID_JOGO INT,
	ID_GENERO_JOGO INT, 
	DH_CRIACAO DATETIME,  
	DH_ATUALIZACAO DATETIME,
	DH_EXCLUSAO DATETIME,
    CONSTRAINT FK_JOGO_GRUPO FOREIGN KEY (ID_JOGO) REFERENCES JOGO (ID_JOGO),
    CONSTRAINT FK_GENERO_JOGO_GRUPO FOREIGN KEY  (ID_GENERO_JOGO) REFERENCES GENERO_JOGO (ID_GENERO_JOGO),
    CONSTRAINT PK_GRUPO PRIMARY KEY(ID_GRUPO)
);


-- TABELA COMUNIDADE
CREATE TABLE COMUNIDADE (
	ID_COMUNIDADE INT NOT NULL, 
	NM_COMUNIDADE VARCHAR(60),
	ID_JOGO INT, 
	ID_GENERO_JOGO INT, 
	DH_CRIACAO DATETIME NOT NULL, 
	DH_ATUALIZACAO DATETIME, 
	DH_EXCLUSAO DATETIME,
    CONSTRAINT FK_JOGO_COMUNIDADE FOREIGN KEY (ID_JOGO) REFERENCES JOGO (ID_JOGO),
    CONSTRAINT FK_GENERO_COMUNIDADE FOREIGN KEY  (ID_GENERO_JOGO) REFERENCES GENERO_JOGO (ID_GENERO_JOGO),
    CONSTRAINT PK_COMUNIDADE PRIMARY KEY(ID_COMUNIDADE)
);

-- TABELA CADASTRO_USUARIO
CREATE TABLE CADASTRO_USUARIO (
	ID_USUARIO INT NOT NULL,
	ID_STATUS_CADASTRO INT NOT NULL,
	NM_LOGIN VARCHAR(40) NOT NULL,
	NM_SENHA VARCHAR(40) NOT NULL,
	NM_USUARIO VARCHAR(60) NOT NULL,
	CD_EMAIL VARCHAR(40) NOT NULL,
	ID_FUNCAO INT NOT NULL,
	FL_ATUALIZA_DADOS BIT DEFAULT 0 NOT NULL,
	DT_NASCIMENTO DATE NOT NULL,
	DH_INCLUSAO DATETIME NOT NULL,
	DH_ATUALIZACAO DATETIME NOT NULL,
	DH_EXCLUSAO DATETIME NOT NULL,
	DH_ULTIMO_ACESSO DATETIME,
	DH_ATUALIZACAO_SENHA DATETIME,
	NR_TENTATIVA_ACESSO INT,
	ID_GRUPO INT NOT NULL,
	ID_COMUNIDADE INT NOT NULL,
    NM_NICK VARCHAR(30) NOT NULL,
    CONSTRAINT FK_NICK_CADASTRO_USUARIO FOREIGN KEY (NM_NICK) REFERENCES JOGADOR(NM_NICK),
	CONSTRAINT FK_STATUS_CADASTRO_CADASTRO_USUARIO FOREIGN KEY (ID_STATUS_CADASTRO) REFERENCES STATUS_CADASTRO (ID_STATUS_CADASTRO),
	CONSTRAINT FK_FUNCAO_CADASTRO_USUARIO FOREIGN KEY (ID_FUNCAO) REFERENCES FUNCAO (ID_FUNCAO),
	CONSTRAINT FK_GRUPO_CADASTRO_USUARIO FOREIGN KEY (ID_GRUPO) REFERENCES GRUPO (ID_GRUPO),
	CONSTRAINT FK_COMUNIDADE_CADASTRO_USUARIO FOREIGN KEY (ID_COMUNIDADE) REFERENCES COMUNIDADE (ID_COMUNIDADE),
    CONSTRAINT PK_CADASTRO_USUARIO PRIMARY KEY(ID_USUARIO)
);

-- TABELA MATCH DE JOGADORES
CREATE TABLE MATCH_JOGADORES (
	ID_MATCH INT NOT NULL AUTO_INCREMENT,
	ID_USUARIO_PRIMARIO INT NOT NULL, 
    ID_USUARIO_MATCH INT NOT NULL,
	DH_MATCH DATETIME,
	CONSTRAINT CADASTRO_USUARIO_PRIMARIO_MATCH_JOGADORES FOREIGN KEY (ID_USUARIO_PRIMARIO) REFERENCES CADASTRO_USUARIO(ID_USUARIO),
    CONSTRAINT CADASTRO_USUARIO_MATCH_MATCH_JOGADORES FOREIGN KEY (ID_USUARIO_MATCH) REFERENCES CADASTRO_USUARIO(ID_USUARIO),
    CONSTRAINT PK_MATCH_JOGADORES PRIMARY KEY(ID_MATCH)
);

CREATE TABLE PRATELEIRA(
	ID_PRATELEIRA INT NOT NULL AUTO_INCREMENT,
    ID_USUARIO INT NOT NULL,
    ID_JOGO INT NOT NULL,
    CONSTRAINT PK_PRATELEIRA PRIMARY KEY(ID_PRATELEIRA),
    CONSTRAINT FK_USARIO_PRATELEIRA FOREIGN KEY (ID_USUARIO) REFERENCES CADASTRO_USUARIO(ID_USUARIO),
    CONSTRAINT FK_JOGO_PRATELEIRA FOREIGN KEY(ID_JOGO) REFERENCES JOGO(ID_JOGO)
);


