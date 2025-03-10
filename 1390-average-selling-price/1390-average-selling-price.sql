# Write your MySQL query statement below
SELECT P.product_id, IFNULL(ROUND(SUM(U.UNITS * P.PRICE) / SUM(U.UNITS), 2), 0) average_price
FROM PRICES P
LEFT JOIN UNITSSOLD U
ON P.PRODUCT_ID = U.PRODUCT_ID AND
U.PURCHASE_DATE BETWEEN START_DATE AND END_DATE
GROUP BY P.PRODUCT_ID