package Anatomia_Das_Classes.Aula_03;

public class Aula_03 {



    public static void main (String[]args){

        String primeiroNome = "Idelio";
        String segundoNome ="Teofilo";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);

    }



}
