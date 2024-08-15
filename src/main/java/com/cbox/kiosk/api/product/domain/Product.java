package com.cbox.kiosk.api.product.domain;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.BatchSize;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pno;

    private String pname;

    private int price;

    private String pdesc;

    private boolean soldout;

    private boolean delFlag;


    @BatchSize(size = 20)
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true )
    @Builder.Default
    private List<ProductImage> images = new ArrayList<>();

    public void addImage(String name){

        ProductImage pImage = ProductImage.builder().pfname(name)
            .ord(images.size()).build();

        images.add(pImage);

    }

    public void clearImages(){
        images.clear();
    }

    public void changePrice(int price){
        this.price = price;
    }

    public void changePname(String pname){
        this.pname = pname;
    }

    public void changeSold(boolean soldout){
        this.soldout = soldout;
    }

    public void changeDel(boolean delFlag){
        this.delFlag = delFlag;
    }

    
}
