--�����û�������ȨDBAȨ��
create user students identified by 1234;
grant connect,resource,dba to students;

create table STUDENTS(
       S_NUMBER int primary key,
       S_NAME varchar(20) not null unique,
       S_GENDER varchar(20) not null,
       S_AGE int not null,
       S_MAJOR varchar(20) not null
);

create sequence students_seq

insert into STUDENTS values(students_seq.nextval,'����','��',22,'JAVA')

select S_NUMBER, S_NAME, S_GENDER, S_AGE, S_MAJOR from STUDENTS