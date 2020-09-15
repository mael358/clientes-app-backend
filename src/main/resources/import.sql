
INSERT INTO municipio (id, codigo, nombre) VALUES (1,'0101','Guatemala');
INSERT INTO municipio (id, codigo, nombre) VALUES (2,'0102','Santa Catarina Pinula');
INSERT INTO municipio (id, codigo, nombre) VALUES (3,'0103','San José Pinula');
INSERT INTO municipio (id, codigo, nombre) VALUES (4,'0104','San José del Golfo');
INSERT INTO municipio (id, codigo, nombre) VALUES (5,'0105','Palencia');
INSERT INTO municipio (id, codigo, nombre) VALUES (6,'0106','Chinautla');
INSERT INTO municipio (id, codigo, nombre) VALUES (7,'0107','San Pedro Ayampuc');
INSERT INTO municipio (id, codigo, nombre) VALUES (8,'0108','Mixco');
INSERT INTO municipio (id, codigo, nombre) VALUES (9,'0109','San Pedro Sacatepéquez');
INSERT INTO municipio (id, codigo, nombre) VALUES (10,'0110','San Juan Sacatepéquez');
INSERT INTO municipio (id, codigo, nombre) VALUES (11,'0111','San Raymundo');
INSERT INTO municipio (id, codigo, nombre) VALUES (12,'0112','Chuarrancho');
INSERT INTO municipio (id, codigo, nombre) VALUES (13,'0113','Fraijanes');
INSERT INTO municipio (id, codigo, nombre) VALUES (14,'0114','Amatitlán');
INSERT INTO municipio (id, codigo, nombre) VALUES (15,'0115','Villa Nueva');
INSERT INTO municipio (id, codigo, nombre) VALUES (16,'0116','Villa Canales');
INSERT INTO municipio (id, codigo, nombre) VALUES (17,'0117','Petapa');
INSERT INTO municipio (id, codigo, nombre) VALUES (18,'0201','Guastatoya');
INSERT INTO municipio (id, codigo, nombre) VALUES (19,'0202','Morazán');
INSERT INTO municipio (id, codigo, nombre) VALUES (20,'0203','San Agustín Acasaguastlán');
INSERT INTO municipio (id, codigo, nombre) VALUES (21,'0204','San Cristóbal Acasaguastlán');
INSERT INTO municipio (id, codigo, nombre) VALUES (22,'0205','El Jícaro');
INSERT INTO municipio (id, codigo, nombre) VALUES (23,'0206','Sansare');
INSERT INTO municipio (id, codigo, nombre) VALUES (24,'0207','Sanarate');
INSERT INTO municipio (id, codigo, nombre) VALUES (25,'0208','San Antonio la Paz');
INSERT INTO municipio (id, codigo, nombre) VALUES (26,'0301','Antigua Guatemala');
INSERT INTO municipio (id, codigo, nombre) VALUES (27,'0302','Jocotenango');
INSERT INTO municipio (id, codigo, nombre) VALUES (28,'0303','Pastores');
INSERT INTO municipio (id, codigo, nombre) VALUES (29,'0304','Sumpango');
INSERT INTO municipio (id, codigo, nombre) VALUES (30,'0305','Santo Domingo Xenacoj');
INSERT INTO municipio (id, codigo, nombre) VALUES (31,'0306','Santiago Sacatepéquez');
INSERT INTO municipio (id, codigo, nombre) VALUES (32,'0307','San Bartolomé Milpas Altas');
INSERT INTO municipio (id, codigo, nombre) VALUES (33,'0308','San Lucas Sacatepéquez');
INSERT INTO municipio (id, codigo, nombre) VALUES (34,'0309','Santa Lucía Milpas Altas');
INSERT INTO municipio (id, codigo, nombre) VALUES (35,'0310','Magdalena Milpas Altas');
INSERT INTO municipio (id, codigo, nombre) VALUES (36,'0311','Santa María de Jesús');
INSERT INTO municipio (id, codigo, nombre) VALUES (37,'0312','Ciudad Vieja');
INSERT INTO municipio (id, codigo, nombre) VALUES (38,'0313','San Miguel Dueñas');
INSERT INTO municipio (id, codigo, nombre) VALUES (39,'0314','Alotenango');
INSERT INTO municipio (id, codigo, nombre) VALUES (40,'0315','San Antonio Aguas Calientes');
INSERT INTO municipio (id, codigo, nombre) VALUES (41,'0316','Santa Catarina Barahona');
INSERT INTO municipio (id, codigo, nombre) VALUES (42,'0401','Chimaltenango');
INSERT INTO municipio (id, codigo, nombre) VALUES (43,'0402','San José Poaquil');
INSERT INTO municipio (id, codigo, nombre) VALUES (44,'0403','San Martín Jilotepeque');
INSERT INTO municipio (id, codigo, nombre) VALUES (45,'0404','Comalapa');
INSERT INTO municipio (id, codigo, nombre) VALUES (46,'0405','Santa Apolonia');
INSERT INTO municipio (id, codigo, nombre) VALUES (47,'0406','Tecpán Guatemala');
INSERT INTO municipio (id, codigo, nombre) VALUES (48,'0407','Patzún');
INSERT INTO municipio (id, codigo, nombre) VALUES (49,'0408','Pochuta');
INSERT INTO municipio (id, codigo, nombre) VALUES (50,'0409','Patzicía');


