# Write your MySQL query statement below
select c.id, c.movie, c.description, c.rating from cinema as c
where c.id not in(2,4,6,8) and c.description != 'boring'
order by c.rating desc;