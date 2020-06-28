create database librarymgmt;
use librarymgmt;
show databases;
show tables;
create table user (id varchar(20) PRIMARY KEY, name varchar(20), email varchar(20), mobile varchar(20));
create table book (id varchar(20) PRIMARY KEY, title varchar(20), author varchar(20), subject varchar(20), isbn varchar(20));
create table issuedbooks (id int PRIMARY KEY, userId int, bookId int, status varchar(20));
select * from user;
select * from book;
select * from issuedbooks;


