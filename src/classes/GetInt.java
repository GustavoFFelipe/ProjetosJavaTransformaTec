package classes;
import java.util.Scanner;
public class GetInt {
  public static void main(String[] args) {
    int numbers[] = {1, 2, 3, 4, 5, 6};
    int found = 0;
    Scanner scanner  = new Scanner(System.in); 

    System.out.println("Informe um Numero");

    int number = scanner.nextInt();

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[1] == number) {
        found = numbers[i];
      } 
        }
        if(found == 0){
          System.out.println("Numero não encontrado");
        }
        else {
          System.out.println("Numero encontrado");
        }
    scanner.close();
  }
}
