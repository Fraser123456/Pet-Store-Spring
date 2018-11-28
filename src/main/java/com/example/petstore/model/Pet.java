package com.example.petstore.model;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@Document(collection = "pet")
public class Pet {
    private @Id String id;
    private Long cost;
    private Integer numberInStock;
    private String itemName;
    private String pictureURL;

    public void setId(String id) {
        this.id = id;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public void setNumberInStock(Integer numberInStock) {
        this.numberInStock = numberInStock;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public String getId() {
        return id;
    }

    public Long getCost() {
        return cost;
    }

    public Integer getNumberInStock() {
        return numberInStock;
    }

    public String getItemName() {
        return itemName;
    }

    public String getPictureURL() {
        return pictureURL;
    }
}
