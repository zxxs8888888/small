CREATE DATABASE select_course;
use select_course;
CREATE table grades(
num varchar(12) not null,
cid varchar(12) not null,
grade varchar(12) not null
)
CREATE table courses(
c_id varchar(12) not null,
c_name varchar(12) not null

)CREATE table users(
num varchar(12) not null,
pwd varchar(12) not null,
name varchar(12) not null,
type int not null
)