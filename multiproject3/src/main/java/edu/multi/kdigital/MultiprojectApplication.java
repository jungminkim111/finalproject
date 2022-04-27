package edu.multi.kdigital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import market.MarketDAO;
import market.MybatisAjaxController;
import market.MarketadminController;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackageClasses = MarketadminController.class)
@MapperScan(basePackageClasses = MarketDAO.class)
public class MultiprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiprojectApplication.class, args);
	}

}
