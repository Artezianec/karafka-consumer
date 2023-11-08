package telran.java48;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KarafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarafkaConsumerApplication.class, args);
	}
	
	@Bean
	public Consumer<String> log() {
		return message -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String[] words = message.split(" ");
			Long t2 = Long.valueOf(words[1]);
			Long t = System.currentTimeMillis();
			System.out.println("Received: " + words[0] + " Time: "+ (t-t2));
		};
	}

}
