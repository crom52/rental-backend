package com.crom.mybatis.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crom.mybatis.entity.Bill;
import com.crom.mybatis.service.BillService;

@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillService billService;
    
    @GetMapping("/{roomId}")
    public Bill getBillByRoomId(@PathVariable("roomId") String roomId){
        return billService.getBillByRoomId("R01");
    }
}


