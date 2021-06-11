package desenvolvimento_basico_java.encapsulamento_heranca_polimorfismo;

public class Supervisor extends Funcionarios{

    public double calculaImposto() {
        return this.getValorSalario() * 0.05;
    }
}
