create user user1;
create database testdb;
use testdb;

create table if not exists authors (
    id int primary key,
    name varchar(25)
);

insert into authors(id, name) values(1, 'Ping');
insert into authors(id, name) values(2, 'Max');
insert into authors(id, name) values(3, 'Pup');
insert into authors(id, name) values(4, 'Dev');
insert into authors(id, name) values(5, 'Tee');
insert into authors(id, name) values(6, 'Tep');

grant all on authors to user1;
