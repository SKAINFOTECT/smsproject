package com.ska.sms.exception;

public class StudentNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 9118292523366283476L;
	private String uuid;

	public StudentNotFoundException(String uuid) {
		super(String.format("Student not found for given uuid -%s", uuid));
		this.uuid = uuid;
	}

	public String getUuid() {
		return uuid;
	}

}
