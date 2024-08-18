import java.util.Scanner;

public class Practic5Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите время ");
        int time=scanner.nextInt();
        if(time>=0 && time<6){
            System.out.println("Good night");
        }
        if(time>=6 && time<13){
            System.out.println("Good morning");
            }
        if (time>=13 && time<17){
            System.out.println("Good day");}
        if (time>=17){
            System.out.println("Good Evening");}
    }
}
