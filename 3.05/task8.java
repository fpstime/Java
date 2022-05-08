public class task8 {
    public static void main(String[] args) {
        Value(10, 25, 3);
    }
    static void Value (int start, int finish, int digit) {

        int num1 = start;
        int num2 = start +1;
        for (int i = num2; i <= finish; i++) {
            if (i % 10 == digit){
                digit = 3;
            }
            else {
                num1 = num1 + i;
            }
        }
        System.out.println(num1);
    }
}
/** *Реализовать метод, который принимает 3 параметра start, finish, digit типа int. digit
 находится в диапазоне (0<=digit<9), если нет, то считаем digit=0. Метод должен вернуть
 сумму всех чисел от start до finish исключая те числа, которые заканчиваются на digit.
 Например: sum(10,15,3) -> 62 (в данном случае, в сумму входят числа 10,11,12,14 и15.
 Число 13 не входит. )*/