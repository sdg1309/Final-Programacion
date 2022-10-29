import java.util.ArrayList;
import java.util.Scanner;

public class mainAd {
public static void main(String[] args) {
    boolean alpha = true;
    ArrayList<escuela> lista = new ArrayList<>();
    Scanner dt = new Scanner(System.in);
   
        casa[] aa = new casa[3];
        casa[] bb = new casa[3];
        casa[] cc = new casa[3];

        lista.add(new escuela("Castelobruxo", "hougorts", aa));
        lista.add(new escuela("Beauxbatons", "hougorts", bb));
        lista.add(new escuela("Mahoutoko", "hougorts", cc));


        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido al toreno de Quidditch.");
        System.out.println("Si eres un admin pon (1), de otra manera pon (2).");
        int men1 = dt.nextInt();
        int cont = 0;

        if(men1 == 1){
            for(int i = 0; i <= 1;){
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
            System.out.println("2) Equipos.");
            int men2 = dt.nextInt();
            if(men2==1){

            }

            else if(men2 == 2){
                for(int i = 0; i<4; i++){
                    System.out.println( aa[i].infoCas());
                    System.out.println( bb[i].infoCas());
                    System.out.println( cc[i].infoCas());
                }
            }
        }
        
        while(alpha == true){
        if(cont == 1){
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("Bienvenido admin.");
            System.out.println("¿Que quieres hacer?");
            System.out.println("1) Agregar goles.");
            System.out.println("2) Agregar partido ganado o perderdido");
            System.out.println("3) Agregar casa");

            int men3 = dt.nextInt();
            if(men3 == 1){
                System.out.println("A que casa vas a agregar:");
                System.out.println("1)" + aa[0].getNomcasa());
                System.out.println("2)" + aa[1].getNomcasa());
                System.out.println("3)" + aa[2].getNomcasa());
                System.out.println("4)" + aa[3].getNomcasa());
                System.out.println("5)" + bb[0].getNomcasa());
                System.out.println("6)" + bb[1].getNomcasa());
                System.out.println("7)" + bb[2].getNomcasa());
                System.out.println("8)" + bb[3].getNomcasa());
                System.out.println("9)" + cc[0].getNomcasa());
                System.out.println("10)" + cc[1].getNomcasa());
                System.out.println("11)" + cc[2].getNomcasa());
                System.out.println("12)" + cc[3].getNomcasa());
                int al = dt.nextInt();
                if(al == 1){

                }
                else if(al == 2){
                    System.out.println("¿Cuatos goles mas?");
                    int a = dt.nextInt();
                }
                else if(al == 3){
                    
                }
                else if(al == 4){
                    
                }
                else if(al == 5){
                    
                }
                else if(al == 6){
                    
                }
                else if(al == 7){
                    
                }
                else if(al == 8){
                    
                }
                else if(al == 9){
                    
                }
                else if(al == 10){
                    
                }
                else if(al == 11){
                    
                }
                else if(al == 12){
                    
                }
            }

            else if(men3 == 2){

            }

            else if(men3 == 3){ 
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("De que Ecuela es la casa:");
                System.out.println("1) Castelobruxo");
                System.out.println("2) Beauxbatons");
                System.out.println("3) Mahoutoko");
                int ca = dt.nextInt();
                if(ca == 1){
                    for(int i = 0; i<4; i++){
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.println("Casa numero " + (i+1));

                    System.out.println("Dame los datos de la Casa:");

                    System.out.println("Nombre:");
                    String nombre = dt.next();

                    System.out.println("ID:");
                    int ID = dt.nextInt();

                    System.out.println("color:");
                    String color = dt.next();

                    aa[i] = new casa(nombre, ID, color);

                    System.out.println("¿Qieres salir?");
                    System.out.println("1) si, 2) no");
                    int men4 = dt.nextInt();
                    if(men4 == 1){
                        break;
                    }
                    }
                }

                else if(ca == 2){
                    for(int i = 0; i<4; i++){
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.println("Casa numero" + (i+1));
                    System.out.println("Dame los datos de la Casa:");
                    System.out.println("Nombre:");
                    String nombre = dt.next();
                    System.out.println("ID:");
                    int ID = dt.nextInt();
                    System.out.println("color:");
                    String color = dt.next();

                    bb[i] = new casa(nombre, ID, color);

                    System.out.println("¿Qieres salr?");
                    System.out.println("1) si, 2) no");
                    int men4 = dt.nextInt();
                    if(men4 == 1){
                        break;
                    }
                    }
                }

                else if(ca == 3){
                    for(int i = 0; i<4; i++){
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.println("Casa numero" + (i+1));                        
                    System.out.println("Dame los datos de la Casa:");
                    System.out.println("Nombre:");
                    String nombre = dt.next();
                    System.out.println("ID:");
                    int ID = dt.nextInt();
                    System.out.println("color:");
                    String color = dt.next();

                    cc[i] = new casa(nombre, ID, color);

                    System.out.println("¿Qieres salr?");
                    System.out.println("1) si, 2) no");
                    int men4 = dt.nextInt();
                    if(men4 == 1){
                        break;
                    }
                    }
                }
            }
        }

        System.out.println("¿quieres salir por completo?");
        System.out.println("1) si, 2) no");
        int gago = dt.nextInt();
        if(gago == 1){
            break;
        }
    }
    dt.close();
    } 
}

//Este es un "esckeatch", porque ya son las 9:30 del viernes y mañana tengo etrenamiento a las 5:00 AMM!!!!!!!!!
//TENGO QUE DORMIR
//-_-
//pero de todos modos, esta interesane para hacerlo en equipo.
//pero ya mi cerebro esta en modo MELT DOWN!
//Disfrute mucho esta materia, gracias
//aunque termine afirmando mi odio por JAVA y POO, disfrute tu forma de enceñar y tu humor
//KEEP IT UP!!