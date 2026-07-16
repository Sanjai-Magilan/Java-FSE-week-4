package Week1.Module1.FactoryMethodPatternExample;

public class WordDocumentFactory extends DocumentFactory{
        @Override
        public Document createDocument() {
            return new WordDocument();
        }
}
