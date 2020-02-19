package com.workspace.product;

public class JSONMessage  extends Message{

	@Override
	public String getContent() {
		
		return "{\r\n" + 
				"    \"date\": \"01/02/2020\",\r\n" + 
				"    \"type\": \"short\",\r\n" + 
				"    \"content\": \"Have a nice Feb\"\r\n" + 
				"}";
	}

}
