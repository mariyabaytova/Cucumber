package StepDefenition;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import java.util.Scanner;
//lol


public class TestSteps {

    @Когда("^Пользователь вводит a$")
    public static int пользователь_вводит_a(){
        Scanner a = new Scanner(System.in);
        return 0;
    }

    @Когда("^Пользователь вводит b$")
    public static int пользователь_вводит_b(){
        Scanner b = new Scanner(System.in);
        return 0;
    }
    @Тогда("^Получить сумму$")
    public static int получить_сумму() {
        int a = пользователь_вводит_a();
        int b = пользователь_вводит_b();
        int sum = (a + b);
        return sum;

    }

    @Тогда("^Получить результат$")
    public static void получить_результат() {
        int sum = получить_сумму();
        System.out.println(sum);
    }
}
