/*
ask the user to give two int values. 
if the 2 values are the same, display double their total.
otherwise just display their total.
*/

import java.util.Scanner;
public class calculator {
public static void main(String[] args){

Scanner sc =new Scanner(System.in);

int num1 =1; //why is it initialised? ke sa reye gore go molato
int num2=1;  // why is it initialised? ke sa reye gore go molato

System.out.println("enter first number:");
num1 = sc.nextInt();

System.out.println("enter second number:");
num2 = sc.nextInt();

if(num2==num1){

System.out.print(num1+num2*(num1+num2)); // recheck calculation here
}

else{
System.out.print(num1 + num2);
}
}
}





  

