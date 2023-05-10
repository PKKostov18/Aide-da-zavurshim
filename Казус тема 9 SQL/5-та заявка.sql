SELECT TOP 10 
e.[FirstName], 
e.[LastName].
t.[Name] AS [Town], 
a.[AddressText] AS [Address] 
FROM Employees AS e
INNER JOIN Addresses AS a 
ON e.AddressID = a.AddressID 
INNER JOIN Towns AS t 
ON a.TownID = t.TownID 
ORDER BY e.FirstName ASC