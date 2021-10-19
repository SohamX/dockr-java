import java.util.Scanner;
class Hello{
public static void main(String[] args){
System.out.println("Hello Everyone!!!");
System.out.println("I am a java app for adding two numbers, running inside a docker container");
int num1, num2, sum;
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number: ");
num1 = sc.nextInt();

System.out.println("Enter second number: ");
num2 = sc.nextInt();

sc.close();
sum = num1 + num2;
System.out.println("Sum of these numbers: "+sum);
}
}
