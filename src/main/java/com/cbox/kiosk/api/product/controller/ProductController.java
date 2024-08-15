package com.cbox.kiosk.api.product.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbox.kiosk.api.common.pageDTO.PageResponseDTO;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@CrossOrigin
@RequestMapping("/api/product/")
@RequiredArgsConstructor
@Log4j2
public class ProductController {

    @GetMapping("list")
    public void list(){
       log.info("getList"); 
       
    }
    
}
