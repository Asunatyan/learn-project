package demo.mykafka;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;
import org.apache.kafka.common.PartitionInfo;

import java.util.List;
import java.util.Map;

/**
 * 鑷畾涔� 鐢熶骇鑰呯殑鍒嗗尯绛栫暐
 */
public class KafkaPartitioner implements Partitioner {

    @Override
    public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {

        /*List<PartitionInfo> partitions = cluster.partitionsForTopic(topic);
        return ThreadLocalRandom.current().nextInt(partitions.size());*/

        /*List<PartitionInfo> partitions = cluster.partitionsForTopic(topic);
        return Math.abs(key.hashCode()) % partitions.size();*/

        List<PartitionInfo> partitions = cluster.partitionsForTopic(topic);
        return partitions.stream().filter(p -> isSouth(p.leader().host())).map(PartitionInfo::partition).findAny().get();

    }

    private static boolean isSouth(String host) {
        //鍏蜂綋鐨勫垽鏂環ost鐨勬柟娉�
        return true;
    }

    @Override
    public void close() {

    }

    @Override
    public void configure(Map<String, ?> configs) {

    }

    public static void main(String[] args) {
        /*List<String> partitions = new ArrayList<>();
        partitions.add("1");
        partitions.add("2");
        partitions.add("3");
        partitions.add("4");
        Stream<String> stringStream = partitions.stream().filter(p -> isSouth("123"));
        Stream<String> stringStream1 = stringStream.map(String::toString);
        Optional<String> any = stringStream1.findAny();
        String s = any.get();
        System.out.println(s);*/
    }
}
