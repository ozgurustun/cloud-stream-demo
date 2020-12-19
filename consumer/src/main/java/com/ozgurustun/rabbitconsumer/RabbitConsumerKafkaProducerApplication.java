package com.ozgurustun.rabbitconsumer;

import com.ozgurustun.rabbitconsumer.config.DataRabbitConsumerChannel;
import com.ozgurustun.rabbitconsumer.config.DataKafkaProducerChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding({DataRabbitConsumerChannel.class, DataKafkaProducerChannel.class})
@SpringBootApplication
public class RabbitConsumerKafkaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitConsumerKafkaProducerApplication.class, args);
    }

}
