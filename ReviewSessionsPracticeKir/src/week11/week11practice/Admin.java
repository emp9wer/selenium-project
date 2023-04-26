package src.week11.week11practice;

import java.time.LocalDate;

public class Admin extends DiscordUser{

    public Admin(String name, String id, LocalDate accountCreationDate) {
        super("Admin", name, id, accountCreationDate);
    }

    public void createChannel(){
        System.out.println("Creating new discord channel");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending announcement");
    }
}
