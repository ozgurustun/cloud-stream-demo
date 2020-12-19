package com.ozgurustun.rabbitconsumer.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface DataRabbitConsumerChannel {

    String INPUT_CHANNEL = "data-rabbit-consumer-channel";

    @Input(INPUT_CHANNEL)
    MessageChannel inputChannel();

}
