import  java.util.*;

public class StringReverse {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string to be reversed : ");
        String input= scanner.nextLine();

        System.out.println("The reversed string is : "+ reverseMethod(input));

    }

    static String reverseMethod(String input){
        String rvr="";
        StringBuilder builder=new StringBuilder(input);
        StringBuilder builderReverse=new StringBuilder(input.length());
        builderReverse.setLength(input.length());
        
        int j= builder.length();
        for(int i=0;i<builder.length();i++){
            
            char c=builder.charAt(i);
            builderReverse.insert(j, c);

            j--;

        }
        rvr= builderReverse.toString();
        return rvr;
    }

}
