package com.crom.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.crom.mybatis.entity.Bill;

@Mapper
public interface BillMapper {
	Bill getBills(String billId);

	void updateBill(Bill bill);
}
