package com.ozgurustun.rabbitconsumer.handler;

import com.ozgurustun.rabbitconsumer.model.DataModel;
import com.ozgurustun.rabbitconsumer.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import static com.ozgurustun.rabbitconsumer.config.DataRabbitConsumerChannel.INPUT_CHANNEL;

@Slf4j
@Service
public class MessageHandler {

    private final DataService dataService;

    public MessageHandler(DataService dataService) {
        this.dataService = dataService;
    }

    @StreamListener(INPUT_CHANNEL)
    public void handleMessage(DataModel dataModel) {
        log.debug("Data message consumed from rabbit {}", dataModel.getData());
        dataService.publishData(dataModel);
    }

}