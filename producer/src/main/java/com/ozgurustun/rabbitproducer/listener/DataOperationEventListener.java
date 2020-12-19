package com.ozgurustun.rabbitproducer.listener;

import com.ozgurustun.rabbitproducer.config.DataRabbitPublishChannel;
import com.ozgurustun.rabbitproducer.model.DataModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DataOperationEventListener {

    private final DataRabbitPublishChannel dataRabbitPublishChannel;

    public DataOperationEventListener(DataRabbitPublishChannel dataRabbitPublishChannel) {
        this.dataRabbitPublishChannel = dataRabbitPublishChannel;
    }

    @EventListener(value = DataModel.class)
    public void whenDataRequestReceived(DataModel data){
        dataRabbitPublishChannel.outputChannel().send(MessageBuilder.withPayload(data).build());
        log.debug("Data message published to rabbit {} ", data.getData());
    }
}
