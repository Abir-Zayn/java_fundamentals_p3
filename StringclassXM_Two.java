import java.util.Scanner;

public class StringclassXM_Two {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String sc=scan.next();

        System.out.println(sc.replaceAll("\\W", ""));  
         }
}