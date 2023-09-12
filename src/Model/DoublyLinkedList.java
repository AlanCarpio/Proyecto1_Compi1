package Model;
import Model.Nodo;
import Model.Symbols;
import Model.Symbols_Json;
import Model.Json_files;
import Model.V_G;
import Model.DatosEjex;
import Model.DatosValores;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
public class DoublyLinkedList {
    private Nodo Inicio;
    private Nodo Final;
    public DoublyLinkedList(){
        this.Inicio = null;
        this.Final = null;
    }
    
    /*------------------------------------------------------------- */
    // Insertar Simbolos del Scanner
    public void Insertar_Symbolo(Symbols dato){
        Nodo NuevoNodo = new Nodo(dato);
        if (Inicio == null) {
            Inicio = Final = NuevoNodo;
        }
        else{
            NuevoNodo.Anterior = Final;
            Final.Siguiente = NuevoNodo;
            Final = NuevoNodo;
        }
    }
    // Insertar Datos de json 
    public void Insertar_Symbolo_Json(Symbols_Json dato){
        Nodo NuevoNodo = new Nodo(dato);
        if (Inicio == null) {
            Inicio = Final = NuevoNodo;
        }
        else{
            NuevoNodo.Anterior = Final;
            Final.Siguiente = NuevoNodo;
            Final = NuevoNodo;
        }
    }
    // Insertar Archivos Json
    public void Insertar_Symbolo(Json_files dato){
        Nodo NuevoNodo = new Nodo(dato);
        if (Inicio == null) {
            Inicio = Final = NuevoNodo;
        }
        else{
            NuevoNodo.Anterior = Final;
            Final.Siguiente = NuevoNodo;
            Final = NuevoNodo;
        }
    }
    // Insertar Datos de la funcion Variables Globales
    public void Insertar_V_G(V_G dato){
        Nodo NuevoNodo = new Nodo(dato);
        if (Inicio == null) {
            Inicio = Final = NuevoNodo;
        }
        else{
            NuevoNodo.Anterior = Final;
            Final.Siguiente = NuevoNodo;
            Final = NuevoNodo;
        }
    }
    // Insertar Datos en la lista de Ejex
    public void Insertar_DatosEjex(DatosEjex dato){
         Nodo NuevoNodo = new Nodo(dato);
        if (Inicio == null) {
            Inicio = Final = NuevoNodo;
        }
        else{
            NuevoNodo.Anterior = Final;
            Final.Siguiente = NuevoNodo;
            Final = NuevoNodo;
        }
    }
    // Insertar datos en la lista de valores
    public void Insertar_DatosValores(DatosValores dato){
         Nodo NuevoNodo = new Nodo(dato);
        if (Inicio == null) {
            Inicio = Final = NuevoNodo;
        }
        else{
            NuevoNodo.Anterior = Final;
            Final.Siguiente = NuevoNodo;
            Final = NuevoNodo;
        }
    }
    /*-------------------------------------------------------------- */
    
    //Iterar simbolos de leidos en el scanner
    public void Iterar_Simbolos_tokens(){
        Nodo aux = Inicio;
        while (aux !=null){
            System.out.println("Lexema: "+aux.symbols.Get_Simbolo()+"Token: "+aux.symbols.Get_Token()+" Fila: "+aux.symbols.Get_Fila()+" Columna: "+aux.symbols.Get_Columna());
            aux = aux.Siguiente;
        }
    }
    // Iterar simbolos no esperados en el lenguaje
    public void Iterar_Simbolos_Error(){
        Nodo aux = Inicio;
        while (aux !=null){
            System.out.println("Error Lexico Encontrado: "+ aux.symbols.Get_Simbolo());
            aux = aux.Siguiente;
        }
    }
    // Iterar funcion Variables Globales
    public void Iterar_D_G(){
        Nodo aux = Inicio;
        while (aux !=null){
            System.out.println("LLave: "+aux.v_g.Get_LLave()+"|||"+"Valor: "+aux.v_g.Get_Valor_llave());
            aux = aux.Siguiente;
        }
    }
    // Obtener la lista de datos de un archivo json por medio de su nombre
    public DoublyLinkedList Get_List_json(String file_name){
        Nodo aux = Inicio;
        while (aux != null) {
            if (aux.json_files.Get_file_name().equalsIgnoreCase(file_name)) {
                
                return aux.json_files.Get_list_data_json();

            }
            aux = aux.Siguiente;
        }
        return null;
    }
    // Iterar lista de los datos de un archivo json
    public String Iterar_Archivos_json(String file_json){
        Nodo aux = Inicio;
        String aux_string = "";
        while (aux != null){
            if (aux.json_files.Get_file_name().equalsIgnoreCase(file_json)){
                aux_string = aux_string + "Nombre Archivo Json: "+aux.json_files.Get_file_name()+"\n";
                aux_string = aux_string + "    " + "Datos{\n";
                Nodo aux2 = aux.json_files.Get_list_data_json().Inicio;
                while(aux2 != null){
                    aux_string = aux_string +"        " +"LLave: "+aux2.symbols_json.Get_LLave()+"Dato: "+aux2.symbols_json.Get_Valor_llave()+"\n";
                    aux2 = aux2.Siguiente;
                }
                
            }
            aux = aux.Siguiente;
        }
        return aux_string;
    }
    //Busqueda en la lista de archivos Json por medio de su nombre y su llave
    public String busqueda_simbols_json_llave(String file_json,String llave){
        Nodo aux = Inicio;
        while (aux != null){
            if (aux.json_files.Get_file_name().equalsIgnoreCase(file_json)){
                Nodo aux2 = aux.json_files.Get_list_data_json().Inicio;
                while(aux2 != null){
                    if (aux2.symbols_json.Get_LLave().equalsIgnoreCase(llave)){
                        return aux2.symbols_json.Get_Valor_llave();
                    }
                    aux2 = aux2.Siguiente;
                }
            }
            aux = aux.Siguiente;
        }
        return "0";
    } 
    // Busqueda en lista de variables globales 
    public String busqueda_list_V_G(String llave){
        Nodo aux = Inicio;
        while (aux != null){
            if (aux.v_g.Get_LLave().equalsIgnoreCase(llave)) {
                return aux.v_g.Get_Valor_llave();
            }
            aux = aux.Siguiente;
        }
        return "Null";
    }
    // Imprimir valores da grafico barras
    public DefaultCategoryDataset valores_list_grafica_barras(DoublyLinkedList list_valores){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Nodo aux = Inicio;
        Nodo aux2 = list_valores.Inicio;
        while (aux != null && aux2 != null) {            
            dataset.addValue(aux2.Datos_Valores.Get_valor(), aux.Datos_Ejex.Get_valor(), aux.Datos_Ejex.Get_valor());
            aux = aux.Siguiente;
            aux2 = aux2.Siguiente;
        }
        
        return dataset;
    }
    public DefaultPieDataset valores_list_grafica_pie(DoublyLinkedList list_valores){
        DefaultPieDataset dataset = new DefaultPieDataset();
        Nodo aux = Inicio;
        Nodo aux2 = list_valores.Inicio;
        while (aux != null && aux2 != null) {            
            dataset.setValue(aux.Datos_Ejex.Get_valor(), aux2.Datos_Valores.Get_valor());
            aux = aux.Siguiente;
            aux2 = aux2.Siguiente;
        }
        
        return dataset;
    }
}
