--#1
SELECT * FROM Customers;

--#2
SELECT DISTINCT country_region FROM Customers;

--#3
SELECT * FROM Customers
WHERE last_name Like 'B%';
--#4
SELECT * FROM orders LIMIT 100;
--#5
SELECT * FROM Customers
WHERE zip_postal_code in (1010,3012,12209,05023);
--#6
SELECT * FROM northwind.orders
where ship_country_region is not null;
--#7
SELECT * FROM customers
order by country_region, city;
--#8
INSERT INTO Customers (last_name, first_name, Address, City, state_province, country_region)
VALUES ('Hobson','James ','8866 aurora','Detroit','MI','USA');

--#9
UPDATE orders
SET ship_zip_postal_code='97201'
WHERE ship_city='Portland';

--#10
DELETE FROM order_details
WHERE quantity= 1 ;

--#11
SELECT AVG(quantity),MAX(quantity), MIN(quantity) FROM order_details 

--#12
SELECT AVG(quantity),MAX(quantity), MIN(quantity) FROM order_details GROUP BY order_id;

--#13
SELECT customer_id FROM northwind.orders
WHERE id = 65;
--#14
SELECT * FROM orders INNER JOIN Customers ON Orders.Customers_ID = Customers.ID;
SELECT * FROM orders LEFT JOIN Customers ON Orders.Customers_ID = Customers.ID;
SELECT * FROM orders RIGHT JOIN Customers ON Orders.Customers_ID = Customers.ID;
--#15
SELECT employees.first_name FROM employees
WHERE employees.notes IS NULL;
--#16
SELECT  Orders.ship_city
FROM orders o
INNER JOIN Customers c
ON o.Customers.ID= c.id
WHERE CUSTOMERS.FIRST_NAME = 'FRANCISCO' ;


