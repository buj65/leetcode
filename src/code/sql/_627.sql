#update salary set sex=(case sex when 'm' then 'f' else 'm' end);
UPDATE salary
SET sex = CASE sex
    WHEN 'm' THEN 'f'
    ELSE 'm'
END;