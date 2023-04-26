package src.week11.week11practice;

//Create an DiscordUser class

import java.time.LocalDate;

public class DiscordUser {

    private String  role, name, id;
    private LocalDate accountCreationDate;


    public DiscordUser(String role, String name, String id, LocalDate accountCreationDate) {
       setRole(role);
       setName(name);
       setId(id);
       setAccountCreationDate(accountCreationDate);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(LocalDate accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    //- create a method sendMessage()
    //	    	prints: "Sending message to class chat"

    public void sendMessage(){
        System.out.println("Sending message to class chat");
    }

    //- create a method joinDiscord(String discordUrl)
    //	    	prints: "Joining $discordUrl"

    public void joinDiscord(String discordUrl){
        System.out.println("Joining "+discordUrl);
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", accountCreationDate=" + accountCreationDate +
                '}';
    }
}
