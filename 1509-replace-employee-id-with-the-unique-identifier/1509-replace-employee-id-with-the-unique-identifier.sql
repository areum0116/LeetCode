SELECT UNIQUE_ID, NAME
FROM EMPLOYEES E
LEFT JOIN EMPLOYEEUNI U
ON E.ID = U.ID