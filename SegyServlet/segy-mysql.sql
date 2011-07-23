
create database if not exists segy;

use segy;

drop table if exists dataset;
create table dataset (
	id int primary key auto_increment, file varchar(255)
);

drop table if exists trace;
create table trace (
	id bigint primary key auto_increment, dataset_id int , start bigint, size int
);

drop table if exists field_file;
create_table field_file (
	dataset_id int, field_file_number int);
	
	
drop table if exists source_point;
create_table source_point (
	id bigint primary key auto_increment, dataset_id int, number int);
	
	
drop table if exists receiver_point;
create_table receiver_point (
	id bigint primary key auto_increment, dataset_id int, number int);
	
	
	