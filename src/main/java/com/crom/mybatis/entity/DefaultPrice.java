/**
 * 
 */
package com.crom.mybatis.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DefaultPrice extends CommonDTO {
	private String roomId;
	private Double elecPrice;
	private Double waterPrice;
	private Double retalPrice;
	private Double otherPrices;
}
