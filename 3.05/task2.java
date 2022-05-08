public class task2 {
    public static void main(String[] args) {
        int num1 = 21;
        int num2 = 5;
        boolean result;
        if ( num1 % num2 == 0) {
            result = true;
        }
        else {
            result = false;
        }
        System.out.println(result);
    }
}
/**Реализовать метод boolean isDivisible(int number1, int number2) который возвращает
true если number1 делится на number2 без остатка. Аналогично первой задаче
реализовать метод печати результата. */