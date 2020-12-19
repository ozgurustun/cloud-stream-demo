package com.ozgurustun.rabbitproducer.controller;

import com.ozgurustun.rabbitproducer.model.DataModel;
import com.ozgurustun.rabbitproducer.service.DataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @PostMapping("/data")
    public ResponseEntity<Void> sendMessage(@RequestBody DataModel data){
        dataService.publishData(data);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
