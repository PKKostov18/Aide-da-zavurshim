SELECT TOP 5
e.FirstName,
e.HireDate
FROM Employees AS e
WHERE HireDate > '06-02-2000'
ORDER BY FirstDate ASC
