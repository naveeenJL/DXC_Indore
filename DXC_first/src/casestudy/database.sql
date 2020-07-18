create database casedb;
use casedb;
create table accountant(accountant_name varchar(50),
 accountant_password varchar(50), 
 accountant_email varchar(50),
 accountant_phone_number long);
 
 select * from accountant;
 create table students(student_name varchar(50), student_email varchar(50),student_course varchar(20), student_fee long, 
 student_paid long,student_due long, student_address varchar(50), student_city varchar(20), student_contactno long);
 
 select * from students;