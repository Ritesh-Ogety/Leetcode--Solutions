# Write your MySQL query statement below

SELECT x.customer_id, count(x.customer_id) AS count_no_trans

FROM Visits AS x

Where NOT EXISTS(
    SELECT 1
    FROM Transactions y
    WHERE x.visit_id=y.visit_id
)
GROUP BY customer_id;