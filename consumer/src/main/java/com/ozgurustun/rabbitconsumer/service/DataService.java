package com.ozgurustun.rabbitconsumer.service;

import com.ozgurustun.rabbitconsumer.model.DataModel;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class DataService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public DataService(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishData(DataModel data){
        applicationEventPublisher.publishEvent(data);
    }
}
