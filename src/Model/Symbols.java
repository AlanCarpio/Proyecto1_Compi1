package Model;

public class Symbols {
    private int Fila;
    private int Columna;
    private String Lexema;
    private String Token;
    
    public Symbols(int _Fila,int _Columna,String _Simbolo,String _Token){
        this.Fila=_Fila;
        this.Columna= _Columna ;
        this.Lexema  = _Simbolo;
        this.Token = _Token;
    }
    public Symbols(int _Fila,int _Columna,String _Simbolo){
        this.Fila=_Fila;
        this.Columna= _Columna ;
        this.Lexema  = _Simbolo;
        this.Token = "Error Lexico";
        
    }

    public String Get_Simbolo(){
        return this.Lexema;
    }
    public int Get_Fila(){
        return this.Fila;
    }
    public int Get_Columna(){
        return this.Columna;
    }
    public String  Get_Token(){
        return this.Token;
    }
}
