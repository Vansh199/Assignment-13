public class RemoveD{
    public static void main(String[] args) {
        
       String str1 = "aabbccddeefg";
       String str2 = "";

       for(int i=0;i<str1.length();i++){
        if(str2.indexOf(str1.charAt(i)) == -1){
            str2 = str2 + str1.charAt(i);
        }
       }
       System.out.println("old string is: " +str1);
       System.out.println("new string is: " +str2);
    }
}