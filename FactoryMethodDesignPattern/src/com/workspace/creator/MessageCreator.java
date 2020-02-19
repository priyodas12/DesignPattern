package com.workspace.creator;

import com.workspace.product.Message;

/*This is abstract creator class ,concrete subclass will implement createMessage()*/

public abstract class MessageCreator {
	
	public Message getMessage() {
		Message msg=createMessage();
		
		msg.addHefaultHeaders();
		msg.encryptMessage();
		
		return msg;
	}
	
	//Factory Method
	public abstract Message createMessage();
}
