package Week1.Module1.FactoryMethodPatternExample;

public class PdfDocument implements  Document{
    @Override
    public void createDocument() {
        System.out.println("Pdf document created");
    }
}
