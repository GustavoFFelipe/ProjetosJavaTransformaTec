package classes;
import java.util.Scanner;
public class Drink {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual sua idade?");
    int age = scanner.nextInt();
    String msg = age >= 18 ? " Pode ir na Balada" : "Não Pode ir na Balada" ;

    System.out.println(msg);
    scanner.close();

  }

}
