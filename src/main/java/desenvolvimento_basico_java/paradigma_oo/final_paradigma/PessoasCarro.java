package desenvolvimento_basico_java.paradigma_oo.final_paradigma;

public class PessoasCarro {
    public PessoasCarro() {
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println("A lotação atual do Carro é: " + carro.getLoatacaoMaximaCarro());
        System.out.println(carro.getRmpessoas());
        System.out.println(carro.getAddpessoas());
    }
}
