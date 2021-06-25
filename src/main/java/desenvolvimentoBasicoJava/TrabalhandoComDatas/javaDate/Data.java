package desenvolvimentoBasicoJava.TrabalhandoComDatas.javaDate;

import java.text.ParseException;

public class Data extends DataFormatada {

    public static void main(String[] args) throws ParseException
  {

    java.util.Date dataNiver;
    java.util.Date dataComp;
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("dd/MM/yyyy");
    dataNiver = format.parse("27/05/1983");
    dataComp = format.parse("15/05/2010");

      //Date dataDeNascimento = new Date(422866800000L);
     //System.out.println("Data de Nasci: " + dataDeNascimento);
          long millisN = dataNiver.getTime();
          System.out.println("Data de Nascimento é: " + dataNiver);
          System.out.println("Os Milessegundos da data acima são: " + millisN);
          System.out.println("A Data de Nascimento formata é: " +getData(422866800000L,"27/05/1983" ));


     //Date dataDeComparacao   = new Date(1273906800000L);
     //System.out.println("Data de Comparação é: " + dataDeComparacao);
          long millisC = dataComp.getTime();
          System.out.println("Data de Comparação é: " + dataComp);
          System.out.println("Os Milessegundos da Data Acima são: " + millisC);
          System.out.println("A Data de Comparação Formata é: " +getData(1273906800000L, "15/05/2021"));


        boolean isBefore = dataNiver.before(dataComp);
        System.out.println("A Data de Nascimento é Anterior a Data de Comparação? "
              + isBefore);

          //boolean isAfter = dataNiver.after(dataComp);
          //System.out.println("A data de Nascimento é Posterior a data de Comparação? "
          //        + isAfter);
  }
}
