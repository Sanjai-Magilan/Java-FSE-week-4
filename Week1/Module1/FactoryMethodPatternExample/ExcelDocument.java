package Week1.Module1.FactoryMethodPatternExample;

public class ExcelDocument implements Document{
    @Override
    public void createDocument(){
        System.out.println("Excel document created");
    }
}
