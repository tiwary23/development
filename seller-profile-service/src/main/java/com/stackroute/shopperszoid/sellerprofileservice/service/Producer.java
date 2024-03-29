//package com.stackroute.shopperszoid.sellerprofileservice.service;
//
//import com.stackroute.shopperszoid.sellerprofileservice.domain.Seller;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//
//
//@Service
//public class Producer {
//
//    private static final Logger logger= LoggerFactory.getLogger(Producer.class);
//
//    private static final String TOPIC="Seller-Info";
//
//    @Autowired
//    private KafkaTemplate<String, Seller> kafkaTemplate;
//
//    public void sendMessage( Seller seller){
//        logger.info(String.format("#### -> Producing message -> %s",seller));
//        kafkaTemplate.send(TOPIC,seller);
//    }
//}
