interface Document {

    void open();

}


class WordDocument implements Document {

    public void open() {

        System.out.println("Word Document Opened");

    }
}


class PdfDocument implements Document {

    public void open() {

        System.out.println("PDF Document Opened");

    }
}


class DocumentFactory {

    Document createDocument(String type) {

        if(type.equals("word")) {

            return new WordDocument();

        }

        return new PdfDocument();
    }
}


public class Factory {

    public static void main(String[] args) {

        DocumentFactory factory = new DocumentFactory();

        Document doc = factory.createDocument("word");

        doc.open();

    }
}