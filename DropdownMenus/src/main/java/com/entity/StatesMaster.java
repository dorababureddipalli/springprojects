package com.entity;

import lombok.Data;

@Data
public class StatesMaster {

	//@Id
	private Integer stateId;
	private String stateName;
	private String stateCode;

	public StatesMaster(int i, String string, String string2) {
		this.stateId=i;
		this.stateName=string;
		this.stateCode=string2;
		// TODO Auto-generated constructor stub
	}
}
