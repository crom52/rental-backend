package com.crom.mybatis.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonDTO {

	Date creDt;
	Date updDt;
	String creUsrId;
	String updUsrId;
}
