package desenvolvimentoBasicoJava.EncapsulamentoHerancaPolimorfismo;

public class Supervisor extends Funcionarios{

    public double calculaImposto() {
        return this.getValorSalario() * 0.05;
    }
}
