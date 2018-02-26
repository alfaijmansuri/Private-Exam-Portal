import java.io.BufferedReader;
import java.io.InputStreamReader;

class BufferPrac{
    public static void main(String[] args) throws Exception {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        
        //Taking String as input
        System.out.println("Enter a String: ");
        String input = br.readLine();
        System.out.println(input);


        //Taking a charachter as input
        System.out.println("Enter a Character: ");
        char ch = (char)in.read();
        System.out.println(ch);

        //Extra reader is places here because when you enter any integer,
        // it takes \n as a string for next input
        br.readLine();

        //Using parsers to convert string input into various data types
        System.out.println("Enter an Integer: ");
        int numInt = Integer.parseInt(br.readLine().trim());
        System.out.println(" 2 * input is: "+numInt*2);

        System.out.println("Enter a Float: ");
        float numFloat = Float.parseFloat(br.readLine().trim());
        System.out.println(" 2 * input is: "+numFloat*2);

        System.out.println("Enter a Double: ");
        double numDouble = Double.parseDouble(br.readLine().trim());
        System.out.println(" 2 * input is: "+numDouble*2);

    }
}