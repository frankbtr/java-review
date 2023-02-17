select *
from departments;

select *
from employees;

select *
from regions;

select employee_id, first_name, department
from employees;

select *
from employees
where department = ''Sports'';

select *
from employees
where department like ''%nit%'';

select *
from employees
where department like ''G%'';

-- show me departments which starts with G and has 4 char after that
select *
from employees
where department like ''G____'';

select *
from employees
where salary > 100000;

select *
from employees
where salary < 100000;

select *
from employees
where salary >= 100000;

select *
from employees
where salary <= 100000;

-- show me first_name, last_name, department, salary last the employee who is working in Clothing department
select first_name, last_name, department, salary
from employees
where department = ''Clothing'' and salary > 90000;

select first_name, last_name, department, salary
from employees
where department = ''Clothing'' or salary > 90000;

-- show me all employees who is making less than 40000 and working in either Clothing or Pharmacy department
select *
from employees
where salary < 40000
  and (department = ''Clothing'' or department=''Clothing'');

select *
from employees
where salary < 40000
  and department in (''Clothing'', ''Pharmacy'');

-- show me everything not belongs to Sports department
select *
from employees
where department != ''Sports'';

select *
from employees
where department <> ''Sports'';

select *
from employees
where not department = ''Sports'';

select first_name, email
from employees
where email is null;

select first_name, email
from employees
where email is not null;

select *
from employees
where salary between 80000 and 100000;

-- write a query that returns the first name and email of females that work in the tools department
-- having a salary greater than 110,000

select first_name, email
from employees
where gender = ''F'' and department=''Tools'' and salary > 110000;

select *
from employees
order by first_name;

select *
from employees
order by first_name desc;

select *
from employees
order by first_name limit 5;

select *
from employees
order by first_name fetch first 5 rows only;

-- how to see only unique department
select distinct department
from employees;

select salary as annual_salary
from employees;

-- write the query that displays the name and ages of the top 4 oldest student
select student_name, age
from students
order by age desc limit 4;

-- string manipulation
select upper(first_name), lower(last_name)
from employees;

select length(first_name), first_name
from employees;

select trim('' Hello There '');
select length(''   Hello There'');
select length(trim('' Hello There ''));

-- create full name column and display
select first_name || '' '' || employees.last_name as full_name
from employees;

-- boolean values
select first_name, salary, (salary > 140000) as GreaterThan140K
from employees
order by salary desc;

-- substring(string, start_position, length)
select substring('' this is the data '', 1, 4) as test_data;
select substring('' this is the data '' from 1 for 4) as test_data;

-- display one initials column which first_name.last_name (first_letter)
select first_name, last_name, substring(first_name, 1, 1) || ''.''||substring(last_name,1,1)
from employees;

-- String man. only for display data, not changing original table data
select department, replace(department, ''Clothing'', ''Clothes'')
from departments;

-- aggregate function
select max(salary)
from employees;

select min(salary)
from employees;

select avg(salary)
from employees;

select round(avg(salary), 1)
from employees;

select count(*)
from employees;

-- doesnt count null raws
select count(email)
from employees;

select sum(salary)
from employees
where department = ''Clothing'';

-- 1
select min(salary)
from employees;
select *
from employees
where salary = 20542;

-- 2 dynamic query, use sub query
select *
from employees
where salary = (select min(salary) from employees);

select *
from employees
where salary = (select max(salary) from employees);

select count(*)
from employees
where department = ''Pharmacy'';

select count(*)
from employees
where department = ''Clothing'';

select distinct department
from employees;

-- how many employees working for each department
select count(*), department, max(salary), min(salary), sum(salary)
from employees
group by department;

-- list the departments where they have more than 40 employees
select count(*), department
from employees
group by department
having count(*) > 40
order by department;

select count(*), department
from employees
where department <> ''Garden''
group by department
having count (*) > 40
order by department;

-- we use where clause to implement filter before we implement groups, so individual rows will be filtering
-- if we want to implement filter after groups, we need to use having clause

-- show me duplicate email domains and how many times the repeat
select count(*), substring(email, position(''@'' in email) + 1) as email_domain
from employees
where email is not null
group by email_domain
having count(*) > 1
order by count(*) desc;

-- how to find duplicate names? (IQ)
select first_name,
       salary,
       case
           when salary < 80000 then ''under paid''
           when salary > 80000 then ''paid well''
           else ''unpaid''
           end as category
from employees;


