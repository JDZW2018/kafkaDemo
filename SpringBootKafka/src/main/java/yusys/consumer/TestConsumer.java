package yusys.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * kafka消费者测试
 */
@Component
public class TestConsumer {
    //一条消息会分配到topic下的某一个分区内，
    @KafkaListener(topics = "test")
    public void listen1 (ConsumerRecord<?, ?> record) throws Exception {
        //System.out.printf("topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
        System.out.println("listen1: "+record.toString());
    }
    @KafkaListener(topics = "test")
    public void listen2(ConsumerRecord<?,?> record){
        System.out.println("listen2: "+record.toString());
    }
    @KafkaListener(topics = "test")
    public void listen3(ConsumerRecord<?,?> record){
        System.out.println("listen3："+record.toString());
    }
}
