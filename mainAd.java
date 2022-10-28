package finalSa; 
import java.util.Scanner;

public class mainAd {
public static void main(String[] args) {
    Scanner dt = new Scanner(System.in);

    escuela es1 = new escuela("Castelobruxo", "hougorts");
    escuela es2 = new escuela("Beauxbatons", "hougorts");
    escuela es3 = new escuela("Mahoutoko", "hougorts");



    

    System.out.println("-------------------------------------------------------------------------------------------");
    System.out.println("Bien venido al toreno de Quidditch.");
    System.out.println("Si eres un admin pon (1), de otra manera pon 2.");
    int men1 = dt.nextInt();
    int cont = 0;

    if(men1 == 1){
        for(int i = 0; i <= 1; i++){
            int con = 123;
            System.out.println("Provee la contraseña a continuacion.");
            int conin = dt.nextInt();
            if(conin == con){
                cont++;
                break;
            }

            else{
                System.out.println("contraseña invalida.");
                break;
            }
        }
    }

    else if(men1 == 2){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido visitante");
        System.out.println("¿Que quisieras consultar?");
        System.out.println("1) Jugador top.");
        System.out.println("2) Tabla de equipos.");
        int men2 = dt.nextInt();
        if(men2==1){

        }

        else if(men2 == 2){

        }
    }

    if(cont == 1){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido admin.");
        System.out.println("¿Que quieres hacer?");
        System.out.println("1) Agregar goles.");
        System.out.println("2) Agregar pertido ganado o perderdido");
        System.out.println("3) Agregar casa");

        int men3 = dt.nextInt();
        if(men3==1){

        }

        else if(men3 == 2){

        }

        else if(men3 == 3){
            System.out.println("De que Ecuela es la casa:");
            System.out.println("1) Castelobruxo");
            System.out.println("2) Beauxbatons");
            System.out.println("3) Mahoutoko");
        }
    }



    }

    
}
