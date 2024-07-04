CREATE TABLE salesEmployee
(
    salesID  smallint PRIMARY KEY AUTO_INCREMENT,
    commRate float(13, 2
) ,
           employeeID smallint,
           FOREIGN KEY (employeeID) REFERENCES employee(employeeID)
);