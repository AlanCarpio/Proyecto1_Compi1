package Model;

public class V_G {
    private String LLave;
    private String Valor_llave;
    
    
    public V_G(String _LLave,String _Valor_llave){
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
