CREATE DATABASE pfs;

USE pfs;

CREATE TABLE Students (
	Student_Id INT UNIQUE NOT NULL AUTO_INCREMENT PRIMARY KEY,
    First_Name VARCHAR(50) NOT NULL,
    Last_Name VARCHAR(50),
    Gender TINYINT,
    Address VARCHAR(200),
    Phone_Number VARCHAR(50),
    Course_Selected VARCHAR(50) NOT NULL
);

