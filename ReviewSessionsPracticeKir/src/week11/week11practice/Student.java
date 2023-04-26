package src.week11.week11practice;

import java.time.LocalDate;

public class Student extends DiscordUser{

    public Student(String name, String id, LocalDate accountCreationDate) {
        super("Student", name, id, accountCreationDate);
    }


    public void sendMessage(String name) {
        System.out.println("Sending message to "+name);
    }
}
