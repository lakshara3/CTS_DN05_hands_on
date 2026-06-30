interface Image {

    void display();

}



class RealImage implements Image {


    public void display() {

        System.out.println("Displaying Image");

    }

}




class ImageProxy implements Image {


    RealImage image;


    public void display() {


        if(image == null) {

            image = new RealImage();

        }


        image.display();

    }

}




public class Proxy {


    public static void main(String[] args) {


        Image image = new ImageProxy();


        image.display();


    }

}