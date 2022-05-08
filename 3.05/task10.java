public class task10 {
    public static void main(String[] args) {
        String str = "“let’s talk about java,’t’“";
        findLastCharIndex(str, 't');
    }
    static int findLastCharIndex(String str, char ch) {
        System.out.println(str.lastIndexOf(ch));
        return ch;
    }
}
/**
 * Реализовать метод, который int findLastCharIndex(String str, char ch) который возвращает
 * позицию последнего вхождения (индекс) символа ch в строке str. Если символа в строке
 * нет, возвращаем -1.
 * Например: find(“let’s talk about java”,’t’) -> 15
 */