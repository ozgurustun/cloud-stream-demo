package com.ozgurustun.rabbitproducer.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface DataRabbitPublishChannel {

    String OUTPUT = "data-rabbit-publish-channel";

    @Output(OUTPUT)
    MessageChannel outputChannel();
}
