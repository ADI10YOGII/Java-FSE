
public interface Document 
{
    void open();
}
class WordDocument implements Document 
{

    @Override
    public void open() 
    {
        System.out.println("Opening Word Document");
    }
}
class PdfDocument implements Document 
{

    @Override
    public void open() 
    {
        System.out.println("Opening PDF Document");
    }
}
class ExcelDocument implements Document 
{

    @Override
    public void open() 
    {
        System.out.println("Opening Excel Document");
    }
}
class DocumentFactory {

    public static Document getDocument(String type) {

        if (type.equalsIgnoreCase("WORD")) {
            return new WordDocument();
        } 
        else if (type.equalsIgnoreCase("PDF")) {
            return new PdfDocument();
        } 
        else if (type.equalsIgnoreCase("EXCEL")) {
            return new ExcelDocument();
        } 
        else {
            throw new IllegalArgumentException("Invalid document type");
        }
    }
}
class FactoryTest 
{

    public static void main(String[] args) 
    {

        Document doc1 = DocumentFactory.getDocument("WORD");
        doc1.open();

        Document doc2 = DocumentFactory.getDocument("PDF");
        doc2.open();

        Document doc3 = DocumentFactory.getDocument("EXCEL");
        doc3.open();
    }
}
