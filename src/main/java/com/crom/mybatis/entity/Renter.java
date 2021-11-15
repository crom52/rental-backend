package com.crom.mybatis.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Renter extends CommonDTO {

	private String renterId;
	private Integer age;
	private String renterName;
	private Date stRntDt;
	private Date endRntDt;
}
