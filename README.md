
Start zookeeper
```bash
D:\kafka_2.13-3.3.1\bin\windows\zookeeper-server-start.bat D:\kafka_2.13-3.3.1\config\zookeeper.properties
```

Start local kafka
```bash
D:\kafka_2.13-3.3.1\bin\windows\kafka-server-start.bat D:\kafka_2.13-3.3.1\config\server.properties
```

Consume messages on topic
```bash
D:\kafka_2.13-3.3.1\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic MyThirdTopic --from-beginning
```