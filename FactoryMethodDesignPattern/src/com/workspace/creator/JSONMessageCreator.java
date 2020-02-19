package com.workspace.creator;

import com.workspace.product.JSONMessage;
import com.workspace.product.Message;

public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

}
