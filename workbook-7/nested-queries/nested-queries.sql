-- Question 1
SELECT  count(*) FROM northwind.suppliers;
-- 29

-- Question 2
SELECT sum(salary) FROM northwind.employees;
-- 20362.929931640625

-- Question 3
SELECT min(unitprice) FROM northwind.products;
-- 2.5000

-- Question 4
SELECT  avg(unitprice) FROM northwind.products;
-- 28.86636364

-- Question 5
SELECT max(unitprice) FROM northwind.products;
-- 263.5000

-- Question 6
SELECT SupplierID, count(*)
FROM northwind.products
group by SupplierID;



