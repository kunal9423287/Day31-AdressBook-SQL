
public class AddressBook {
	-- AddressBook Service
	===========================================================
	-- UC1 Creating database as AddessBookService
	===========================================================


	mysql> create database AddressBookService;
	Query OK, 1 row affected (0.13 sec)

	 MySQL  localhost:3306 ssl  addressbookservice  SQL > show databases;
	+--------------------+
	| Database           |
	+--------------------+
	| addressbookservice |
	| employeedb         |
	| employeedetails    |
	| information_schema |
	| mysql              |
	| payroll_service    |
	| performance_schema |
	| sakila             |
	| sys                |
	| user               |
	| world              |
	+--------------------+
	11 rows in set (0.0466 sec)
	mysql> use AddressBookService;
	Database changed

	===========================================================
	-- UC2  creating table as AddressBook with attributes
	===========================================================

	localhost:3306 ssl  addressbookservice  SQL > create table AddressBook (
	                                                   -> firstName varchar(50) not null,
	                                                   -> lastName varchar(50) not null,
	                                                   -> address varchar(100) not null,
	                                                   -> city varchar(50) not null,
	                                                   -> state varchar(50) not null,
	                                                   -> zip int not null,
	                                                   -> phoneNumber double not null,
	                                                   -> email varchar(100) not null );
	Query OK, 0 rows affected (0.0826 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL > desc AddressBook;
	+-------------+--------------+------+-----+---------+-------+
	| Field       | Type         | Null | Key | Default | Extra |
	+-------------+--------------+------+-----+---------+-------+
	| firstName   | varchar(50)  | NO   |     | NULL    |       |
	| lastName    | varchar(50)  | NO   |     | NULL    |       |
	| address     | varchar(100) | NO   |     | NULL    |       |
	| city        | varchar(50)  | NO   |     | NULL    |       |
	| state       | varchar(50)  | NO   |     | NULL    |       |
	| zip         | int          | NO   |     | NULL    |       |
	| phoneNumber | double       | NO   |     | NULL    |       |
	| email       | varchar(100) | NO   |     | NULL    |       |
	+-------------+--------------+------+-----+---------+-------+
	8 rows in set (0.0554 sec)



	-- UC3 inserting new Contacts to AddressBook table

	 MySQL  localhost:3306 ssl  addressbookservice  SQL > insert into AddressBook (firstname, lastname, address,city, state, zip,phoneNumber,email) values
	                                                   -> ('Kunal', 'Sona','Walwa','Dhule','Mahara', 768041, 7339731548,'kunal@gmail.com'),
	                                                   -> ('Ashish ','Jain','Jairaj','Surat','Gujrat', 561210, 999999999,'ashish@gmail.com'),
	                                                   -> ('Asjad','Syed','Bang','Puri',' Odisa', 520102, 888888888,'asjad@gmail.com'),
	                                                   -> ('Mukesh','Kapse','Midc','Indor','MP', 3021402, 777777777,'mukesh@gmail.com');
	Query OK, 4 rows affected (0.0529 sec)

	Records: 4  Duplicates: 0  Warnings: 0
	 MySQL  localhost:3306 ssl  addressbookservice  SQL > desc AddressBook;
	+-------------+--------------+------+-----+---------+-------+
	| Field       | Type         | Null | Key | Default | Extra |
	+-------------+--------------+------+-----+---------+-------+
	| firstName   | varchar(50)  | NO   |     | NULL    |       |
	| lastName    | varchar(50)  | NO   |     | NULL    |       |
	| address     | varchar(100) | NO   |     | NULL    |       |
	| city        | varchar(50)  | NO   |     | NULL    |       |
	| state       | varchar(50)  | NO   |     | NULL    |       |
	| zip         | int          | NO   |     | NULL    |       |
	| phoneNumber | double       | NO   |     | NULL    |       |
	| email       | varchar(100) | NO   |     | NULL    |       |
	+-------------+--------------+------+-----+---------+-------+
	8 rows in set (0.0028 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL > select * from AddressBook;
	+-----------+----------+------------+---------+---------------+---------+-------------+------------------+
	| firstName | lastName | address    | city    | state         | zip     | phoneNumber | email            |
	+-----------+----------+------------+---------+---------------+---------+-------------+------------------+
	| Kunal     | Sona     | Walwa      | Dhule   | Mahara        |  768041 |  7339731548 | kunal@gmail.com  |
	| Ashish    | Jain     | Jairaj     | Surat   | Gujrat        |  561210 |   999999999 | ashish@gmail.com |
	| Asjad     | Syed     | bang       | Puri    | Odisa         |  520102 |   888888888 | asjad@gmail.com  |
	| Mukesh    | Kapse    | Midc       | Indor   | MP            | 3021402 |   777777777 | mukesh@gmail.com |
	+-----------+----------+------------+---------+---------------+---------+-------------+------------------+
	4 rows in set (0.0010 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL >

	===========================================================
	--> UC4 editing the existing contact by their firstname
	===========================================================

	 MySQL  localhost:3306 ssl  addressbookservice  SQL > update AddressBook set  lastName='Kapse' where firstname='Mukesh';
	Query OK, 1 row affected (0.0040 sec)

	Rows matched: 1  Changed: 1  Warnings: 0
	 MySQL  localhost:3306 ssl  addressbookservice  SQL > update addressbook set phoneNumber=9876543210 where firstname='Ashish';
	Query OK, 0 rows affected (0.0467 sec)

	Rows matched: 0  Changed: 0  Warnings: 0
	 MySQL  localhost:3306 ssl  addressbookservice  SQL > select * from AddressBook;
	    +-----------+----------+------------+---------+---------------+---------+-------------+------------------+
		| firstName | lastName | address    | city    | state         | zip     | phoneNumber | email            |
		+-----------+----------+------------+---------+---------------+---------+-------------+------------------+
		| Kunal     | Sona     | Walwa      | Dhule   | Mahara        |  768041 |  7339731548 | kunal@gmail.com  |
		| Ashish    | Jain     | Jairaj     | Surat   | Gujrat        |  561210 |   999999999 | ashish@gmail.com |
		| Asjad     | Syed     | bang       | Puri    | Odisa         |  520102 |   888888888 | asjad@gmail.com  |
		| Mukesh    | Kapse    | Midc       | Indor   | MP            | 3021402 |   777777777 | mukesh@gmail.com |
		+-----------+----------+------------+---------+---------------+---------+-------------+------------------+
	4 rows in set (0.0011 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL >

	===========================================================
	-- UC5 -deleting the contact by their lastname
	===========================================================
	 MySQL  localhost:3306 ssl  addressbookservice  SQL >  delete from addressBook where lastname='Jain';
	Query OK, 1 row affected (0.0115 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL > select * from AddressBook;
	        +-----------+----------+------------+---------+---------------+---------+-------------+------------------+
			| firstName | lastName | address    | city    | state         | zip     | phoneNumber | email            |
			+-----------+----------+------------+---------+---------------+---------+-------------+------------------+
			| Kunal     | Sona     | Walwa      | Dhule   | Mahara        |  768041 |  7339731548 | kunal@gmail.com  |
			| Asjad     | Syed     | bang       | Puri    | Odisa         |  520102 |   888888888 | asjad@gmail.com  |
			| Mukesh    | Kapse    | Midc       | Indor   | MP            | 3021402 |   777777777 | mukesh@gmail.com |
			+-----------+----------+------------+---------+---------------+---------+-------------+------------------+
			
	3 rows in set (0.0016 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL >

	===========================================================
	--> UC6 retrieving the contact by city or state
	===========================================================

	mysql> select * from AddressBook where city = 'Puri' or State='Odisa';
	+-----------+----------+----------+---------+---------------+--------+-------------+-----------------------+
	| firstName | lastName | address  | city    | state         | zip    | phoneNumber | email                 |
	+-----------+----------+----------+---------+---------------+--------+-------------+-----------------------+
	| Asjad     | Syed     | Bang     | puri    | Odisa         | 520102 |   888888888 | asjad@gmail.com      |
	+-----------+----------+----------+---------+---------------+--------+-------------+-----------------------+
	2 rows in set (0.00 sec)

	=============================================
	-- UC7 size of addressbook by city and state
	=============================================

	 MySQL  localhost:3306 ssl  addressbookservice  SQL > select count(firstname) from AddressBook where city = 'Puri';
	+------------------+
	| count(firstname) |
	+------------------+
	|                1 |
	+------------------+
	1 row in set (0.0471 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL > select count(firstName) from AddressBook where state = 'Bihar';
	+------------------+
	| count(firstName) |
	+------------------+
	|                0 |
	+------------------+
	1 row in set (0.0010 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL > select count(firstname) from AddressBook where city='Indor';
	+------------------+
	| count(firstname) |
	+------------------+
	|                1 |
	+------------------+
	1 row in set (0.0008 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL >

	=====================================================
	-- UC8 soriting the name alphbetically for given city
	=====================================================

	 MySQL  localhost:3306 ssl  addressbookservice  SQL > insert into AddressBook(firstname,lastname,address,city,state,zip,phoneNumber,email)
	                                                   -> values ('Gaurav','Mahale','Chalis','Akola','Punjab',50102,9874561023,'gaurav@gmail.com');
	Query OK, 1 row affected (0.0480 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL > insert into AddressBook(firstname,lastname,address,city,state,zip,phoneNumber,email)
	                                                   ->  values('Vijay','Chavan','Nizam','Khede',' Mahara',851026,9874563201,'Vijay@gmail.com');
	Query OK, 1 row affected (0.0485 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL > insert into AddressBook(firstname,lastname,address,city,state,zip,phoneNumber,email)
	                                                   -> values('Rahul','Shinde','Shivaji','Rami','Asam',652142,8520147963,'Rahul@gmail.com');
	Query OK, 1 row affected (0.0035 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL > select * from AddressBook;
	+-----------+----------+--------------+---------------+---------------+---------+-------------+------------------+
	| firstName | lastName | address      | city          | state         | zip     | phoneNumber | email            |
	+-----------+----------+--------------+---------------+---------------+---------+-------------+------------------+
	| Kunal     | Sona     | Walwa        | Dhule         | Mahara        |  768041 |  7339731548 | kunal@gmail.c om |
	| Asjad     | Syed     | Bang         | Puri          |  Odisa        |  520102 |   888888888 | asjad @gmail.com |
	| Mukesh    | Kapse    | Midc         | Indor         | MP            | 3021402 |   777777777 | mukesh@gmail.com |
	| Gaurav    | Mahale   | Chalis       | Akola         |   Punjab      |   50102 |  9874561023 | Gaurav@gmail.com |
	| Vijay     | Chavan   | Nizam        | Khede         |  Mahara       |  851026 |  9874563201 | Vijay@gmail.com  |
	| Rahul     | Shinde   | Shivaji      | Rami          | Asam          |  652142 |  8520147963 | Rahul@gmail.com  |
	+-----------+----------+--------------+---------------+---------------+---------+-------------+------------------+
	6 rows in set (0.0011 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL > select firstname,city from AddressBook order by city;
	+-----------+---------------+
	| firstname | city          |
	+-----------+---------------+
	| Kunal     | Dhule         |
	| Rahul     | Rami          |
	| Mukesh    | Indor         |
	| Gaurav    | Akola         |
	| Asjad     | Puri       |
	| Vijay     | Khede     |
	+-----------+---------------+
	6 rows in set (0.0456 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL >


	

	========================================================
	-- UC10 ability to get count of contacts by contacttype
	========================================================

	 MySQL  localhost:3306 ssl  addressbookservice  SQL > select count(firstname) from AddressBook where contactType='family';
	+------------------+
	| count(firstname) |
	+------------------+
	|                1 |
	+------------------+
	1 row in set (0.0011 sec)
	 MySQL  localhost:3306 ssl  addressbookservice  SQL >


	
}
