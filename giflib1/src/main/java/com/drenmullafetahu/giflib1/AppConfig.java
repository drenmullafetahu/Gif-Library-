package com.drenmullafetahu.giflib1;

import org.apache.catalina.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Dren on 3/26/2016.
 */
@EnableAutoConfiguration
@ComponentScan
public class AppConfig {

        public static void main(String[] args){
            SpringApplication.run(AppConfig.class,args);

        }
}
