import java.util.Scanner;

public class Csv {
    public static void main(String[] args) {
        
        System.out.println("Enter a Sentence");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.toLowerCase();
        str=str.replace(" ", "");

        int vowels=0;
        int consonants=0;
        int special=0;
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
            else{
                special++;
            }
        }
        System.out.println("The number of vowels are: "+vowels);
        System.out.println("The number of consonants are: "+consonants);
        System.out.println("The number of special characters: "+special);
    }
}
