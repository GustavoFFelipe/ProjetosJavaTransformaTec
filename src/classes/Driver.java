package classes;
import java.util.Scanner;

public class Driver {

  public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

 System.out.println("Informe sua idade: ");
 int age = scan.nextInt();

 if(age <18){
System.out.println("Não pode dirigir");
 }else if (age> 18 && age < 21){
   System.out.println("Carteira Provisoria");
 }else{
   System.out.println("Pode dirigir");
 }

 scan.close();

  }
}
