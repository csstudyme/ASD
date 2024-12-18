CREATE TABLE student1 (
rollno NUMBER,
name VARCHAR2(10),
subject VARCHAR2(7),
marks NUMBER
);

INSERT INTO student1 VALUES (10, 'Rohan', 'ADTA', 67);
INSERT INTO student1 VALUES (11, 'Mohan', 'ADS', 57);
INSERT INTO student1 VALUES (12, 'Rishi', 'MFCS', 47);
INSERT INTO student1 VALUES (13, 'Kavya', 'SPM', 38);
INSERT INTO student1 VALUES (14, 'Neha', 'MFCS', 37);
INSERT INTO student1 VALUES (15, 'Mitali', 'AWT', 35);


Rank and Dense_rank

select rollno,name,marks,subject,rank() over(partition by subject order by marks) as
"rank" from student;

select rollno,name,subject,marks,subject,rank() over(partition by subject order by
marks desc) as "rank" from student;

First and last

select rollno,name,subject,marks,max(marks) keep(dense_rank first order by marks)
over(partition by subject) as "highest" from student order by subject marks;

select rollno,name,subject,marks,min(marks) keep(dense_rank first order by marks)
over(partition by subject) as "lowest" from student1 order by subject,marks;

SELECT rollno, name, marks, subject, MIN(marks) KEEP (DENSE_RANK
FIRST ORDER BY marks) OVER (PARTITION BY subject) AS "lowest", MIN(marks)
KEEP (DENSE_RANK LAST ORDER BY marks) OVER (PARTITION BY subject) AS "highest"FROM student1ORDER BY subject, marks;









>>>CREATE TABLE emp (
empid INT,
empname VARCHAR(10),
dept VARCHAR(20),
salary INT
);
INSERT INTO emp VALUES (1, 'Ram', 'marketing', 10000);
INSERT INTO emp VALUES (2, 'Nita', 'marketing', 103000);
INSERT INTO emp VALUES (3, 'Raj', 'marketing', 10500);
INSERT INTO emp VALUES (4, 'Shilpa', 'IT', 10500;
INSERT INTO emp VALUES (5, 'Prapti', 'IT', 11100);
INSERT INTO emp VALUES (6, 'Mitali', 'sales', 12100);
INSERT INTO emp VALUES (7, 'Moksh', 'sales', 13100);

select*from emp;

Lag and lead

select mpid,empname,dept,salary,lag(salary,1,0)
2 over(partition by dept order by salary) as "previous" from emp;

select mpid,empname,dept,salary,lead(salary,1,0)
2 over(partition by dept order by salary) as "previous" from emp;


Roll Up and Cube

ALTER TABLE student1 ADD Year VARCHAR(20);

insert into student1 values(16,’Ayush,’MAFS’,56,’FY’);
insert into student1 values(17,’Rutuja’,’SPM’,68,’FY’);
insert into student values(18,’Sakshi’,’AWT’,68,’FY’);
insert into student1 values(19,’Mahesh’,’ADTA’,67,’SY’);

select*from student1;

select year,rollno,sum(marks) from student1 group by cube(year,rollno)
2 order by year,rollno;

select year,rollno,sum(marks) from student1 group by rollup(year,rollno)
2 order by year,rollno;


Previous and Next
SELECT mpid, salary, dept,
2 FIRST_VALUE(salary) OVER (ORDER BY salary ROWS BETWEEN 1
PRECEDING AND CURRENT ROW) AS "previous",
3 LAST_VALUE(salary) OVER (ORDER BY salary ROWS BETWEEN CURRENT
ROW AND 1 FOLLOWING) AS "next"
4 FROM emp;


Range and List

CREATE TABLE sales_range2(
Salesman_id NUMBER(5),
Salesman_name VARCHAR(30),
Sales_amount NUMBER(10),
Sales_date DATE)
PARTITION BY RANGE (sales_date)(
PARTITION sales_janVALUES LESS THAN(TO_DATE(‘31/01/2000’,’DD/MM/YYYY’)),
PARTITION sales_feb VALUES LESS THAN(TO_DATE(‘28/02/2000’,’DD/MM/YYYY’)),
PARTITION sales_mar VALUES LESS THAN(TO_DATE(‘31/03/2000’,’DD/MM/YYYY’))
PARTITION sales_apr VALUES LESS THAN
(TO_DATE(‘30/04/2000’,’DD/MM/YYYY))),

insert into sales_range2
values(1,’Ram’,7000,to_date(‘15/01/2000’,’DD/MM/YYYY’));
insert into sales_range2
values(2,’kiran’,12000,to_date(‘12/04/2000’,’DD/MM/YYYY’));
insert into sales_range2
values(3,’ankit’,15000,to_date(‘12/03/2000’,’DD/MM/YYYY));
insert into sales_range2
values(4,’nehali’,16000,todate(‘18/02/2000’,’DD/MM/YYYY’)),

select*from sales_range2
2 partition(sales_jan2000);

List Partition

CREATE TABLE sale_list1(
Salesman_id NUMBER(5),
Salesman_name VARCHAR(30),
Sales_state VARCHAR2(20),
Sales_amount NUMBER(10),
Sales_date DATE)
PARTITION BY LIST (sales_state)(
PARTITION sales_west VALUES (‘California’,’Hawai’),
PARTITION sales_east VALUES(‘New York’,’Virginia’,Florida’),
PARTITION sales_central VALUES(‘Texas’,’Illinois’),
PARTITION sales_other VALUES(DEFAULT));

insert into sale_list1
values(101,’Rajiv’,’California’,2000,to_date(‘12/10/2023’,’DD/MM/YYYY’));
insert into sale_list1
values(102,’Rajani’,’Texas’,7000,to_date(‘12/10/2023’,’DD/MM/YYYY’));
insert into sale_list1 values(103,’Vimal’,’New
York’,7000,to_date(‘14/11/2023’,’DD/MM/YYYY’));
insert into sale_list1 values(104,’Vimal’,’New
York’,9000,to_date(‘10/09/2000’,’DD/MM/YYYY’));

select*from sale_list1;

select*from sale_list1 PARTITION (sales_east);

select*from sale_list1 PARTITION (sales_west);

select*from sale_list1 PARTITION (sales_central);



Implementation of, Abstract Data Type

create type type_name As object(fname varchar2(20),mname varchar2(20),lname
varchar2(20))/

create type type_address As object(street varchar2(20),city varchar2(20),pincode
varchar2(20))/

create table table2(c_id number(5) primary key,c_name type_name,c_add
type_address,c_phone number(10));

insert into table2 values(1,type_name('Raj','M','Nair'),
2 type_address('Kalina','Mumbai',123456),8789978876);

insert into table2 values(2,type_name('Ritesh','M1','Shaf'),
2 type_address('Colaba','Mumbai',123456),568786778);

