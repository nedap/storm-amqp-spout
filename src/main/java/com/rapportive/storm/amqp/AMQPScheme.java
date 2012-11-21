package com.rapportive.storm.amqp;

import backtype.storm.spout.Scheme;
import com.rabbitmq.client.QueueingConsumer;
import java.util.List;

public interface AMQPScheme extends Scheme {
    public List<Object> deserialize(QueueingConsumer.Delivery delivery);
}
