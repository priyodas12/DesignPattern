package com.workspace.test_factory_method;

import com.workspace.creator.JSONMessageCreator;
import com.workspace.creator.MessageCreator;
import com.workspace.creator.TextMessageCreator;
import com.workspace.product.Message;

public class TestFactoryMethod {
	
	public static void printMessage(MessageCreator msgc) {
		Message msg=msgc.getMessage();
		System.out.println(msg);
	}

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		
		printMessage(new TextMessageCreator());
	}

}
