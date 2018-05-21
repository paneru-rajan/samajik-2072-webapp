DROP TABLE if EXISTS users CASCADE ;
drop sequence if EXISTS user_sequence;
create sequence user_sequence start 5 increment 1;
create table users (id serial not null, name varchar(255), primary key (id));
insert into users (name) values ('Samajik College');
insert into users (name) values ('Rajesh Hamal');