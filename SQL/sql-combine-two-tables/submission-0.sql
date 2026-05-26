SELECT 
    p.first_name, 
    p.last_name,
    a.city,
    a.state
FROM person p
FULL OUTER JOIN address a 
    ON p.person_id = a.person_id
WHERE p.first_name IS NOT NULL
  AND p.last_name IS NOT NULL;