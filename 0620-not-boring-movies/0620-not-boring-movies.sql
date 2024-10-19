# Write your MySQL query statement below

Select * from Cinema as c
where c.id %2!=0 And c.description !='boring'
order by rating desc;
