import java.util.*;
public class stringclassXM {
    public static void main(String[] args){
        System.out.println("Enter ID: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        

        System.out.println(str.matches(".*@gmail.*"));
        
        System.out.println(str.lastIndexOf("@"));
        String first_name=str.substring(0, str.lastIndexOf("@"));
        System.out.println("First_Name : "+first_name);

        String domain_name=str.substring(str.lastIndexOf("@")+1, str.length());
        System.out.println("Domain Name: " +domain_name);
        

    }
}
