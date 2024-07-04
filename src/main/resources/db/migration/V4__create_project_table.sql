CREATE TABLE project (
    projId smallint auto_increment PRIMARY KEY,
    projName varchar(100),
    projValue decimal(12,2),
    clientId smallint,
    projStatus enum('inactive', 'active', 'completed'),
    projCreationDate DATE
);