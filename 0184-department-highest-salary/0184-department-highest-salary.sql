select d.name as Department , e.name as Employee ,e.salary as Salary from
Employee e join Department d on e.departmentId=d.id
where e.salary IN (
    select MAX(salary) from Employee where departmentId=e.departmentId
) 