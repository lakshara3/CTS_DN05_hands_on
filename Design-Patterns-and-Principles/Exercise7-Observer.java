import java.util.*;


interface Observer {

    void update();

}



class User implements Observer {


    String name;


    User(String name) {

        this.name = name;

    }


    public void update() {

        System.out.println(name + " notified");

    }

}



class Channel {


    ArrayList<Observer> users = new ArrayList<>();


    void addUser(Observer user) {

        users.add(user);

    }


    void notifyUsers() {


        for(Observer user : users) {

            user.update();

        }

    }

}



public class Observer {


    public static void main(String[] args) {


        Channel channel = new Channel();


        channel.addUser(new User("John"));

        channel.addUser(new User("Alex"));


        channel.notifyUsers();


    }

}