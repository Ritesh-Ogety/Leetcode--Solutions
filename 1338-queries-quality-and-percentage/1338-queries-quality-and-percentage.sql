# Write your MySQL query statement below

Select query_name, 

Round(avg(rating/position),2) as quality,

Round(Avg(If(rating < 3,1,0))*100,2) as poor_query_percentage

from queries 

where query_name is NOT NULL

group by query_name;