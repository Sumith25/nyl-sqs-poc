package com.sqs.messages;
import java.util.ArrayList;

public class RecursiveReadQueue {
	public static ArrayList<Object> readMessages (ArrayList<Object> messages, ArrayList<Object> queMessgages) {
        System.out.print(messages);
		messages.addAll(queMessgages);
        return messages;
    }
}
