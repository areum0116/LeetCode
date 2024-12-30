# Write your MySQL query statement below
SELECT E.NAME, B.BONUS
FROM EMPLOYEE E
LEFT JOIN BONUS B
ON E.EMPID = B.EMPID
WHERE B.BONUS IS NULL OR B.BONUS < 1000