package week11.week11practice;

import java.time.LocalDate;

public class Runner {

    public static void main(String[] args) {
        System.out.println("-------DiscordUser---------");
        DiscordUser discordUser = new DiscordUser("User", "Vasil", "n11111", LocalDate.of(1988, 1, 2));
        System.out.println(discordUser);
        discordUser.sendMessage();//"Sending message to class chat"
        discordUser.joinDiscord("sfghsgs@asdfgadf");
        System.out.println("-------------Admin---------------");

        Admin admin = new Admin("Petya", "o0191919", LocalDate.of(1998, 04, 05));
        admin.sendMessage(); //"Sending announcement"
        admin.joinDiscord("dgsdgsdg");
        admin.createChannel();
        System.out.println(admin);

        System.out.println("---------------Student--------------");

        Student student = new Student("Muhtar", "g6667648", LocalDate.of(2008, 7, 23));
        student.sendMessage("Vasil"); //"print Sending message to $name"
        student.joinDiscord("dgsdgsdg");
        System.out.println(student);

    }
}