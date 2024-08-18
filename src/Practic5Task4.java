import java.util.Scanner;

public class Practic5Task4 {
    public static void main(String[] args) {
        System.out.println("введите коичество метров материала: ");
        Scanner scanner=new Scanner(System.in);
        float metrs=scanner.nextFloat();
        System.out.println("Выберите единицу в кторую будите ковертоиваить метры\n ");
        System.out.println("1- перевести в милли 2- перевести в дюймы 3- перевести в ярды");
        int option=scanner.nextInt();
        if(option==1){
            System.out.println("Длинна в милях: "+ metrs/1609);}
        if (option==2){
            System.out.println("Длинна в  дюймах:" + metrs*39.37);}
        if(option==3){
            System.out.println("длинна в ярдах: " + metrs*1.093);}

    }
}
