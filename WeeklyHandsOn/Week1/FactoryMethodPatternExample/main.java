public class main {
    public static void main(String[] args) {
        DocumentFactory word = new WordDocumentFactory();
        Document obj1 = word.createDocument();
        obj1.open();
        
        DocumentFactory pdf = new pdfDocumentFactory();
        Document obj2 = pdf.createDocument();
        obj2.open();

        DocumentFactory excel = new excelDocumentFactory();
        Document obj3 = excel.createDocument();
        obj3.open();

    }
}
