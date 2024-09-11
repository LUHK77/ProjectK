CREATE DATABASE kraken_DATABASE
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

USE kraken_DATABASE;

create table games
(
id int auto_increment not null,
name varchar(60) not null,
description text,
image_path varchar(80),
release_date date,
developer_id int,
primary key(id)
) default charset = utf8mb4;

create table developer
(
id int auto_increment not null,
name varchar(40),
image_path varchar(80),
primary key(id)
) default charset = utf8mb4;