package com.stackroute.shopperszoid.sellerprofileservice.controller;

import com.stackroute.shopperszoid.sellerprofileservice.domain.Seller;
import com.stackroute.shopperszoid.sellerprofileservice.exceptions.DatabaseConnectivityFailedException;
import com.stackroute.shopperszoid.sellerprofileservice.exceptions.SellerAlreadyExistsException;
import com.stackroute.shopperszoid.sellerprofileservice.exceptions.SellerNotFoundException;
//import com.stackroute.shopperszoid.sellerprofileservice.service.Producer;
import com.stackroute.shopperszoid.sellerprofileservice.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/")
@CrossOrigin(value = "*")
public class SellerController {

    private SellerService sellerService;
    //private Producer producer;

    private static ResponseEntity responseEntity;

    @Autowired
    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    //    @Autowired
//    public SellerController(SellerService sellerService, Producer producer) {
//        this.sellerService = sellerService;
//        this.producer = producer;
//    }

    @PostMapping("seller")
    public ResponseEntity<?> saveSeller(@RequestBody Seller seller) throws DatabaseConnectivityFailedException, SellerAlreadyExistsException, Exception{
        Seller savedSeller = sellerService.saveSeller(seller);
        responseEntity = new ResponseEntity<Seller>(savedSeller, HttpStatus.CREATED);
        //this.producer.sendMessage(savedSeller);
        return responseEntity;
    }

    @GetMapping("sellers")
    public ResponseEntity<?> getAllSeller() throws DatabaseConnectivityFailedException, Exception{
        List<Seller> allSeller = sellerService.getAllSeller();
//        this.producer.sendMessage(allSeller);
        responseEntity = new ResponseEntity<List<Seller>>(sellerService.getAllSeller(),HttpStatus.FOUND);
        return responseEntity;
    }

    @GetMapping("seller/{sellerEmail}")
    public ResponseEntity<?> getSellerById(@PathVariable String sellerEmail) throws DatabaseConnectivityFailedException, SellerNotFoundException, Exception{
       responseEntity = new ResponseEntity<Seller>(sellerService.getSellerById(sellerEmail),HttpStatus.FOUND);
       return responseEntity;
    }

    @DeleteMapping("seller/{sellerEmail}")
    public ResponseEntity<?> deleteSellerById(@PathVariable String sellerEmail) throws DatabaseConnectivityFailedException, SellerNotFoundException, Exception{
        responseEntity = new ResponseEntity<Seller>(sellerService.deleteSellerById(sellerEmail),HttpStatus.OK);
        return responseEntity;
    }

    @DeleteMapping("sellers")
    public ResponseEntity<?> deleteAllSeller() throws DatabaseConnectivityFailedException, Exception{
        responseEntity = new ResponseEntity<>(sellerService.deleteAllSeller(),HttpStatus.OK);
        return responseEntity;
    }

    @PutMapping("seller")
    public ResponseEntity<?> updateSeller(@RequestBody Seller seller) throws DatabaseConnectivityFailedException, SellerNotFoundException, Exception{
        responseEntity = new ResponseEntity<Seller>(sellerService.updateSeller(seller),HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping("sellers/{sellerName}")
    public ResponseEntity<?> getSellerByName(@PathVariable String sellerName) throws DatabaseConnectivityFailedException, SellerNotFoundException, Exception{

        responseEntity = new ResponseEntity<List<Seller>>(sellerService.getSellerByName(sellerName),HttpStatus.FOUND);
        return  responseEntity;
    }
}
