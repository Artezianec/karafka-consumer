package telran.java48.model;


import lombok.*;

import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Message {
    String name;
    Long timeCreateMessage;
    public Message(String name) {
        this.name = name;
        this.timeCreateMessage = System.currentTimeMillis();
    }
}
