import java.util.Scanner;
 
public class Main {
public static String sortWord(String s) {
char[] characters = s.toCharArray();
for(int i = 0, changes = 1; i < characters.length-1  && changes != 0 ; i++) {
changes = 0;
for(int j = 0; j < characters.length-1; j++) {
if(characters[j] > characters[j+1]) {
char pom = characters[j+1];
characters[j+1] = characters[j];
characters[j] = pom;
changes++;
}
}
}
System.out.println(new String(characters));
return new String(characters);
}
public static boolean czyAnagramy(String x, String y) {
if(x.length() != y.length()) { 
return false;
}
return sortWord(x).equals(sortWord(y)); 
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Podaj pierwszy ciąg znaków:");
String s1 = sc.nextLine().toLowerCase().replaceAll(" ", ""); 
System.out.println("Podaj drugi ciąg znaków:");
String s2 = sc.nextLine().toLowerCase().replaceAll(" ", ""); 
System.out.println("Podane wyrazy " + (czyAnagramy(s1, s2) ? "są" : "nie są") + " anagramami");
sc.close();
}
}