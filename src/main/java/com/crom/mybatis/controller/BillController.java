package com.crom.mybatis.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity.BodyBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crom.mybatis.entity.Bill;
import com.crom.mybatis.service.BillService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/bill")
@Slf4j
public class BillController {

    @Autowired
    private BillService billService;
    
	@GetMapping("/{roomId}/{year}/{month}/current-month")
	public Bill getCurrentBill(@PathVariable("roomId") String roomId, @PathVariable("month") String month,
			@PathVariable("year") String year) {
		return billService.getCurrentBill(roomId, year, month);
	}
	
	@GetMapping("/{roomId}/{year}/{month}/prev-month")
	public Bill getPrevBill(@PathVariable("roomId") String roomId, @PathVariable("month") String month,
			@PathVariable("year") String year) {
		return billService.getPrevBill(roomId, year, month);
	}

	@PostMapping("/{roomId}/{year}/{month}/update")
	@ResponseBody
	public ResponseEntity<Bill> updateBill(@PathVariable("roomId") String roomId, @PathVariable("month") String month,
			@PathVariable("year") String year, @RequestBody Bill params) {
		try {
			 billService.updateBill(year, month, params);
			 return new ResponseEntity<Bill>(params, HttpStatus.OK);
		} catch (Exception e) {
			log.error("BillControler.updateBill", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}

