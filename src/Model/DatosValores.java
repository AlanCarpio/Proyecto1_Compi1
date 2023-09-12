package Model;

public class DatosValores {
    private Double valor;
    public DatosValores(String _valor){
        this.valor = Double.parseDouble(_valor);
    }
    public Double Get_valor(){
        return this.valor;
    }
}
