package com.stackroute.shopperszoid.sellerprofileservice.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "seller")
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Seller {

    @Id
    private String sellerEmail;
    private String sellerName;
    private long sellerPhone;
    private String sellerAddress;
    private String sellerGstIn;
    private double sellerRating;
    private List<Product> sellerProducts;
}
