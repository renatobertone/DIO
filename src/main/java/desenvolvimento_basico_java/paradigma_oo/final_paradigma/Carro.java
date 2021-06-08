package desenvolvimento_basico_java.paradigma_oo.final_paradigma;

public class Carro {
    private int loatacaoMaximaCarro = 5;
    private int pessoas = 1;

    public Carro() {
    }

    public int getLoatacaoMaximaCarro() {
        return this.loatacaoMaximaCarro;
    }

    public String getRmpessoas() {
        this.loatacaoMaximaCarro -= this.pessoas;
        return "Removendo uma pessoa, a lotação do carroa atual é " + this.loatacaoMaximaCarro;
    }

    public String getAddpessoas() {
        this.loatacaoMaximaCarro += this.pessoas;
        return "Adicionando uma pessoa, a lotação do carroa atual é " + this.loatacaoMaximaCarro;
    }
}
