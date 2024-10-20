# Write your MySQL query statement below

Select 

contest_id,

round(count(distinct user_id)*100 / (Select count(user_id) from Users),2)

As percentage from Register

group by contest_id

order by percentage desc, contest_id