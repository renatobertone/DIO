package desenvolvimento_basico_java.criando_obj_com_construtores;

public class Carro {

    private String marca ;
    private String modelo ;
    private Integer ano ;
    private String variante ;

    public Carro (String marca, String modelo,Integer ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.variante = "97/98";
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public Integer getAno(){
        return ano;
    }

    public String getVariante(){
        return variante;
    }



// set permite alterar o aributo.
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

}
