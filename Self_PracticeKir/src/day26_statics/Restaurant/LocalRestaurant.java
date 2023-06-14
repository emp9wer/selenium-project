package src.day26_statics.Restaurant;

import java.time.LocalDate;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restraunt onionHeaven = new Restraunt("Kir Kan","Tampa",10);

         Server[] servers = {new Server("Fedya Knopkin",222,22,true, LocalDate.of(2021,12,1)),new Server("Petya F",33,21,false,LocalDate.of(2023,11,3))};

          onionHeaven.hireServer(servers);

         Chef[] chefs = {new Chef("Alex B",212,25,true),new Chef("Mike P",553,23,false)};

          onionHeaven.hireChef(chefs);

          System.out.println(onionHeaven);

          onionHeaven.servers.get(0).takeOrder();
          onionHeaven.chefs.get(0).makeOrder();
          onionHeaven.servers.get(1).cleanTable();
          onionHeaven.chefs.get(1).washDishes();

          onionHeaven.terminateChef(212);
        System.out.println(onionHeaven);
        System.out.println("-------------------");
        for (Server server : servers) {
            System.out.println(server);
        }

    }
}
