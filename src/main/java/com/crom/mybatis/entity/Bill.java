/**
 * 
 */
package com.crom.mybatis.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ADMIN
 *
 */

@Getter
@Setter
public class Bill extends CommonDTO {
		
	private String billId;
	private String roomId;
	private Double total;
	private String renterId;
	private Double rentalPrice;
	private Date billDt;
	private Integer oldElecVal;
	private Integer newElecVal;
	private Integer oldWaterVal;
	private Integer newWaterVal;
	private String period;
}
