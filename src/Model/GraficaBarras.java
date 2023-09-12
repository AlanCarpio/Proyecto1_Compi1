package Model;

public class GraficaBarras {
    private String Titulo;
    private DoublyLinkedList Ejex = new DoublyLinkedList();
    private DoublyLinkedList Valores = new DoublyLinkedList();
    private String Titulox;
    private String Tituloy;
    
    public void Set_Titulo(String _Titulo){
        this.Titulo=_Titulo;
    }
    public String Get_Titulo(){
        return this.Titulo;
    }
    public void Set_Titulox(String _Titulox){
        this.Titulox=_Titulox;
    }
    public String Get_Titulox(){
        return this.Titulox;
    }
    public void Set_Tituloy(String _Tituloy){
        this.Tituloy=_Tituloy;
    }
    public String Get_Tituloy(){
        return this.Tituloy;
    }
    public DoublyLinkedList Get_Ejex(){
        return this.Ejex;
    }
    public DoublyLinkedList Get_valores(){
        return this.Valores;
    }
    
}
