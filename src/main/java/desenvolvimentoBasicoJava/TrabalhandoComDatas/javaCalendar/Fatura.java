package desenvolvimentoBasicoJava.TrabalhandoComDatas.javaCalendar;
//Tenho que agradecer ao Felipe Douradinho, vi um código postado por ele no
// link https://pt.stackoverflow.com/questions/73910/verificar-se-o-dia-x-cai-em-um-sabado-ou-domingo.
//Abriu minha mente...
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Fatura
{
    public static void main (String[] args)
    {

/*
Para fim de testes
Recebendo data  digitada pelo usuário
try{
      Scanner d = new Scanner(System.in);
      System.out.println("Por favor, digite a data da Compra: ");
      String dataDaCompra = d.nextLine();
      DateFormat df = new SimpleDateFormat("DD/MM/YYYY");
      Date dt = df.parse(dataDaCompra);
      System.out.println((dt));
      } catch (Exception ex) {
      ex.printStackTrace();
      }

      System.out.println("o vencimento será 5 dias após a data da Compra,");
    System.out.println("Você poderá pagar se juros até dez dias após o dia do vencimento");

Obs: Não obtive o resultado esperado, mas vou deixar guardado para evoluções futuras

 */
        Calendar dataDaCompra = Calendar.getInstance();
        System.out.printf("Data da Compra: " + "%tD\n", dataDaCompra);

        Calendar dataVencimentoFatura = dataDaCompra;
        dataVencimentoFatura.add(Calendar.DATE, +5);//Fatura Vence 5 dias corridos Após a data de compra.
        System.out.printf("Data do Vencimento da Fatura: " + "%tD\n", dataVencimentoFatura);

        Calendar pagamentoSemJurosAte = dataVencimentoFatura;//Prazo Máximo de 10 dias úteis para pagamento da Fatura após vencimento
        pagamentoSemJurosAte.add(Calendar.DATE, +10);
            if (pagamentoSemJurosAte.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
            {
                pagamentoSemJurosAte.add(Calendar.DATE, 1);
                System.out.printf
                        ("Seu Prazo para pagamento sem juros venceu, mas como é Domingo, " +
                                "você pode pagar na Segunda, dia: " + "%tD\n", pagamentoSemJurosAte);
            }
            else if (pagamentoSemJurosAte.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
            {
                pagamentoSemJurosAte.add(Calendar.DATE, 2);
                System.out.printf
                        ("Seu Prazo para pagamento sem juros venceu, mas como é Sábado, " +
                                "você pode pagar na Segunda, dia: " + "%tD\n", pagamentoSemJurosAte);
            }
            else
            {
                System.out.printf
                        ("O Prazo máximo para pagamento após vencimento sem juros é: " +
                                "%tD\n", pagamentoSemJurosAte);
            }
    }


}