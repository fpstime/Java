public class task4 {
    public static void main(String[] args) {
        int num1 = 276;
        int num2 = 854;
        int num3 = 107;
        max3(num1,num2,num3);
        System.out.println(max3(num1,num2,num3));

    }
    public static int max3 (int num1, int num2, int num3) {
      if (num1 > num2) {
          if (num1 > num3) {
              return num1;
          }
      }
      else {
          if (num2 > num3) {
              return num2;
          }
      }
      return num3;
    }
}
/**Реализовать метод int max3(int num1, int num2, int num3) который возвращает число,
наибольшее из трех переданных чисел:
Например: max3(10,19,0) -> 19*/
