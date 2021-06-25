package desenvolvimentoBasicoJava.EncapsulamentoHerancaPolimorfismo;

public class Atendente extends Funcionarios{

    public double calculaImposto() {
        return this.getValorSalario() * 0.01;
    }
}
