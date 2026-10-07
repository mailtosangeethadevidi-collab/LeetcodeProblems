# Write your MySQL query statement below
SELECT e1.name as Employee 
  from Employee e1
  where 
    e1.salary >(
    Select e2.salary from Employee e2  where (e2.id=e1.managerId)
  );