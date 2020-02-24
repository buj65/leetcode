/*
[Err] 1093 - You can't specify target table 'Person' for update in FROM clause
同一张表，不能把select出来的结果直接作为DML语句的条件，应该再select一遍把结果作为中间表使用
*/
DELETE FROM Person
WHERE id NOT IN (
        SELECT p.id
        FROM (
            SELECT MIN(Id) AS id
            FROM Person
            GROUP BY Email
        ) p
    );