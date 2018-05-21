DROP TABLE if EXISTS users CASCADE ;
drop sequence user_sequence;
create table users (id bigserial PRIMARY KEY , name varchar(255) not NULL);
create sequence user_sequence start with 5 increment by 1;

insert into users (name) values ('Samajik College');
insert into users (name) values ('Rajesh Hamal');