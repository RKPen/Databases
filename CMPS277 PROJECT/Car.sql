SET FOREIGN_KEY_CHECKS=0;
CREATE TABLE IF NOT EXISTS customer (
  Customer_num int NOT NULL,
  Gender varchar(10) NOT NULL,
  nationality varchar(20) NOT NULL,
  Age int NOT NULL,
  Full_name varchar(45) NOT NULL,
  PRIMARY KEY (Customer_num)
);
CREATE TABLE IF NOT EXISTS driver_license (
  Customer_num int NOT NULL,
  Issue_Date date DEFAULT NULL,
  Number int DEFAULT NULL,
  PRIMARY KEY (Customer_num),
  FOREIGN KEY (Customer_num) REFERENCES customer (Customer_num) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS vehicle (
  Plate_Num int NOT NULL,
  Price int NOT NULL,
  Engine varchar(45) NOT NULL,
  Color varchar(20) NOT NULL,
  Gas_Type varchar(15) NOT NULL,
  Milage int NOT NULL DEFAULT '0',
  Available binary(1) NOT NULL DEFAULT '1',
  Brand varchar(45) NOT NULL,
  Model varchar(45) NOT NULL,
  Type varchar(45) NOT NULL,
  Year int NOT NULL,
  PRIMARY KEY (Plate_Num)
);
CREATE TABLE IF NOT EXISTS employee (
  Employee_num int NOT NULL,
  Gender varchar(15) NOT NULL,
  Nationality varchar(45) NOT NULL,
  Postion varchar(20) NOT NULL,
  Full_Name varchar(45) DEFAULT NULL,
  PRIMARY KEY (Employee_num)
);
CREATE TABLE IF NOT EXISTS car_lot (
  Carlot_Num int NOT NULL,
  Employee_num int NOT NULL,
  Full_bool binary(1) NOT NULL DEFAULT '0',
  Location varchar(45) NOT NULL,
  Capacity varchar(45) NOT NULL,
  PRIMARY KEY (Carlot_Num),
  FOREIGN KEY (Employee_num) REFERENCES employee (Employee_num) ON DELETE CASCADE ON UPDATE CASCADE
);
CREATE TABLE IF NOT EXISTS store (
  Carlot_Num int NOT NULL,
  Plate_num int NOT NULL,
  lot_num int NOT NULL,
  PRIMARY KEY (Carlot_Num,Plate_num),
  FOREIGN KEY (Carlot_Num) REFERENCES car_lot (Carlot_Num) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (Plate_num) REFERENCES veichle (Plate_Num) ON DELETE CASCADE ON UPDATE CASCADE
);
CREATE TABLE IF NOT EXISTS salary (
  Employee_num int NOT NULL,
  Commision int DEFAULT NULL,
  Wage int NOT NULL,
  PRIMARY KEY (Employee_num),
  FOREIGN KEY (Employee_num) REFERENCES employee (Employee_num) ON DELETE CASCADE ON UPDATE CASCADE
);
CREATE TABLE IF NOT EXISTS contract (
  Contract_num int NOT NULL,
  Issue_date date NOT NULL,
  Date_of_return date NOT NULL,
  returned_date date NOT NULL,
  Commision int DEFAULT NULL,
  Payment int NOT NULL,
  PRIMARY KEY (Contract_num)
) ;
CREATE TABLE IF NOT EXISTS rent (
  Contract_num int NOT NULL,
  Plate_num int NOT NULL,
  Customer_num int NOT NULL,
  Employee_num int NOT NULL,
  PRIMARY KEY (Contract_num,Plate_num,Customer_num,Employee_num),
  FOREIGN KEY (Contract_num) REFERENCES contract (Contract_num) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (Customer_num) REFERENCES customer (Customer_num) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (Employee_num) REFERENCES employee (Employee_num) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (Plate_num) REFERENCES veichle (Plate_Num)
);
CREATE TABLE IF NOT EXISTS insurance (
  Insurance_num int NOT NULL,
  Type varchar(20) DEFAULT NULL,
  Company varchar(20) DEFAULT NULL,
  issue_date date DEFAULT NULL,
  price int DEFAULT NULL,
  PRIMARY KEY (Insurance_num)
);
CREATE TABLE IF NOT EXISTS maintence (
  Request_num int NOT NULL,
  Plate_num int NOT NULL,
  Defected_parts varchar(45) NOT NULL,
  issue_date date NOT NULL,
  Last_fixed date NOT NULL,
  Insurance_num int DEFAULT NULL,
  PRIMARY KEY (Request_num),
  FOREIGN KEY (Insurance_num) REFERENCES insurance (Insurance_num) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (Plate_num) REFERENCES veichle (Plate_Num) ON DELETE CASCADE ON UPDATE CASCADE
);
CREATE TABLE IF NOT EXISTS insured (
  Insurance_num int NOT NULL,
  Contract_num int NOT NULL,
  Customer_num int NOT NULL,
  PRIMARY KEY (Insurance_num,Contract_num),
  KEY contracts_idx (Contract_num),
  KEY cus_idx (Customer_num),
  FOREIGN KEY (Contract_num) REFERENCES contract (Contract_num) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (Customer_num) REFERENCES customer (Customer_num) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (Insurance_num) REFERENCES insurance (Insurance_num) ON DELETE CASCADE ON UPDATE CASCADE
) ;
CREATE TABLE IF NOT EXISTS review (
  Review_Id int NOT NULL,
  Recomendation varchar(140) DEFAULT NULL,
  Rating int DEFAULT NULL,
  Feedback varchar(140) DEFAULT NULL,
  Customer_num int DEFAULT NULL,
  PRIMARY KEY (Review_Id),
  FOREIGN KEY (Customer_num) REFERENCES customer (Customer_num) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT IGNORE INTO  vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (12937,599,'4.0 l twin-turbo V8','White','Gasoline',12679,0,'Mercedes','G500','SUV',2018);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (15576,900,'twin-turbocharged 4.0-liter V-8','Maroon','Gasoline',1547,0,'May Bach','s680','Luxury',2021);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (66910,850,'OM473 inline 6','White','Diesel',60350,0,'Mercedes','Actros','Semi',2015);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (110621,299,'5.7-liter V-8','Blue','Diesel',12560,0,'Toyota','Tacoma','Pickup',2021);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (123456,400,'Dual Motor AWD 100D','white','electric',5687,0,'Tesla','Model x','SUV',2021);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (219057,60,'turbocharged 1.5-liter','Blue','Gasoline',79011,0,'Honda ','Civic','Sedan',2018);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (252904,1300,'6v92 Detroit','Grey','Diesel',20245,0,'MCI','96a2','Motor Home',2015);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (344667,199,'Dual Motor AWD P100D','Black','electric',14678,0,'Tesla','Model 3','Sedan',2020);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (397883,150,'HEMI® V8','Red','Gasoline',15452,0,'Jeep','Rubicon','SUV',2020);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (416776,220,'649cc four cylinder','Red','Gasoline',760,0,'Honda ','CB650R','Motorcycle',2019);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (473998,229,'385-hp twin-turbo V-6','Red','Gasoline',15989,0,'Mercedes','AMG C43','Sedan',2020);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (476766,120,'399cc TWIN-CYLINDER','Green','Gasoline',7659,0,'Kawasak',' Ninja 400','Motorcycle',2019);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (544405,250,'MILWAUKEE-EIGHT 107','Black','Gasoline',1500,0,'Harley-Davidson','Road King','Motorcycle',2021);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (564531,4000,'4.0 L M840TR twin-turbocharged V8','Red','Gasoline',560,0,'Mclaren','senna','Hyper',2019);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (567821,99,'Ford gasoline ','White','Gasoline',30870,0,'Ford','F-53','Bus',2018);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (627299,950,'4.0-litre M178 twin-turbocharged V8','Black','Gasoline',7612,0,'Mercedes','AMG gt','Sport',2020);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (658513,299,' twin-turbo 3.5L EcoBoost V6','Black','Gasoline',9345,0,'Ford','Raptor','Pickup',2021);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (663965,300,'turbocharged V-6','Black','Gasoline',9678,0,'Audi','A7','Hatch Back',2019);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (742833,1099,'3.0-litre turbocharged flat six engine','Red','Gasoline',5476,0,'Porsche','991','Sport',2021);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (802996,249,'5.3L V8','Black','Gasoline',22352,0,'Chevrolet','Tahoe','SUV',2020);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (819762,80,'275-hp turbo-four','Green','Gasoline',35467,0,'Hyundai ','Veloster','Hatch Back',2019);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (845119,400,'V 250 STANDARD','Black','Gasoline',15045,0,'Mercedes','v-class','Mini van',2019);
INSERT IGNORE INTO vehicle (Plate_Num,Price,Engine,Color,Gas_Type,Milage,Available,Brand,Model,Type,Year) VALUES (987651,1400,'6.0 litre twin-turbocharged W12','Silver','Gasoline',567,0,'Bentley','continental gt','Luxury',2021);

INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (10001,'Female','Lebanese','CEO','Natalie Meyer');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (11012,'Male','Algerian','Manager','Ryan Cole');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (11567,'Male','Turkish','Manager','John Christensen');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (11908,'Female','Lebanese','Managers','Kathleen Scott');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (12211,'Male','Lebanese','Lot supervisor','Mohamad Itani');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (12334,'Female','Lebanese','Lot supervisor','Reem yateem');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (12542,'Male','Palestinian','Lot supervisor','Mohammed Assaf');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (12763,'Male','British','Lot supervisor','Tommy boy');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (12876,'Female','Lebanese','Lot supervisor','Britney Gomez');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (13123,'Male','Lebanese','Sale Clerk','Jill Williams');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (13221,'Male','Lebanese','Sale Clerk','Thomas Taylor');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (13453,'Male','Lebanese','Sale Clerk','Robin Peterson');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (13456,'Male','Lebanese','Sale Clerk','Thomas Frazier');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (13671,'Male','Lebanese','Sale Clerk','Jose Franklin');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (13776,'Male','Syrian','Sale Clerk','Justin Jones');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (13909,'Female','Lebanese','Sale Clerk','Angelica Kirby');
INSERT IGNORE INTO employee (Employee_num,Gender,Nationality,Postion,Full_Name) VALUES (13987,'Female','Syrian','Sale Clerk','Ariel Gray');

INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (10001,0,150000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (11012,0,110000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (11567,0,100000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (11908,0,120000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (12211,0,92000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (12334,0,90000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (12542,0,85000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (12763,0,87000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (12876,0,91000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (13123,1000,45000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (13221,850,45000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (13453,920,40000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (13456,690,44000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (13671,420,45000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (13776,1800,45000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (13909,200,42000);
INSERT IGNORE INTO salary (Employee_num,Commision,Wage) VALUES (13987,0,37000);

INSERT IGNORE INTO customer (Customer_num,Gender,nationality,Age,Full_name) VALUES (20574,'Male','Philipino',38,'Daniel Jones');
INSERT IGNORE INTO customer (Customer_num,Gender,nationality,Age,Full_name) VALUES (23397,'Female','Italian',35,'Amber Stevens');
INSERT IGNORE INTO customer (Customer_num,Gender,nationality,Age,Full_name) VALUES (33588,'Male','Indian',22,'Thomas Johnson');
INSERT IGNORE INTO customer (Customer_num,Gender,nationality,Age,Full_name) VALUES (37791,'Male','German',34,'Oliver Lee');
INSERT IGNORE INTO customer (Customer_num,Gender,nationality,Age,Full_name) VALUES (41613,'Female','Lebanese',52,'Mary Bryant');
INSERT IGNORE INTO customer (Customer_num,Gender,nationality,Age,Full_name) VALUES (45492,'Female','French',30,'Holly Bailey');
INSERT IGNORE INTO customer (Customer_num,Gender,nationality,Age,Full_name) VALUES (53702,'Female','Saudi',21,'Alice Flores');
INSERT IGNORE INTO customer (Customer_num,Gender,nationality,Age,Full_name) VALUES (55318,'Male','Icelandic',55,'Benjamin Ross');
INSERT IGNORE INTO customer (Customer_num,Gender,nationality,Age,Full_name) VALUES (55362,'Male','Scotish',29,'Alexander Lewis');
INSERT IGNORE INTO customer (Customer_num,Gender,nationality,Age,Full_name) VALUES (58124,'Female','Lebanese',41,'Florence Palmer');

INSERT IGNORE INTO driver_license (Customer_num,Issue_Date,Number) VALUES (20574,'2002-09-12',37387664);
INSERT IGNORE INTO driver_license (Customer_num,Issue_Date,Number) VALUES (23397,'2005-12-09',42979970);
INSERT IGNORE INTO driver_license (Customer_num,Issue_Date,Number) VALUES (33588,'2019-01-03',53249491);
INSERT IGNORE INTO driver_license (Customer_num,Issue_Date,Number) VALUES (37791,'2009-05-07',41616918);
INSERT IGNORE INTO driver_license (Customer_num,Issue_Date,Number) VALUES (41613,'1988-06-08',98695053);
INSERT IGNORE INTO driver_license (Customer_num,Issue_Date,Number) VALUES (45492,'2010-09-11',36313106);
INSERT IGNORE INTO driver_license (Customer_num,Issue_Date,Number) VALUES (53702,'2019-02-01',43611108);
INSERT IGNORE INTO driver_license (Customer_num,Issue_Date,Number) VALUES (55318,'1985-12-27',64163217);
INSERT IGNORE INTO driver_license (Customer_num,Issue_Date,Number) VALUES (55362,'2011-11-22',74292875);
INSERT IGNORE INTO driver_license (Customer_num,Issue_Date,Number) VALUES (58124,'2003-06-22',33398548);

INSERT IGNORE INTO review (Review_Id,Recomendation,Rating,Feedback,Customer_num) VALUES (1,NULL,5,'All was good, everyone is very nice ',20574);
INSERT IGNORE INTO review (Review_Id,Recomendation,Rating,Feedback,Customer_num) VALUES (2,'Need more variety of cars',5,'Good Prices',23397);
INSERT IGNORE INTO review (Review_Id,Recomendation,Rating,Feedback,Customer_num) VALUES (3,'Give everyone a raise ',5,'I\'ll defintley recommend it to my friends',33588);
INSERT IGNORE INTO review (Review_Id,Recomendation,Rating,Feedback,Customer_num) VALUES (4,'Clean cars before handing to costumer ',3,'Service was appropriate, they helped me find a suitable car for my needs.',37791);

INSERT IGNORE INTO contract (Contract_num,Issue_date,Date_of_return,returned_date,Commision,Payment) VALUES (1,'2021-12-27','2021-12-30','2021-12-30',24,240);
INSERT IGNORE INTO contract (Contract_num,Issue_date,Date_of_return,returned_date,Commision,Payment) VALUES (2,'2022-01-03','2022-01-07','2022-01-09',75,792);
INSERT IGNORE INTO contract (Contract_num,Issue_date,Date_of_return,returned_date,Commision,Payment) VALUES (3,'2022-02-13','2022-02-14','2022-02-14',150,4000);
INSERT IGNORE INTO contract (Contract_num,Issue_date,Date_of_return,returned_date,Commision,Payment) VALUES (4,'2022-01-21','2022-01-25','2022-01-25',80,796);
INSERT IGNORE INTO contract (Contract_num,Issue_date,Date_of_return,returned_date,Commision,Payment) VALUES (5,'2021-12-29','2022-01-05','2022-01-05',600,11200);
INSERT IGNORE INTO contract (Contract_num,Issue_date,Date_of_return,returned_date,Commision,Payment) VALUES (6,'2022-03-20','2022-03-28','2022-03-29',100,2450);
INSERT IGNORE INTO contract (Contract_num,Issue_date,Date_of_return,returned_date,Commision,Payment) VALUES (7,'2022-04-18','2022-04-20','2022-04-20',70,800);

INSERT IGNORE INTO insurance (Insurance_num,Type,Company,issue_date,price) VALUES (1,'C','Swan Group','2021-12-27',50);
INSERT IGNORE INTO insurance (Insurance_num,Type,Company,issue_date,price) VALUES (2,'B','Allianz SNA','2022-01-21',100);
INSERT IGNORE INTO insurance (Insurance_num,Type,Company,issue_date,price) VALUES (3,'A','Fidelity','2021-12-29',600);
INSERT IGNORE INTO insurance (Insurance_num,Type,Company,issue_date,price) VALUES (4,'B','Fidelity','2022-01-03',100);
INSERT IGNORE INTO insurance (Insurance_num,Type,Company,issue_date,price) VALUES (5,'A','Allianz SNA','2022-02-13',400);


INSERT INTO maintence (Request_num,Plate_num,Defected_parts,issue_date,Last_fixed,Insurance_num) VALUES (1,567821,'Broken Bumper','2022-01-09','2021-11-05',4);
INSERT INTO maintence (Request_num,Plate_num,Defected_parts,issue_date,Last_fixed,Insurance_num) VALUES (2,819762,'Oil change','2022-02-02','2021-12-09',NULL);
INSERT INTO maintence (Request_num,Plate_num,Defected_parts,issue_date,Last_fixed,Insurance_num) VALUES (3,802996,'Coolant refill','2021-12-07','2020-11-07',NULL);
INSERT INTO maintence (Request_num,Plate_num,Defected_parts,issue_date,Last_fixed,Insurance_num) VALUES (4,344667,'New Tires','2022-03-06','2021-04-08',NULL);

INSERT IGNORE INTO car_lot (Carlot_Num,Employee_num,Full_bool,Location,Capacity) VALUES (1,12334,0,'Bliss','20');
INSERT IGNORE INTO car_lot (Carlot_Num,Employee_num,Full_bool,Location,Capacity) VALUES (2,12211,0,'Ras Beirut','15');
INSERT IGNORE INTO car_lot (Carlot_Num,Employee_num,Full_bool,Location,Capacity) VALUES (3,12876,0,'Mar Mkhayil','22');
INSERT IGNORE INTO car_lot (Carlot_Num,Employee_num,Full_bool,Location,Capacity) VALUES (4,12763,0,'Badaro','19');
INSERT IGNORE INTO car_lot (Carlot_Num,Employee_num,Full_bool,Location,Capacity) VALUES (5,12542,0,'Sassine','20');

INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (1,12937,1);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (1,15576,2);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (1,123456,3);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (1,564531,4);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (1,627299,5);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (1,742833,6);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (1,987651,7);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (2,66910,1);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (2,344667,2);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (2,476766,3);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (2,663965,4);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (3,110621,5);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (3,397883,6);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (3,544405,7);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (3,802996,8);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (4,219057,1);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (4,416776,2);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (4,567821,3);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (4,819762,4);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (5,252904,1);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (5,473998,2);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (5,658513,3);
INSERT INTO store (Carlot_Num,Plate_num,lot_num) VALUES (5,845119,4);

INSERT INTO rent (Contract_num,Plate_num,Customer_num,Employee_num) VALUES (4,344667,37791,13456);
INSERT INTO rent (Contract_num,Plate_num,Customer_num,Employee_num) VALUES (6,544405,58124,13453);
INSERT INTO rent (Contract_num,Plate_num,Customer_num,Employee_num) VALUES (3,564531,53702,13123);
INSERT INTO rent (Contract_num,Plate_num,Customer_num,Employee_num) VALUES (2,567821,23397,13671);
INSERT INTO rent (Contract_num,Plate_num,Customer_num,Employee_num) VALUES (1,819762,20574,13909);
INSERT INTO rent (Contract_num,Plate_num,Customer_num,Employee_num) VALUES (7,845119,55318,13221);
INSERT INTO rent (Contract_num,Plate_num,Customer_num,Employee_num) VALUES (5,987651,41613,13776);

INSERT IGNORE INTO insured (Insurance_num, Contract_num, Customer_num) VALUES ('1', '1', '20574');
INSERT IGNORE INTO insured (Insurance_num, Contract_num, Customer_num) VALUES ('2', '4', '37791');
INSERT IGNORE INTO insured (Insurance_num, Contract_num, Customer_num) VALUES ('3', '5', '41613');
INSERT IGNORE INTO insured (Insurance_num, Contract_num, Customer_num) VALUES ('4', '2', '23397');
INSERT IGNORE INTO insured (Insurance_num, Contract_num, Customer_num) VALUES ('5', '3', '53702');