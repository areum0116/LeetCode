# Write your MySQL query statement below
SELECT P.PRODUCT_NAME, S.YEAR, S.PRICE
FROM PRODUCT P
JOIN SALES S
ON P.PRODUCT_ID = S.PRODUCT_ID
