package AnalizadorJson;

import AnalizadorJson.Scanner_Json;
import AnalizadorJson.Parser_Json;
import Model.DoublyLinkedList;
public class Generador_Json {
    public static void compilar(){
        try {
            String ruta = "src/AnalizadorJson/";
            String opcFlex[] = {ruta+"Scanner.jflex","-d",ruta};
            jflex.Main.generate(opcFlex);
            String opcCUP[] = {"-destdir",ruta,"-parser","parser",ruta+"Parser.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    
    public static void Ejecutar(String CodigoFuente,DoublyLinkedList list_json){
        try {
            Scanner_Json scan = new Scanner_Json(new java.io.StringReader(CodigoFuente));
            Parser_Json _parser = new Parser_Json(scan);
            _parser.list_json = list_json;
            _parser.parse();
            
           
            
        } catch (Exception ex) {
             System.out.println("Error: "+ex.getMessage());
        }
    }
    
}
