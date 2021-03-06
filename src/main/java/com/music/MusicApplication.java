package com.music;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.music.dao")
@SpringBootApplication
public class MusicApplication {

  public static void main(String[] args) {
    SpringApplication.run(MusicApplication.class, args);
  }

}
