//DEFINE DOCUMENT INTERFACE
interface Document {
    void open();
}

//CREATE CONCRETE DOCUMENT CLASSES
class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word document.");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document.");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel document.");
    }
}

//IMPLEMENT THE FACTORY METHOD
//ABSTRACT FACTORY
//DocumentFactory.java
abstract class DocumentFactory {
    public abstract Document createDocument();  // Factory Method
}

//CONCRETE FACTORIES
//WordDocumentFactory.java
class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

//PdfDocumentFactory.java
class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

//ExcelDocumentFactory.java
class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

//TEST THE FACTORY METHOD
public class FactoryMethodPatternExample {
    public static void main(String[] args) {

        // Create Word document
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.open();

        // Create PDF document
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        // Create Excel document
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}

