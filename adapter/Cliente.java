public class Cliente {
    public static void main(String[] args) {
        //Adaptado
        ExcelFormater excelFormater = new ExcelFormater();
        //Adaptador
        PDFFormater pdfFormater = new PDFFormater(excelFormater);

        //Cria lógica de seleção entre PDF e Excel

        pdfFormater.executaPDF();
    }   
}
