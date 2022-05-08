public class task14 {
    public static void main(String[] args) {
        tailString(17, 28);
    }
    static void tailString (int start, int finish) {
        String str = "Are You Ready??? Let's Go!!!";
        str = str.substring(start, finish);
        System.out.println(str);
    }
}
/**Реализовать метод, который возвращает часть заданной строки, начиная с позиции start,
 заканчивая позицией finish. (разбирали в классе, но можно реализовать самостоятельно).
 Например: substring(“let’s talk about java”, 7,20) -> “talk about ja”*/