import java.util.Scanner;

public class Practic5Task2 {
    public static void main(String[] args) {
        System.out.println("Выберите действие: 1- вычислить сумму трех чисел 2- вычислить произведение трех чисел ");
        Scanner scanner=new Scanner(System.in);
        int option=scanner.nextInt();
        System.out.println("Введите первое число ");
        int dgiget1= scanner.nextInt();
        System.out.println("Введите второе число");
        int dgiget2= scanner.nextInt();
        System.out.println("Введите третье число");
        int dgiget3= scanner.nextInt();
        if(option==1){
            System.out.println("Сумма этих трех числе ровна= "+ (dgiget1+dgiget2+dgiget3));
        }
        if(option==2){
            System.out.println("Произвдение этих трех числе равно= "+ (dgiget1*dgiget2*dgiget3));
        }
    }
}
