package Model;


public class Symbols_Json {
    private String LLave;
    private String Valor_llave;
    
    
    public Symbols_Json(String _LLave,String _Valor_llave){
        this.LLave = _LLave;
        this.Valor_llave = _Valor_llave;
    }
    public String Get_Valor_llave() {
        return Valor_llave;
    }
    public String Get_LLave(){
        return this.LLave;
    }
}
