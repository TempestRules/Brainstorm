CREATE DATABASE Users;

USE Users;

CREATE TABLE accounts (
    username varchar(25),
    passwd varchar(100),
    email varchar(25),
    appName varchar(25),
    enckey int NOT NULL
);

INSERT INTO accounts (username, passwd, email, appName, url_address, enckey) VALUES ('master', 'hapiaej', 'master', 'master', 'master', 22);