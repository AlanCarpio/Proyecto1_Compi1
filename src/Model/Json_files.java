package Model;

public class Json_files {
    private String file_name;
    private DoublyLinkedList list_data_json = new DoublyLinkedList();
    public Json_files(String _file_name){
        this.file_name = _file_name;
    }
    public DoublyLinkedList Get_list_data_json(){
        return this.list_data_json;
    }
    public String Get_file_name(){
        return this.file_name;
    }
    
}