INSERT INTO clientes (municipio_id, nombre, apellido, create_at, email) VALUES (1,"Beau","Signe","2020-08-30","et.netus.et@gravida.edu");
INSERT INTO clientes (municipio_id, nombre, apellido, create_at, email) VALUES (1,"Yoshio","Raven","2019-11-08","dolor.Nulla.semper@dolordolor.edu");
INSERT INTO clientes (municipio_id, nombre, apellido, create_at, email) VALUES (1,"Cooper","Hayfa","2021-04-23","eu.nibh@Duisvolutpat.org");
INSERT INTO clientes (municipio_id, nombre, apellido, create_at, email) VALUES (255,"Leonard","Hanae","2020-02-10","odio.auctor.vitae@ornaretortor.ca");
INSERT INTO clientes (municipio_id, nombre, apellido, create_at, email) VALUES (300, "Grady","Tatum","2020-01-26","tortor.at@Nullamvelit.edu");
INSERT INTO clientes (municipio_id, nombre, apellido, create_at, email) VALUES (3, "Orlando","Carly","2020-12-15","facilisis.magna.tellus@egestasnuncsed.co.uk");
INSERT INTO clientes (municipio_id, nombre, apellido, create_at, email) VALUES (4, "Benjamin","Serina","2019-07-20","Sed.eget.lacus@sagittisDuisgravida.net");
INSERT INTO clientes (municipio_id, nombre, apellido, create_at, email) VALUES (3, "Russell","Amena","2021-04-18","et.rutrum.non@maurisipsum.com");
INSERT INTO clientes (municipio_id, nombre, apellido, create_at, email) VALUES (2, "Noble","Cameron","2019-11-12","Vivamus.nibh@eratvolutpatNulla.edu");
INSERT INTO clientes (municipio_id, nombre, apellido, create_at, email) VALUES (1, "Oliver","Nola","2021-05-27","feugiat@Nullafacilisis.ca");
INSERT INTO clientes (municipio_id, nombre, apellido, create_at, email) VALUES (8, "Beau","Signe","2020-08-30","et.netus.et@gravida.edu");
INSERT INTO clientes (municipio_id, nombre, apellido, create_at, email) VALUES (52, "Yoshio","Raven","2019-11-08","dolor.Nulla.semper@dolordolor.edu");

/*CREAMOS ALGUNOS USUARIOS Y ROLES*/
INSERT INTO `usuarios` (username, password, enabled) VALUES ('mvelasquez', '$2a$10$RducO2k5Y49L7MRKacUKqexonMYftRmJYZMCp2xSUxNR7hhMusmua', 1);
INSERT INTO `usuarios` (username, password, enabled) VALUES ('jocana', '$2a$10$esnYbZzwrVaskCZC8To/uuVSUYZWFmKsCe0Jc12eFN8G01QyzNalW', 1);

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);




