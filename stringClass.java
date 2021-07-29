public class stringClass {
    public static void main(String[] args)  {
        
        String str="abirzayn@gmail.com";
        System.out.println(str.matches("\\w*@gmail.*"));

        //RE => [.*]  is for any strings.
        //RE =>[a-z]{x} is for a to z strings but length is defined within {X}
        //RE =>[a-z]* a to z strings.

    
}
}