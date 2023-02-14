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






