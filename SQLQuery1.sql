--Sql case insensitive`dir
--Select
--ANSII
Select ContactName Adi, CompanyName SirketAdi, City Sehir from Customers

Select * from Customers where City='Berlin'

Select * from Products where CategoryID=1 or CategoryID=3

Select * from Products where CategoryID=1 and UnitPrice>=10

-- asc(ascending)=Artan, desc(descending)=Azalan
select * from Products where CategoryID=2 order by UnitPrice desc,ProductName

--count(sayısı), avg(ortalaması)
select count(*)Adet from Products where CategoryID=2

select categoryID, count(*) Adedi from Products where UnitPrice>20 group by CategoryID  having count(*)<10

select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories 
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10

select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null
