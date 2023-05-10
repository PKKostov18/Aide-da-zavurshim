SELECT e.FirstName,
e.MiddleName,
e.LastName
FROM Employees AS e
WHERE e.FirstName LIKE 'a%'

UNION

(
SELECT em.FirstName,
em.MiddleName,
em.LastName
FROM Employees AS em
WHERE em.MiddleName LIKE 'F'
)

ORDER BY e.MiddleName ASC