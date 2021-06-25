package desenvolvimentoBasicoJava.criandoObjComConstrutores;

public class AttCarro {

    public static void main(String[] args) {

        Carro carro = new Carro("Fiat", "Punto", 2021);

        System.out.println("A marca do do carro é: " + carro.getMarca());
        System.out.println("O modelo do carro é: " + carro.getModelo());
        System.out.println("O ano do carro é: " + carro.getAno());
        System.out.println("A variante do carro é: " + carro.getVariante());

// Comando para alterar o atributo
        carro.setVariante("1900");

        System.out.println(carro.getVariante());
    }
}
