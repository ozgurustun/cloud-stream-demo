## Spring Cloud Stream Demo application with kafka and rabbit binder.

Producer module is running on 8081 and when user sends post request to /data api, event will be triggered and message will be sent to rabbitmq.
Consumer module consumes messages which are sent by producer module with rabbitmq and message is sent to kafka topic.

To run application just start compose with docker-compose up command.
