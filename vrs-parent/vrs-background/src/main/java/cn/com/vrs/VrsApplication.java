package cn.com.vrs;

import cn.com.vrs.mail.MailConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.amqp.core.Queue;
import tk.mybatis.spring.annotation.MapperScan;

/***
 * @Description 启动类
 * @Author zhangFengQin
 * @Date Created in 2020/6/29 0029 16:22
 * @Version V 0.0.1
 * @Modified By:  
 *
 **/
@MapperScan("cn.com.vrs.dao")
@SpringBootApplication
public class VrsApplication {
    public static void main(String[] args) {
        SpringApplication.run(VrsApplication.class,args);
    }

    @Bean
    Queue queue() {
        return new Queue(MailConstants.MAIL_QUEUE_NAME);
    }
}
