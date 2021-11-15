/**
 * 
 */
package com.crom.mybatis.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ADMIN
 *
 */
@Getter
@Setter
public class Room extends CommonDTO {

	private String roomId;
	private  String roomName;
	private  Double area;
	private  String address;
	private  Double retalPrice;
	private  DefaultPrice defaultPrice;
}
