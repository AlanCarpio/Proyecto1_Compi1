
package PagesHtml;
import Model.DoublyLinkedList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class PageHTML {
    public String pagina_html = "";
    public String pagina_html_error = "";
    public PageHTML(){
        pagina_html += "<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"    <style>\n" +
"        /* Estilo para la tabla de errores léxicos */\n" +
"        table.error-table {\n" +
"            border-collapse: collapse;\n" +
"            width: 80%;\n" +
"            margin: 20px;\n" +
"        }\n" +
"\n" +
"        table.error-table th, table.error-table td {\n" +
"            border: 1px solid #ddd;\n" +
"            padding: 8px;\n" +
"            text-align: left;\n" +
"        }\n" +
"\n" +
"        table.error-table th {\n" +
"            background-color: #f2f2f2;\n" +
"        }\n" +
"\n" +
"        /* Estilo para la tabla de tokens */\n" +
"        table.token-table {\n" +
"            border-collapse: collapse;\n" +
"            width: 80%;\n" +
"            margin: 20px;\n" +
"        }\n" +
"\n" +
"        table.token-table th, table.token-table td {\n" +
"            border: 1px solid #ddd;\n" +
"            padding: 8px;\n" +
"            text-align: left;\n" +
"        }\n" +
"\n" +
"        table.token-table th {\n" +
"            background-color: #f2f2f2;\n" +
"        }\n" +
"\n" +
"        /* Estilo para los títulos */\n" +
"        h1 {\n" +
"            font-size: 24px;\n" +
"            color: #333;\n" +
"            text-align: center;\n" +
"            margin: 20px 0;\n" +
"        }\n" +
"    </style>\n" +
"</head>\n" +
"<body>\n";
pagina_html_error += "<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"    <style>\n" +
"        /* Estilo para la tabla de errores léxicos */\n" +
"        table.error-table {\n" +
"            border-collapse: collapse;\n" +
"            width: 80%;\n" +
"            margin: 20px;\n" +
"        }\n" +
"\n" +
"        table.error-table th, table.error-table td {\n" +
"            border: 1px solid #ddd;\n" +
"            padding: 8px;\n" +
"            text-align: left;\n" +
"        }\n" +
"\n" +
"        table.error-table th {\n" +
"            background-color: #f2f2f2;\n" +
"        }\n" +
"\n" +
"        /* Estilo para la tabla de tokens */\n" +
"        table.token-table {\n" +
"            border-collapse: collapse;\n" +
"            width: 80%;\n" +
"            margin: 20px;\n" +
"        }\n" +
"\n" +
"        table.token-table th, table.token-table td {\n" +
"            border: 1px solid #ddd;\n" +
"            padding: 8px;\n" +
"            text-align: left;\n" +
"        }\n" +
"\n" +
"        table.token-table th {\n" +
"            background-color: #f2f2f2;\n" +
"        }\n" +
"\n" +
"        /* Estilo para los títulos */\n" +
"        h1 {\n" +
"            font-size: 24px;\n" +
"            color: #333;\n" +
"            text-align: center;\n" +
"            margin: 20px 0;\n" +
"        }\n" +
"    </style>\n" +
"</head>\n" +
"<body>\n";
    }
    public void Insertar_datos_pagina_tokens(DoublyLinkedList list_tokens){
        pagina_html += " <h1>Tabla de Tokens</h1>\n" +
"    <table class=\"error-table\">\n" +
"        <tr>\n" +
"            <th>Lexema</th>\n" +
"            <th>Descripción</th>\n" +
"            <th>Línea</th>\n" +
"            <th>Columna</th>\n" +
"        </tr>\n";
        pagina_html += list_tokens.Iterar_Simbolos_tokens();
    }
    public void Insertar_datos_pagina_tokens_error(DoublyLinkedList list_tokens){
        pagina_html_error += " <h1>Tabla de Errores Lexicos</h1>\n" +
"    <table class=\"error-table\">\n" +
"        <tr>\n" +
"            <th>Lexema</th>\n" +
"            <th>Descripción</th>\n" +
"            <th>Línea</th>\n" +
"            <th>Columna</th>\n" +
"        </tr>\n";
        pagina_html_error += list_tokens.Iterar_Simbolos_tokens();
    }
    public void CrearArchivoHTML() {
    
        // Especifica la ruta y el nombre del archivo HTML que deseas crear
        String nombreArchivo = "Reporte.html";

        try {
            // Crea un objeto File que representa el archivo
            File archivo = new File(nombreArchivo);

            // Abre un FileWriter para escribir en el archivo
            FileWriter escritor = new FileWriter(archivo);

            // Escribe el contenido HTML en el archivo
            
            escritor.write(pagina_html);

            // Cierra el FileWriter
            escritor.close();
        } 
        catch (IOException e) {
            System.err.println("Error al crear el archivo HTML: " + e.getMessage());
        }
    }
    public void CrearArchivoHTMLError(){
         // Especifica la ruta y el nombre del archivo HTML que deseas crear
        String nombreArchivo = "ReporteErrores.html";

        try {
            // Crea un objeto File que representa el archivo
            File archivo = new File(nombreArchivo);

            // Abre un FileWriter para escribir en el archivo
            FileWriter escritor = new FileWriter(archivo);

            // Escribe el contenido HTML en el archivo
            
            escritor.write(pagina_html_error);

            // Cierra el FileWriter
            escritor.close();
        } 
        catch (IOException e) {
            System.err.println("Error al crear el archivo HTML: " + e.getMessage());
        }

    }
    
}

