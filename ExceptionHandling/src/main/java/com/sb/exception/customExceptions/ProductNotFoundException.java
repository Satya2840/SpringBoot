package com.sb.exception.customExceptions;

public class ProductNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorCode;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public ProductNotFoundException(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}
	
	
	

}
