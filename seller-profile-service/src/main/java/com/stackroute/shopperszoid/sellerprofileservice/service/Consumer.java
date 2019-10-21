//package com.stackroute.shopperszoid.sellerprofileservice.service;
//
//import com.stackroute.shopperszoid.sellerprofileservice.domain.Seller;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class Consumer {
//
//    private final Logger logger = LoggerFactory.getLogger(Consumer.class);
//
//    @KafkaListener(topics = "Seller-Info", groupId = "seller-id",containerFactory = "kafkaListenerContainerFactory")
//    public void consume(Seller seller){
//        logger.info(String.format("#### -> Consumed message -> %s",seller));
//    }
//}
