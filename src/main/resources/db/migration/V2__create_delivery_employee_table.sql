CREATE TABLE deliveryEmployee
(
    deliveryID smallint PRIMARY KEY AUTO_INCREMENT,
    techLead   tinyint,
    employeeID smallint,
    FOREIGN KEY (employeeID) REFERENCES employee (employeeID)
);

