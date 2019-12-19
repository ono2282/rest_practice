DROP TABLE IF EXISTS city;
CREATE TABLE city (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    state VARCHAR(255),
    country VARCHAR(255)
);

CREATE TABLE `user` (
  `user_id` varchar(8) NOT NULL,
  `user_name` varchar(16) NOT NULL,
  `password` varchar(32) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`)
);
