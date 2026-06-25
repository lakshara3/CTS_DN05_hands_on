interface Coffee {

    void cost();

}


class SimpleCoffee implements Coffee {


    public void cost() {

        System.out.println("Coffee price 50");

    }

}



class MilkDecorator implements Coffee {


    Coffee coffee;


    MilkDecorator(Coffee coffee) {

        this.coffee = coffee;

    }



    public void cost() {

        coffee.cost();

        System.out.println("Added Milk");

    }

}



public class Decorator {


    public static void main(String[] args) {


        Coffee coffee = new MilkDecorator(new SimpleCoffee());


        coffee.cost();


    }

}