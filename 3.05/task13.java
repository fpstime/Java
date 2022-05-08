public class task13 {
    public static void main(String[] args) {
        String str = "Cat";
        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            System.out.print("[" + str.charAt(i)+ "]");
        }
    }
}
/**Реализовать метод, который печатает заданную строку, при этом каждый символ печатается
 в [] Например: “Hello” -> [H][e][l][l][o] */