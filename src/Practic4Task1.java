import java.util.Scanner;

public class Practic4Task1 { public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число для проверки четности ");
        int number=scanner.nextInt();
        int delenie= number % 2;
        if(delenie>0){ System.out.print("Число не четное");}
        if (delenie==0){ System.out.print("Число  четное");}
        System.out.println("\n");
        System.out.println("Остаток от деления: " +delenie);
    }}



