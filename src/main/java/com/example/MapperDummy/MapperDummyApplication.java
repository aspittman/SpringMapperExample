package com.example.MapperDummy;

import com.example.MapperDummy.model.Dummy;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MappedTypes(Dummy.class)
@MapperScan("com.example.MapperDummy.mapper")
@SpringBootApplication
public class MapperDummyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapperDummyApplication.class, args);
	}

}
