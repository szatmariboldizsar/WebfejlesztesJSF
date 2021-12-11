package com.jsf.spring.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SHOE_MASTER")
public class Shoe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SHOE_ID")
    private Long shoeId;
    @Column(name = "SHOE_Brand")
    private String shoeBrand;
    @Column(name = "Shoe_Model")
    private String shoeModel;
    @Column(name = "Shoe_Colorway")
    private String shoeColorway;
    @Column(name = "Shoe_Size")
    private String shoeSize;


    public Long getShoeId() {
        return shoeId;
    }

    public void setShoeId(Long shoeId) {
        this.shoeId = shoeId;
    }

    public String getShoeBrand() {
        return shoeBrand;
    }

    public void setShoeBrand(String shoeBrand) {
        this.shoeBrand = shoeBrand;
    }

    public String getShoeModel() {
        return shoeModel;
    }

    public void setShoeModel(String shoeName) {
        this.shoeModel = shoeName;
    }

    public String getShoeColorway() {
        return shoeColorway;
    }

    public void setShoeColorway(String shoeColorway) {
        this.shoeColorway = shoeColorway;
    }

    public String getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(String shoeSize) {
        this.shoeSize = shoeSize;
    }



}
