--Select (Yorum satırı SQL'de --'dir)
--İkinci kısmına yazarsak tablonun o kolonunun ismini değiştirir.

--Select ContactName Adi, CompanyName Sirketadi, City Sehir from Customers

--Tek tırnak ile arama yapılır.
--Select * from Customers where City = 'Berlin' or City = 'London'

--Case insensitive küçük büyük harf duyarlılığı yoktur.
--Select * from Products where CategoryID = 1 or CategoryID =3

--Or ikisinden biri yeterli and'de iki sorgununda sağlanması gerekir.

--Select * from Products where CategoryID = 1 and UnitPrice>=10

--select * from Products order by CategoryID,ProductName
--Select * from Products order by UnitPrice asc --ascending(artan anlamına gelir)
										-- dsc descending(azalan anlamına gelir)
--Select * from Products where CategoryID = 1 order by UnitPrice desc

--select count(*) from Products --count productların sayısını bize verir.
--select count(*) from Products where CategoryID =2 

-- Group by ile her bir kategoride tablo oluşturur.
--select CategoryID  from Products group by CategoryID


--Sadece belirli kolonun sayısını almak için kullanırız.
--select CategoryID, count(*) from Products group by CategoryID

--10 tane den az olan ürün çeşidini sisteme yazdır. ve unitprice'ın 20 den fazla olanları listeledi.
--select CategoryID, count(*) from Products where UnitPrice>20 group by CategoryID having count(*)<10

--inner iki tabloda da eşleşen verileri ekrana getirir.
-- * tüm kolonlardır onun yerine belirli klonları yazabiliriz.
--select Products.ProductID,Products.ProductName,Products.UnitPrice, Categories.CategoryName
--from Products  inner join Categories 
--on Products.CategoryID = Categories.CategoryID
--where Products.UnitPrice>10 

--DTO Data Transformation Object

--select * from Products p inner join [Order Details] od
--on p.ProductID = od.ProductID

--solda olup sağda olmayanları da getir. Ürünlerde olup sipariş detayında olmayan yok
--select * from Products p left join [Order Details] od
--on p.ProductID = od.ProductID

select * from Customers c left join orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null

select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID