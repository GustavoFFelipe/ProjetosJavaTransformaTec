package classes;
import java.util.Arrays;
public class Comparation2 {
  public static void main(String[] args) {
    int arr01[] =  {1, 2, 3};
    int arr02[] = {1, 2, 3};

    if (Arrays.equals(arr01, arr02)) {
      System.out.println("Iguais");
    }else {
      System.out.println("Diferentes");
    }
  }
}
