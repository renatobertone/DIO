/*

Só para guardar mesmo... rsrs

Renato Bertone

24/06/2021
package desenvolvimentoBasicoJava.TrabalhandoComDatas.javaCalendar;

        import java.time.DayOfWeek;
        import java.time.LocalDate;
        import java.util.Calendar;
        import java.util.Date;

public class Program extends TesteA{

    public static void main(String[] args) {
//long novaData;
        Calendar dataDeEntrada = Calendar.getInstance();
        Calendar dataDeVencimento = Calendar.getInstance();
        Calendar prazoMaximoParaPagamentoSemJuros = Calendar.getInstance();
//acrescentar variável para receber dia de vencimento e
// somar dias usando condição para exclusão de sábados e domingos
//
        System.out.printf("Entrada: " + "%tD\n" ,dataDeEntrada);
        System.out.printf("Vencimento: " + "%tD\n" ,dataDeVencimento);
        System.out.printf("Prazo Máximo: " + "%tD\n" ,prazoMaximoParaPagamentoSemJuros);
        System.out.println(" Teste para Saber o que retorna DAY_OF_MONTH: " + Calendar.DAY_OF_MONTH);
        System.out.println(" Teste para Saber o que retorna DAY_OF_WEEK: " + Calendar.DAY_OF_WEEK);
        System.out.println(" Teste para Saber o que retorna Calendar.SATURDAY: " + Calendar.SATURDAY);
        System.out.println(" Teste para Saber o que retorna Calendar.Sunday: " + Calendar.SUNDAY);
        System.out.printf("Hoje é: " + "%tD\n", dataDeEntrada.getTime());
        System.out.printf("Sua Fatura Vencerá em: " + "%tD\n", dataDeEntrada.getTime());
        System.out.printf("O Seu Prazo Máximo para pagamento sem juros é até a data: " + "%tD\n", dataDeEntrada);

        System.out.println("Vamos Separ, daqui pra frente, temos outras coisas");

        System.out.println("-----------------------------------------------------------------------------------");

        System.out.printf("Entrada: " + "%tD\n" ,dataDeEntrada);

        dataDeVencimento.add(Calendar.DATE, +2);
        System.out.printf("Vencimento: " + "%tD\n" ,dataDeVencimento);
        System.out.println("Hoje é " + Calendar.SATURDAY);

        System.out.println("Aqui inicia o que queremos, eu acho");

        prazoMaximoParaPagamentoSemJuros.add(Calendar.DATE, 3);
        System.out.printf("Prazo Máximo: " + "%tD\n" ,prazoMaximoParaPagamentoSemJuros);

        if (prazoMaximoParaPagamentoSemJuros.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
        {
            prazoMaximoParaPagamentoSemJuros.add(Calendar.DATE, 2);
            System.out.printf("Hojé Sábado, você pode pagar dia " + "%tD\n", prazoMaximoParaPagamentoSemJuros);
        }



        if (prazoMaximoParaPagamentoSemJuros.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
        {
            prazoMaximoParaPagamentoSemJuros.add(Calendar.DATE, 1);
            System.out.printf("Hojé Domingo, você pode pagar dia " + "%tD\n", dataDeVencimento);
        }


        System.out.println("Aqui finaliza o que queremos, eu acho");

        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println("Testes de Comparações");
        System.out.println("Teste de Lógica, verdadeiro ou falso? " + dataDeEntrada.equals(dataDeVencimento));

        System.out.println("Teste de Lógica, Hoje é Sábado, verdadeiro ou falso? " + dataDeVencimento.equals(Calendar.SATURDAY));

        System.out.println("-----------------------------------------------------------------------------------");





        dataDeEntrada.add(Calendar.DATE, +3);




        //long compareCase1 = dataDeEntrada.compareTo(Calendar.SATURDAY);
        //System.out.println(dataDeEntrada.getTime());

        // if(!data.getDayOfWeek().equals(DayOfWeek.SATURDAY) &&
        //        !data.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
        if (dataDeEntrada.equals(Calendar.SATURDAY)){
            dataDeEntrada.add(Calendar.DATE, + 2);
        }
        //   System.out.printf("Teste Sábado: " + "%tD\n", dataDeEntrada);
        if (dataDeEntrada.equals(Calendar.SUNDAY)){
            dataDeEntrada.add(Calendar.DATE, + 1);
        }


//        System.out.printf("TEste Domingo: " + "%tD\n", dataDeEntrada);
        //System.out.printf("Teste tira Dúvidas: " + "%tD\n", getfimDeSemana());
        //System.out.println(fimDeSemana(LocalDate.of(dataDeEntrada))); // false, terça-feira
    }

}

 */