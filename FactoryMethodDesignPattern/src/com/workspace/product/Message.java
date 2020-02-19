package com.workspace.product;

public abstract class Message {
	
	public abstract String getContent();
	
	public void addHefaultHeaders() {
		//add mandatory headers
	}
	public void encryptMessage() {
		//encrypt message body
	}

}
