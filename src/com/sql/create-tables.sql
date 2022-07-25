/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  alfreding0
 * Created: Jul 2, 2022
 */

-- Base de datos
-- db_clinica

CREATE TABLE secretaria(
    id serial PRIMARY KEY,
    nombre_completo varchar(50) NOT null,
    celular varchar(12) NOT null,
    direccion varchar(200) NOT null
);

CREATE TABLE cirugia(
    id serial PRIMARY KEY,
    fecha date NOT null,
    hora time NOT null,
    nro_sala int NOT null,

    secretaria_id int NOT null,
    FOREIGN KEY (secretaria_id) REFERENCES secretaria (id)
);

CREATE TABLE medico(
    id serial PRIMARY KEY,
    codigo_interno varchar(10) NOT null,
    nombres varchar(20) NOT null,
    apellidos varchar(20) NOT null,
    ci varchar(12) NOT null,
    celular varchar(12) NOT null,
    direccion varchar(200) NOT null
);

CREATE TABLE cirugia_medico(
    id serial PRIMARY KEY,
    
    cirugia_id int NOT null,
    FOREIGN KEY (cirugia_id) REFERENCES cirugia (id),
    
    medico_id int NOT null,
    FOREIGN KEY (medico_id) REFERENCES medico (id)
);
