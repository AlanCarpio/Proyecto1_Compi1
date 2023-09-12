package Model;

public class GraficaPie {
    private String Titulo = "";
    private DoublyLinkedList Ejex = new DoublyLinkedList();
    private DoublyLinkedList Valores = new DoublyLinkedList();
    public void Set_Titulo(String _Titulo){
        this.Titulo=_Titulo;
    }
    public String Get_Titulo(){
        return this.Titulo;
    }
    public DoublyLinkedList Get_Ejex(){
        return this.Ejex;
    }
    public DoublyLinkedList Get_valores(){
        return this.Valores;
    }
}
