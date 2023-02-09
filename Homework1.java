// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5
// import java.util.Scanner;
// public class HW1 {
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Введите число n:");
//     int n = sc.nextInt();
//     int count = 0;
//     int fact = 1;
//     for (int i = 1; i<=n; i++){
//         count = count + i;
//     }
//     System.out.println("Сумма первых " + n + " чисел = " + count);
//     for(int i = 1; i<=n; i++){
//         fact = fact * i;
//     }
//     System.out.println("Факториал " + n +" = " + fact);   
//     }
// }


// Вывести все простые числа от 1 до 1000

// import java.util.Scanner;

// public class HW1 {

//   public static void main(String[] args) {
//     try (Scanner tru = new Scanner(System.in)) {
//       int number;
//       System.out.println("Простые числа от 1 до 1000:");

//       for(int i = 2; i < 1000; ++i){
//         int count = 0;
//         for(int j = 2; j <=i && count < 2;++j){
//           if(i%j==0){
//             ++count;
//           }
//         }
//         if(count<2)
//            System.out.println(i);
//       }
//     }
//   }
// }

// Реализовать простой калькулятор Scanner sc = ... int a = sc.nextLine int b = sc.nextLine

// import java.util.Scanner;
// public class HW1 {
//   public static void main(String[] args) {
//     /* КАЛЬКУЛЯТОР С ВЫВОДОМ В КОНСОЛЬ */
//     // СЛОЖЕНИЕ
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Введите два числа!(Сложение)");
//     int a = sc.nextInt();
//     System.out.println("+");
//     int b = sc.nextInt();
//     int c = a + b;
//     System.out.println("ответ:" +c);
    
//     //ВЫЧИТАНИЕ
//     System.out.println("Введите два числа!(Вычитание)");
//     int q = sc.nextInt();
//     System.out.println("-");
//     int w = sc.nextInt();
//     int e = q - w;
//     System.out.println("ответ: " + e);
    
//     //УМНОЖЕНИЕ
//     System.out.println("Введите два числа!(Умножение)");
//     int r = sc.nextInt();
//     System.out.println("*");
//     int t = sc.nextInt();
//     int y = r * t;
//     System.out.println("ответ: " +y);
    
//     //ДЕЛЕНИЕ
//     System.out.println("Введите два числа!(Деление)");
//     int u = sc.nextInt();
//     System.out.println("/");
//     int i = sc.nextInt();
//     if (u == 0)
//     {
//     System.out.println("На нуль делить нельзя!!!");
//     }
//     else
//     { 
//     int o = u / i;
//     System.out.println("ответ: " + o);
//     }
//   }
// }
