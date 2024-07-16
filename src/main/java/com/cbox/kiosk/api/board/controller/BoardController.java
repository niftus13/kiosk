package com.cbox.kiosk.api.board.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@CrossOrigin
@RequestMapping("/api/board/")
@RequiredArgsConstructor
@Log4j2
public class BoardController {


    @GetMapping("list")
    public void getList(){


        log.info("getList");

    }


}
