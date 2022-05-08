public class task11 {
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = "Hello Welt";

        int result = str1.compareTo(str2);
        System.out.println(result);
    }
}
/**Реализовать метод, который возвращает длину общего префикса двух строк, т.е. сколько
 символов начиная с начала одинаковые у обеих строк.*/