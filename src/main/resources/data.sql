INSERT INTO Usuario (Id, primeiro_Nome, ultimo_Nome, email, dt_Cadastro, username, password)
VALUES (1, 'Dionatan', 'Ribeiro', 'dionatan@gmail.com', sysdate, 'dionatangr', '$2a$10$NapJsrmg73ZjuxoMXO6UMOzTfvjXkNP7clpRbjNtu9mEzJmn.qmv.');

INSERT INTO Usuario (Id, primeiro_Nome, ultimo_Nome, email, dt_Cadastro, username, password)
VALUES (2, 'Carlos', 'Nonnematcher', 'losfueras@gmail.com', sysdate, 'carlos', '$2a$10$NapJsrmg73ZjuxoMXO6UMOzTfvjXkNP7clpRbjNtu9mEzJmn.qmv.');

INSERT INTO Role (Id, name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO Role (Id, name) VALUES (2, 'ROLE_USER');
INSERT INTO Role (Id, name) VALUES (3, 'ROLE_DBA');

INSERT INTO Usuario_Role (ID_Usuario_Role, Role_Id, Usuario_Id) VALUES (1, 1, 1);
INSERT INTO Usuario_Role (ID_Usuario_Role, Role_Id, Usuario_Id) VALUES (2, 3, 1);
INSERT INTO Usuario_Role (ID_Usuario_Role, Role_Id, Usuario_Id) VALUES (3, 2, 2);