public class task1 {
    public static void main(String[] args) {
        int num = 15;
        boolean result = true;

        printCheckResultMessage (num, result);
    }

    static void printCheckResultMessage(int num, boolean result){
        if (num % 2 == 0) {
            result = true;
        }
        else {
            result = false;
        }
        System.out.println(result);
    }
}
/**Реализовать метод boolean isEven(int number) который возвращает true если переданное
число четное иначе возвращает false. Реализовать метод void printCheckResultMessage(int
number, boolean result) который выводит на экран строку вида «10 это четное число» или
“15 это не четное число»*/