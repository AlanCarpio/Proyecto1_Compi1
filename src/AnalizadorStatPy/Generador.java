package AnalizadorStatPy;
import AnalizadorStatPy.Scanner;
import AnalizadorStatPy.parser;
import Model.DoublyLinkedList;
import Model.GraficaBarras;
import Model.GraficaPie;
import PagesHtml.PageHTML;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Generador {
    public static void compilar(){
        try {
            String ruta = "src/AnalizadorStatPy/";
            String opcFlex[] = {ruta+"Scanner.jflex","-d",ruta};
            jflex.Main.generate(opcFlex);
            String opcCUP[] = {"-destdir",ruta,"-parser","parser",ruta+"Parser.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    public static String Ejecutar(String CodigoFuente,DoublyLinkedList _list_V_G,DoublyLinkedList _list_json,GraficaBarras list_grafica_barras, GraficaPie list_grafica_pie,PageHTML pagina){
        try {
            Scanner scan = new Scanner(new java.io.StringReader(CodigoFuente));
            
            parser _parser = new parser(scan);
            //_parser.list_V_G = list_V_G;
            _parser.div_list_V_G(_list_V_G);
            _parser.List_json(_list_json);
            _parser.div_list_Grafica_barras(list_grafica_barras);
            _parser.div_list_Grafica_Pie(list_grafica_pie);
            _parser.parse();
            pagina.Insertar_datos_pagina_tokens(scan.List_Tokens_Scanner);
            if (scan.List_Error_Scanner != null){
                JOptionPane.showMessageDialog(new JFrame(), "Se encontro errores lexicos\n revisar la parte de reportes\n para mas informacion", "Alert", JOptionPane.INFORMATION_MESSAGE);
                pagina.Insertar_datos_pagina_tokens_error(scan.List_Error_Scanner);
            }
            //System.out.println("Analisis Hecho correctamente");
            //scan.List_Tokens_Scanner.Iterar_Simbolos_tokens();
            //scan.List_Error_Scanner.Iterar_Simbolos();
            
            return _parser.out;
        } catch (Exception ex) {
             System.out.println("Error: "+ex.getMessage());
        }
        return "No hay archivo";
    }
}
