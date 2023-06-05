import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        inputVoid();
    }

    public static int inputNum() {
        System.out.println("Введите число:");
        return new Scanner(System.in).nextInt();
    }
    public static void inputVoid(){
        System.out.println((inputNum() % 2) == 0);
    }
}