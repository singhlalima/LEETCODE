# Write your MySQL query statement below
select  e.name from employee as e join employee as e2 on e.id = e2.managerid 
group by e.id, e.name 
having count(e2.id) >=5;