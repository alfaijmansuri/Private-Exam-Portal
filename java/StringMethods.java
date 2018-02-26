
public class StringMethods {
	public static void main(String[] args) {
		String str = " Hello! Welcome to Java";
		System.out.println("str.charAt(2) " + str.charAt(2));
		System.out.println("str.compareTo(\"Hello\") " +str.compareTo("Hello"));
		System.out.println("str.compareToIgnoreCase(\"hello\") "+str.compareToIgnoreCase("hello"));
		System.out.println("str.concat(\" SE 9\") "+str.concat(" SE 9"));
		System.out.println("str.endsWith(\"Java\") "+str.endsWith("Java"));
		System.out.println("str.indexOf('o') "+str.indexOf('o'));
		System.out.println("str.length() "+str.length());
		System.out.println("str.lastIndexOf('e') "+str.lastIndexOf('e'));
		System.out.println("str.substring(4,8) "+str.substring(4,8));
		System.out.println("str.toUpperCase() "+str.toUpperCase());
		System.out.println("str.toLowerCase() "+str.toLowerCase());
		System.out.println("str.trim() "+str.trim());

        char charArr[] = str.toCharArray();
        String strArray[] = str.split("o");
		System.out.println("str.toCharArray() ");
		for( char ch : charArr ){
            System.out.print( ch + " " );
        } 
        System.out.println("\nstr.split(\"o\")");
        for( String s : strArray ){
            System.out.print( s + " " );
        }
	}
}
