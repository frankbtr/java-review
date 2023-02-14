select * from departments;

select * from employees;

select * from regions;

select employee_id, first_name, department from employees;

select * from employees where department='Sports';

select * from employees where department like '%nit%';

select * from employees where department like 'G%';

-- show me departments which starts with G and has 4 char after that
select * from employees where department like 'G____';

select * from employees where salary > 100000;

select * from employees where salary < 100000;

select * from employees where salary >= 100000;

select * from employees where salary <= 100000;

-- show me first_name, last_name, department, salary last the employee who is working in Clothing department
select first_name, last_name, department, salary
from employees where department='Clothing' and salary > 90000;

select first_name, last_name, department, salary
from employees where department='Clothing' or salary > 90000;

-- show me all employees who is making less than 40000 and working in either Clothing or Pharmacy department
select * from employees where salary < 40000 and (department='Clothing' or department='Clothing');

select * from employees where salary < 40000 and department in ('Clothing', 'Pharmacy');

-- show me everything not belongs to Sports department
select * from employees where department != 'Sports';

select * from employees where department <> 'Sports';

select * from employees where not department = 'Sports';

select first_name, email from employees where email is null;

select first_name, email from employees where email is not null;

select * from employees where salary between 80000 and 100000;

-- write a query that returns the first name and email of females that work in the tools department
-- having a salary greater than 110,000

select first_name, email from employees where gender='F' and department='Tools' and salary > 110000;

select * from employees order by first_name;

select * from employees order by first_name desc;

select * from employees order by first_name limit 5;

select * from employees order by first_name fetch first 5 rows only;

-- how to see only unique department
select distinct department from employees;

select salary as annual_salary from employees;

-- write the query that displays the name and ages of the top 4 oldest student
select student_name, age from students order by age desc limit 4;

-- string manipulation
select upper(first_name), lower(last_name) from employees;

select length(first_name), first_name from employees;

select trim('   Hello There');
select length('   Hello There');
select length(trim('   Hello There'));

-- create full name column and display
select first_name||' '||employees.last_name as full_name from employees;

-- boolean values
select first_name,salary, (salary > 140000) as GreaterThan140K from employees order by salary desc;

-- substring(string, start_position, length)
select substring('this is the data', 1, 4) as test_data;
select substring('this is the data' from 1 for 4) as test_data;

-- display one initials column which first_name.last_name (first_letter)













