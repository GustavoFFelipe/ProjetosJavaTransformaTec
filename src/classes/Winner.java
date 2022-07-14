package classes;
import java.util.Scanner;
public class Winner {

   public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);

    System.out.println("Faça sua aposta\n Escolha um numero entre 1 e 100.");
    int option = scanner.nextInt();

    switch (option) {
      case 1: 
          System.out.println("Premio minimo");
          break;

          case 2 :
          System.out.println("Premio medio");
          break;
          case 3: 
          System.out.println("Premio maximo");
          break;

          default:
          System.out.println("Perdeu tudo");

          scanner.close();
    }
      
    


    



   }
  
}
