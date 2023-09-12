package Model;

public class Nodo {
    public Nodo Siguiente;
    public Nodo Anterior;
    public Symbols symbols;
    public Symbols_Json symbols_json;
    public Json_files json_files;
    public V_G v_g;
    public GraficaBarras Grafica_Barras;
    public GraficaPie Grafica_Pie;
    public DatosEjex Datos_Ejex;
    public DatosValores Datos_Valores;
    public Nodo(Symbols _Dato){
        this.symbols = _Dato;
        this.Anterior = null;
        this.Siguiente = null;
    }
    public Nodo(Symbols_Json _Dato){
        this.symbols_json = _Dato;
        this.Anterior = null;
        this.Siguiente = null;
    }
    public Nodo(Json_files _Dato){
        this.json_files = _Dato;
        this.Anterior = null;
        this.Siguiente = null;
    }
    public Nodo(V_G _Dato){
        this.v_g = _Dato;
        this.Anterior = null;
        this.Siguiente = null;
    }
    public Nodo(DatosEjex _Dato){
        this.Datos_Ejex = _Dato;
    }
    public Nodo(DatosValores _Dato){
        this.Datos_Valores = _Dato;
    }
    
}
