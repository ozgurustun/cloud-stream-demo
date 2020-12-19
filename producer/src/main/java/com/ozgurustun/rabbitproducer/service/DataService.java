package com.ozgurustun.rabbitproducer.service;

import com.ozgurustun.rabbitproducer.model.DataModel;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public DataService(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishData(DataModel data){
        applicationEventPublisher.publishEvent(data);
    }
}
