//Adaptador
public class PDFFormater implements IPDFFormater {
    private ExcelFormater formatador;
    
    public PDFFormater(ExcelFormater formatadorExcel){
        this.formatador = formatadorExcel;
    }

    @Override
    public void extrairPlanilha() {
        System.out.println("Extraindo planilha");       
    }

    public void executaPDF(){
        this.extrairPlanilha();
        this.formatador.executa();
    }
}
