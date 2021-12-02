package com.crom.mybatis.service;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import com.crom.mybatis.entity.Bill;
import com.crom.mybatis.mapper.BillMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BillService {

	@Autowired
	private BillMapper billMapper;
	
	public Bill getBills(String roomId, String year, String month){
		String billId = year + month + roomId;
		return billMapper.getBills(billId);
	}

	@Transactional(rollbackFor = Exception.class)
	public void updateBill(String year, String month, Bill bill) {
		try {
			String roomId = StringUtils.leftPad(bill.getRoomId(), 3, "0");
			String prevYear = year;
			String prevMonth = StringUtils.leftPad(String.valueOf(Integer.parseInt(month) - 1), 2, "0");
			if (Integer.parseInt(prevMonth) == 0) {
				prevMonth = "12";
				prevYear = String.valueOf(Integer.parseInt(year) - 1);
			}
			Bill prevBill = billMapper.getBills(prevYear + prevMonth + roomId);
			if(!ObjectUtils.isEmpty(prevBill)) {
				bill.setOldElecVal(prevBill.getNewElecVal());
				bill.setOldWaterVal(prevBill.getNewWaterVal());
			}
			
			String period = year + month;
			bill.setBillId(period + roomId);
			bill.setPeriod(period);
			
			billMapper.updateBill(bill);
		} catch (Exception e) {
			log.error("BillService.updateBill", e.getMessage());
			log.error("LINE: " + e.getStackTrace()[0].getLineNumber());
			throw e;
		}
	}


}

