package com.reus.repository;

import org.springframework.data.repository.CrudRepository;

import com.reus.model.User;

/* 当使用非关系型数据库mongodb时要使用下面这个接口
 * 同时pom文件中还应该有mongodb的驱动包说spring-boot-starter-data-mongodb
 * public interface UserRepository extends MongoRepository<User, Long> {}
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
