package variables;

public class String_class {

	public static void main(String[] args) {
		String s = "Welcome To Cuddalore";
		//length->count the length of the string
		int length = s.length();
		System.out.println(length);
		//equals->check the 2 string whether true or false
		// it compare upper and lower case also
		boolean equals = s.equals("Welcome To Cuddalore");
		System.out.println(equals);
		//equalsIgnoreCase->check the 2 string whether true or false 
		// don't compare upper and lower case
		boolean equalsIgnoreCase = s.equalsIgnoreCase("welcome to cuddalore");
		System.out.println(equalsIgnoreCase);
		//uppercase->convert to uppercase
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		//lowercase->convert to lower case
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		//startswith->check the prefix whether true or false
		boolean startsWith = s.startsWith("Wel");
		System.out.println(startsWith);
		//endswith->check the sufix whether true or false
		boolean endsWith = s.endsWith("ore");
		System.out.println(endsWith);
		//contains->check the particular sequence in a given string
		boolean contains = s.contains("Cudd");
		System.out.println(contains);
		//Indexof->It returns the given char index
		int indexOf = s.indexOf("d");
		System.out.println(indexOf);
		//lastindexof->It returns the last index of the given char
		int lastIndexOf = s.lastIndexOf("e");
		System.out.println(lastIndexOf);
		//charAt->It returns the index char 
		char charAt = s.charAt(11);
		System.out.println(charAt);
		//Replace->It replace the old character to new character
		String replace = s.replace("Cuddalore", "Vadalur");
		System.out.println(replace);
		//substring->Remove the string or character
		String substring = s.substring(11,15);
		System.out.println(substring);
		//split->split the word
		String[] split = s.split("");
		System.out.println(split[0]);
		for(String str  : split) {
			System.out.println(str);
		}
		//Isempty->check the given string is empty r not
		boolean empty = s.isEmpty();
		System.out.println(empty);
		//Trim->Remove unwanted spaces
		String b="  Deepak";
		String trim = b.trim();
		System.out.println(trim);
		//compare to->compare the two values give output 
		int compareTo = s.compareTo(b);
		System.out.println(compareTo);
		//concate->combine the two values
		String concat = s.concat(b);
		System.out.println(concat);
		//valueof->convert primitive data type into string
		float c=1.123f;
		String valueOf = String.valueOf(c);
		System.out.println(valueOf);
		//TOcharArray->convert to char array
		char[] charArray = b.toCharArray();
		System.out.println(charArray);
		for(char d :charArray) {
		System.out.println(d);
		}
	}
}
