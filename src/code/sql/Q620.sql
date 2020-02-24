/*
SELECT *
FROM cinema
WHERE id % 2 = 1
    AND description NOT LIKE '%boring%'
ORDER BY rating DESC;
*/
SELECT *
FROM cinema
WHERE mod(id, 2) = 1
    AND description != 'boring'
ORDER BY rating DESC;