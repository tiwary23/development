package com.stackroute.shopperszoid.sellerprofileservice.repository;

import com.stackroute.shopperszoid.sellerprofileservice.domain.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository extends MongoRepository<Seller,String> {

    /**findBySellerName method to get seller by its name*/
    public List<Seller> findBySellerName(String sellerName);

}
