package com.workspace.creator;

import com.workspace.product.Message;
import com.workspace.product.TextMessage;

public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}

}
