package com.sqs.messages;
import java.util.List;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.AmazonSQSException;
import com.amazonaws.services.sqs.model.GetQueueUrlRequest;
import com.amazonaws.services.sqs.model.Message;
public class ReceiveMessage {
	public static Object requestSecrets(String url ) {
		return 0;
	}
	private static final String QUEUE_NAME = "https://sqs.us-east-1.amazonaws.com/132292823736/test-sample-fifo-queue.fifo";
	AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
	String queue_url = sqs.getQueueUrl(QUEUE_NAME).getQueueUrl();
	List<Message> messages = sqs.receiveMessage(queue_url).getMessages();
}
