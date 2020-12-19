package com.ozgurustun.rabbitconsumer.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface DataKafkaProducerChannel {

    String OUTPUT = "data-kafka-producer-channel";

    @Output(OUTPUT)
    MessageChannel outputChannel();

}
