package Week1.Module1.FactoryMethodPatternExample;

public class TestFactoryMethod {
    public static void main(String[] args) {
        DocumentFactory factory = new WordDocumentFactory();
        Document doc = factory.createDocument();
        doc.createDocument();
        factory = new PdfDocumentFactory();
        doc = factory.createDocument();
        doc.createDocument();
        factory = new ExcelDocumentFactory();
        doc = factory.createDocument();
        doc.createDocument();
    }
}
