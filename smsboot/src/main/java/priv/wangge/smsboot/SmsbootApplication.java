package priv.wangge.smsboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("priv.wangge.smsboot.mapper")
public class SmsbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsbootApplication.class, args);
    }

}

