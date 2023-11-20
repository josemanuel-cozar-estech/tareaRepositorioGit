import java.util.Scanner;

public class Prueba {

    public static void esFinDeSemana (boolean finde) {
        if (finde){
            System.out.println("Es fin de semana");
        }else {
            System.out.println("No es fin de semana");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;
        boolean esfinde;

        do {
            System.out.println("¿Qué dia de la semana es?");
            dia = sc.next();
        }while ((dia.charAt(0) != 'L') && (dia.charAt(0) != 'M') && (dia.charAt(0) != 'J') && (dia.charAt(0) != 'V') && (dia.charAt(0) != 'S') && (dia.charAt(0) != 'D'));

        if ((dia.charAt(0) == 'L') || (dia.charAt(0) == 'M') || (dia.charAt(0) == 'J') || (dia.charAt(0) == 'V')){
            esfinde = false;
        } else{
            esfinde = true;
        }

        esFinDeSemana(esfinde);

    }
}
