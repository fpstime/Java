public class task5 {
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = "Java! Java! Java!";
        String str3 = "The end";
        longestString(str1, str2, str3);
        System.out.println(longestString(str1, str2, str3));

    }
    public static String longestString (String str1, String str2, String str3) {
        int num1 = str1.length();
        int num2 = str2.length();
        int num3 = str3.length();
        if (num1 > num2) {
            if (num1 > num3) {
                return str1;
            }
        }
        else {
            if (num2 > num3) {
                return str2;
            }
        }
        return str3;
    }
}
/**Реализовать метод String longestString (String str1, String str2, String str2) который
возвращает самую длинную строку из трех заданных строк */