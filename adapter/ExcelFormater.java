public class ExcelFormater implements IExcelFormater {
    @Override
    public void formatarColunas() {
        System.out.println("Col A, Col B, Col C...");        
    }

    @Override
    public void formatarEstilo() {
        System.out.println("Adicionando logo do cliente...");        
        
    }

    @Override
    public void formatarLinhas() {
        System.out.println("Formatando linhas...");        
        
    }    

    public void executa(){
        // Extrair do PDF a planilha
        this.formatarColunas();
        this.formatarLinhas();
        this.formatarEstilo();
    }
}
