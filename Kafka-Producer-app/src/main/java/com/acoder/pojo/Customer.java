package com.acoder.pojo;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Customer implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customerName;
	private Integer ustomerId;
	private Double customerAmount;
	
}
