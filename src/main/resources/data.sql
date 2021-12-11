--The query switches up the Shoe_Model and Shoe_Colorway columns unless the columns aren't written explicitly like below
--(I don't know why, as everything seems to be in the right order)

insert into SHOE_MASTER(Shoe_ID, Shoe_Brand, Shoe_Model, Shoe_Colorway, Shoe_Size) values (1001,'Vans','MTE Sk8-Hi','Black/Leopard','42');
insert into SHOE_MASTER(Shoe_ID, Shoe_Brand, Shoe_Model, Shoe_Colorway, Shoe_Size) values (1002,'Nike','Air Jordan 1 High','Chicago','44');
insert into SHOE_MASTER(Shoe_ID, Shoe_Brand, Shoe_Model, Shoe_Colorway, Shoe_Size) values (1003,'Adidas','Ultra Boost','Cloud White/Cloud White/Core Black','39');
insert into SHOE_MASTER(Shoe_ID, Shoe_Brand, Shoe_Model, Shoe_Colorway, Shoe_Size) values (1004,'Nike','Air Max Uptempo 97','Black/White','43');