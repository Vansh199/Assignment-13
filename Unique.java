import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        
      System.out.println("Enter an string");
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      str=str.toLowerCase();
      int n=0;
      for(int i=0;i<str.length()-1;i++){
        char ch = str.charAt(i);
        for(int j=i+1;j<str.length();j++){
            char ch1 = str.charAt(j);
            if(ch==ch1){
                n++;
                break;
            }
        }
      }
      if(n>=1){
        System.out.println("this string does not contains unique character");
      }
      else{
        System.out.println("this string  contains unique character");
      }
    }
}
