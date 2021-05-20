CREATE DATABASE Airport_db;
USE Airport_db;

CREATE table Pilot (
id int unique not null,
first_name varchar (300) not null,
last_name varchar (300) not null,
rank varchar (300) not null,
pilot_id varchar (300) unique not null,
primary key (id)
);

CREATE table Airplane (
id int unique not null,
brand varchar (300) not null,
model varchar (300) not null,
passenger_capacity int not null,
tail_number varchar (300) unique not null,
primary key (id)
);

CREATE table Flight (
id int unique not null,
airplane int,
pilot int,
flight_date date not null,
flight_time time not null,
number_flight int not null,
primary key (id),
foreign key (airplane) references airport_db.airplane(id),
foreign key (pilot) references airport_db.pilot (id)
);
