# Write your MySQL query statement below
select name from customer as n where n.referee_id != 2 or n.referee_id is null;