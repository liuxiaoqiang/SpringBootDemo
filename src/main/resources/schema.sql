/*
 *当服务启动成功后会自动创建实体类里面的表，并插入一条数据
 * 
 * */
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `first_name` varchar(20) DEFAULT NULL,
  `last_name` varchar(20) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `last_accessed` datetime DEFAULT NULL,
  `is_active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


insert into user(username, first_name, last_name, created_date) values ('danveloper', 'Dan', 'Woods', now())