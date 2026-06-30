class Computer {

    String processor;
    int ram;


    Computer(Builder builder) {

        processor = builder.processor;
        ram = builder.ram;

    }


    void display() {

        System.out.println(processor);
        System.out.println(ram + " GB RAM");

    }


    static class Builder {

        String processor;
        int ram;


        Builder setProcessor(String processor) {

            this.processor = processor;

            return this;

        }


        Builder setRam(int ram) {

            this.ram = ram;

            return this;

        }


        Computer build() {

            return new Computer(this);

        }

    }

}



public class Builder {

    public static void main(String[] args) {


        Computer c = new Computer.Builder()
                .setProcessor("Intel i5")
                .setRam(8)
                .build();


        c.display();

    }
}