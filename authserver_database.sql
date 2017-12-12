-- cria o banco de dados e o usuario da aplicação
CREATE DATABASE authserver;
CREATE USER 'authserver'@'localhost' IDENTIFIED BY '123';
GRANT ALL PRIVILEGES ON authserver.* TO 'authserver'@'localhost';

-- acessa o banco de dados recem criado
use authserver;

-- cria estrutura do banco de dados
create table usuario(
	id bigint auto_increment primary key,
	primeiro_nome varchar(100),
	ultimo_nome varchar(100),
	email varchar(100),
	username varchar(200),
    dt_cadastro timestamp,
	password varchar(240)
);

create table role(
	id bigint auto_increment primary key,
	name varchar(100)
);

create table usuario_role(
	id_usuario_role bigint auto_increment primary key,
	usuario_id bigint references usuario(id),
	role_id bigint references role(id)
);

INSERT INTO usuario (Id, primeiro_Nome, ultimo_Nome, email, dt_Cadastro, username, password)
VALUES (1, 'Dionatan', 'Ribeiro', 'dionatan@gmail.com', sysdate(), 'dionatangr', '$2a$12$wqt9dOKgklmUmBirY0iiaOEwU090r.eD60MCBeVICn15FO8RkC376');

INSERT INTO usuario (Id, primeiro_Nome, ultimo_Nome, email, dt_Cadastro, username, password)
VALUES (2, 'Carlos', 'Nonnematcher', 'losfueras@gmail.com', sysdate(), 'carlos', '$2a$12$wqt9dOKgklmUmBirY0iiaOEwU090r.eD60MCBeVICn15FO8RkC376');

INSERT INTO role (Id, name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO role (Id, name) VALUES (2, 'ROLE_USER');
INSERT INTO role (Id, name) VALUES (3, 'ROLE_DBA');

INSERT INTO usuario_role (ID_Usuario_Role, Role_Id, Usuario_Id) VALUES (1, 1, 1);
INSERT INTO usuario_role (ID_Usuario_Role, Role_Id, Usuario_Id) VALUES (2, 3, 1);
INSERT INTO usuario_role (ID_Usuario_Role, Role_Id, Usuario_Id) VALUES (3, 2, 2);