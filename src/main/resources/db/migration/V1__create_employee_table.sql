CREATE TABLE employee (
              employeeID smallint PRIMARY KEY AUTO_INCREMENT,
              name varchar(255) NOT NULL,
              salary decimal(11, 2) NOT NULL,
              bank_acc_num varchar(34) NOT NULL,
              nin char(9) NOT NULL
);

