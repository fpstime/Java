public class task7 {
    public static void main(String[] args) {
        Value(10, 15);
    }
    public static void Value(int start, int finish) {
        int num1 = start;
        int num2 = start +1;
        for (int i = num2; i <= finish; i++) {
            num1 = num1 + i;
        }
        System.out.println(num1);

        }
    }
/**Реализовать метод, который принимает 2 параметра int start и int finish и возвращает сумму
всех чисел от start до finish включительно.
Например: sum(10,15) -> 75*/