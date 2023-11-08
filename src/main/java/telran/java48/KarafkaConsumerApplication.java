package telran.java48;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import telran.java48.model.Message;

@SpringBootApplication
public class KarafkaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KarafkaConsumerApplication.class, args);
    }

    @Bean
    public Consumer<Message> log() {
        return message -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Long timeReceived = System.currentTimeMillis();
            System.out.println("Received " +  message.getName() + " time the message was received " + (timeReceived-message.getTimeCreateMessage()));
        };
    }

}
