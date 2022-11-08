package Anatomia_Das_Classes.Aula_04;

public class NotasDoEstudante {

    public static void main (String [] args){
        int mediaFinal =9;
        if (mediaFinal <=7)
            System.out.println("REPROVADO");
        else if (mediaFinal == 10)
            System.out.println("FAZER RECUPERACAO");
        else System.out.println("APROVADO");
    }
}

