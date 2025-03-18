# Write your MySQL query statement below
SELECT X, Y, Z, IF(
    (X>=Y AND X>=Z AND X < Y+Z) OR (Y>=X AND Y>=Z AND Y < X+Z) OR (Z>=X AND Z>=Y AND Z < X+Y), 'Yes', 'No'
) TRIANGLE
FROM TRIANGLE
