import java.util.Scanner;

public class Practic5Task3 {
    public static void main(String[] args) {
        System.out.println("Выберите действие: 1- максимум из 3 числе  2- минимум их трех чисел 3-среднее арефмитическое");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        System.out.println("Введите первое число ");
        int dgiget1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int dgiget2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int dgiget3 = scanner.nextInt();
        if (option == 1) {
            if (dgiget1 > dgiget2 && dgiget1 > dgiget3) {
                System.out.println("Первое чсило самое большое");}}
        if (option == 1) {
            if (dgiget2 > dgiget1 && dgiget2 > dgiget3) {
                System.out.println("Второе число  самое большое");}}
        if (option == 1) {
            if (dgiget3 > dgiget1 && dgiget3 > dgiget2) {
                System.out.println("Третье число  самое большое");}}
        if (option==2){
            if(dgiget1<dgiget2 && dgiget1<dgiget3){
            System.out.println("Первное число смаое маленькое ");}}
        if (option==2){
            if(dgiget2<dgiget3 && dgiget2<dgiget1){
            System.out.println("Второе число смаое маленькое ");}}
        if (option==2){
            if(dgiget3<dgiget2 && dgiget3<dgiget1){
            System.out.println("Третье число смаое маленькое ");}}
        if (option==1){
            if (dgiget1==dgiget2 && dgiget1>dgiget3){
            System.out.println("Первое и второе число равны и больше третьего");
        }}
        if (option==1){
            if(dgiget2==dgiget3 && dgiget2>dgiget1){
            System.out.println("Второе и третье числа равны и боьше первого");}}
        if (option==1){
            if (dgiget1==dgiget3 && dgiget1>dgiget2){
            System.out.println("Первое и трерте числа равны и больше второго ");
        }}
        if (option==1) {
            if((dgiget1==dgiget2 )&&(dgiget2==dgiget3)){
            System.out.println("вы выели 3 одиноквых числа ");}}
        if (option==3){
             System.out.println((dgiget1+dgiget2+dgiget3)/3);}
        if (option==2){
            if(dgiget1==dgiget2 && dgiget1<dgiget3){
                System.out.println("первое и второе числа равны и меньше третьего ");}}
        if (option==2){
            if(dgiget2==dgiget3 && dgiget2<dgiget1){
                System.out.println(" второе и третье числа равны и меньше первого ");}}
        if (option==2){
            if(dgiget1==dgiget3 && dgiget1<dgiget2){
                System.out.println("первое и третье числа равны и меньше второго");}}
        if (option>3){
            System.out.println("Выбранна не верная опция");}

    }}
