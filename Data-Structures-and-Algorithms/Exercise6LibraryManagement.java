public class Exercise6LibraryManagement {


    public static void main(String[] args) {


        String books[]={"C","Java","Python","DBMS"};


        String search="Java";


        for(int i=0;i<books.length;i++) {

            if(books[i].equals(search)) {

                System.out.println("Book Found at index "+i);
                return;
            }
        }


        System.out.println("Book Not Found");
    }
}