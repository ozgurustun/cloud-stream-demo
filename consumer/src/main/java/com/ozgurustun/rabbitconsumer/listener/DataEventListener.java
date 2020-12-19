package com.ozgurustun.rabbitconsumer.listener;

import com.ozgurustun.rabbitconsumer.config.DataKafkaProducerChannel;
import com.ozgurustun.rabbitconsumer.model.DataModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DataEventListener {

    private final DataKafkaProducerChannel kafkaProducerChannel;

    public DataEventListener(DataKafkaProducerChannel kafkaProducerChannel) {
        this.kafkaProducerChannel = kafkaProducerChannel;
    }
    
    @EventListener(DataModel.class)
    public void whenDataRequestReceived(DataModel data){
        kafkaProducerChannel.outputChannel().send(MessageBuilder.withPayload(data).build());
        log.debug("Data message published to kafka {}", data.getData());
    }

}
