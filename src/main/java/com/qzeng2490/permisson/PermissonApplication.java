package com.qzeng2490.permisson;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.qzeng2490.permisson.dao")
@ServletComponentScan
public class PermissonApplication {

  public static void main(String[] args) {
    SpringApplication.run(PermissonApplication.class, args);
  }

}
