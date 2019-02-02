/*
SELECT c.class
FROM (
    SELECT DISTINCT student, class
    FROM courses
) c
GROUP BY c.class
HAVING COUNT(1) >= 5;
*/

SELECT class
FROM courses
GROUP BY class
HAVING COUNT(DISTINCT student) >= 5;