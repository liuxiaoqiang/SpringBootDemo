package com.reus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reus.config.DataSourceConfig;
import com.reus.model.User;
import com.reus.repository.UserRepository;

@ComponentScan
@RestController
@EnableAutoConfiguration
public class SpringBootDemo 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(SpringBootDemo.class, args);
    }
    
    @Autowired
	UserRepository repository;

	@RequestMapping(value="/user",method=RequestMethod.GET)
	public User get(Long id){
		User user = repository.findOne(id);
		return user;
	}
	
	@RequestMapping(value="/userAll",method=RequestMethod.GET)
	public List<User> get(){
		return (List<User>) repository.findAll();
	}
    
	@Autowired
	private DataSourceConfig dataSourceConfig;
    
    @RequestMapping("/")
    public String home(){
    	System.out.println(dataSourceConfig.getDriverClassName());
    	return dataSourceConfig.toString();
    }
}
