package com.crom.mybatis.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crom.mybatis.entity.Bill;
import com.crom.mybatis.mapper.BillMapper;

@Service
public class BillService {

	@Autowired
	private BillMapper billMapper;
	
	public Bill getBillByRoomId(String id){
		return billMapper.getBillByRoomId(id);
	}

}

