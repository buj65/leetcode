#update salary set sex=(case sex when 'm' then 'f' else 'm' end);
UPDATE salary
SET sex = if(sex = 'm', 'f', 'm');