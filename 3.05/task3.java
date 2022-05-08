public class task3 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;
        int num3 = 8;
        boolean result;
        if (num1 % num3 == 0 && num2 % num3 == 0) {
            result = true;
        }
        else {
            result = false;
        }
        System.out.println(result);
    }
}
/**Реализовать метод, который в качестве параметров получает 3 числа типа инт. Метод
должен возвращать true если и первое и второе число делятся без остатка на третье.*/