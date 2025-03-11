# Write your MySQL query statement below
SELECT MAX(NUM) NUM
FROM (
    SELECT NUM
    FROM MYNUMBERS
    GROUP BY NUM
    HAVING COUNT(NUM)=1
) A
