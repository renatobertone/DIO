package desenvolvimentoBasicoJava.EncapsulamentoHerancaPolimorfismo;

public class Gerente extends Funcionarios {

    public double calculaImposto() {
       return this.getValorSalario() * 0.1;
   }



}