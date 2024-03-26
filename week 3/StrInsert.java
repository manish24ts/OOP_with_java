import java.lang.*;
import java.util.*;
import java.io.*;
class StrInsert{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter original: ");
String firStr = sc.nextLine();
System.out.println("Enter string to be inserted: ");
String secStr = sc.nextLine(); 
System.out.println("Enter index:");
int index = sc.nextInt();
String newStr = new String();
for(int i = 0;i < firStr.length();i++){
newStr += firStr.charAt(i);
if(i==index){
newStr += secStr;
}
}
System.out.println("New string after insertion: "+newStr);
}
}                                                