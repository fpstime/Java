public class task9 {
    public static void main(String[] args) {
        String str = "“let’s talk about java,’t’“";
        findFirstCharIndex(str, 's');
    }
    static int findFirstCharIndex(String str, char ch) {
        System.out.println(str.indexOf(ch));
        return ch;
    }
}
/** Реализовать метод, который int findFirstCharIndex(String str, char ch) который возвращает
позицию первого вхождения (индекс) символа ch в строке str. Если символа в строке нет,
возвращаем -1.
Например: find(“let’s talk about java”,’t’) -> 2 **/
