public class task15 {
    public static void main(String[] args) {
        String str = "DE5128279087265";
        konto(str);
    }
    static void konto (String str) {
        int strLenght = str.length();
        for (int i = 0; i < strLenght; i++) {
            if (i<=3 || i >12) {
                System.out.print(str.charAt(i));
            }
            else {
                System.out.print("*");
            }
        }
    }
}
/**Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод,
 который вместо заданной строки с номером счета (например ”DE5128279087265”)
 возвращает строку вида ”DE51*********65” (количество звездочек соответствует количеству
 засекреченных цифр)*/