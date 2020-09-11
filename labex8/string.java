/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labex8;
import java.util.Scanner;

/**
 *
 * @author Desktop Pc
 */


public class string
{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter the Binary Number");
String str = s.next();
int number;
double digit = 0 , result = 0;
int check = 1;
for(int i = 0; i < str.length() ; i++){
if(str.charAt(i) =='1' || str.charAt(i) =='0'){
check = 1;
}
else{
check = 0;
}
}
if(check == 0){
System.out.println("Error:Invalid binary string\"" + str + "\"");
}
else if(check == 1)
{
number = Integer.parseInt(str);
for(int i = 0; i < str.length() ; i++){
digit = number % 10;
number = number / 10;
result = result + (digit * Math.pow(2,i));
}
System.out.println((int)result);
}
}
}