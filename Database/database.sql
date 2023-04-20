SELECT * FROM smartmarket.Userlogin;
insert into supermarket.Users values('admin','admin',111,null);
create database supermarket;
use supermarket;
create table Admin(username varchar(20),password varchar(15));
create table inventory(itemname varchar(20),itemcost integer(10),itemid integer(10) primary key);
create table users(username varchar(10),password varchar(15),orderid integer(10) auto_increment primary key,subtotal integer(10) );
create table itemslist(itemname varchar(20),itemcost integer(10),itemid integer(10),foreign key(itemid) references inventory(itemid))
select * from supermarket.itemslist;
select * from supermarket.inventory;
insert into supermarket.inventory values('Oreo',35,123);
 ALTER TABLE SUPERMARKET.itemslist 
  ADD CONSTRAINT itemid
  FOREIGN KEY (itemid) 
  REFERENCES SUPERMARKET.inventory(itemid) 
  ON DELETE NO ACTION;
  ALTER TABLE supermarket.itemslist drop foreign key itemid;
  select * from supermarket.itemslist;