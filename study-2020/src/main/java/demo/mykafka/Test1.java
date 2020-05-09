package demo.mykafka;

import com.google.gson.GsonBuilder;
import org.apache.kafka.clients.producer.*;

import java.util.Date;
import java.util.Properties;
import java.util.concurrent.Future;

public class Test1 {
    public static void main(String[] args) {
        Message message = new Message();
        message.setId(System.currentTimeMillis());
        message.setMsg("sendMessage");
        message.setSendTime(new Date());

        String messageJson = new GsonBuilder().create().toJson(message);


        Properties props = new Properties();
        props.put("bootstrap.servers", "129.211.65.95:9092");
        props.put("acks", "all");
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);

        props.put("buffer.memory", 33554432);// 32MB
        props.put("retries", 1);
        props.put("max.in.flight.requests.per.connection", 2);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        Producer<String, String> producer = new KafkaProducer<String, String>(props);

        ProducerRecord<String, String> record = new ProducerRecord<>("mykafka", "Kafka_Products", messageJson);//Topic Key Value
        try {
            Future future = producer.send(record, (recordMetadata, e) -> {
                System.out.println("-------------------------------------------yes");
            });
            future.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        producer.close();
    }


    class DemoProducerCallback implements Callback {
        @Override
        public void onCompletion(RecordMetadata recordMetadata, Exception e) {
            if (e != null) {
                e.printStackTrace();
            }
        }
    }
}
