// 1) Пусть дан произвольный список целых чисел, удалить из него четные числа

// public class HW31  {
//      public static void main(String args[]) {
//         int[] array;
//         array = new int[12];
//         for (int n = 0; n < array.length; n++) {
//             array[n] = ((int)(Math.random() * 30));
//             System.out.println(array[n]);
//         }
//         for (int i = 0; i < array.length; i++){
//             if (array[i] % 2 == 0){
//                 array[i] = 0;
                 
//             } 
//         }         
//         for (int j : array ) System.out.print(j + " ");        
//     }
    
// }

// 2) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.List;

// public class HW31
// {
//     public static void main(String[] args) throws IOException
//     {
//         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//         int  maximum;
//         int  minimum;
//         double avg;

//       ArrayList<Integer> list = new ArrayList<Integer>();
//       System.out.println("Введите 5 чисел через Enter:");
//         for (int i = 0; i < 5; i++){
            
//             list.add(Integer.parseInt(reader.readLine()));

//         }

//         maximum = getMaximum(list);
//         minimum= getMinimum(list);
//         avg = getAvarage(list);

//         System.out.println("max = " + maximum);
//         System.out.println("min = " + minimum);
//         System.out.println("Среднее значение = " + avg);
//     }

//         static int getMaximum(ArrayList<Integer> list){
//             int max = 0;
//             for (int i = 0; i < list.size(); i++)
//                 if (max < list.get(i))
//                     max = list.get(i);
//                     return max;




//         }
//     static int getMinimum(ArrayList<Integer> list){
//         int min = list.get(0);
//         for (int i = 0; i < list.size(); i++)
//             if (min > list.get(i))
//                     min = list.get(i);
//         return min;




//     }
//     static double getAvarage(ArrayList<Integer> list){
//         double avg = list.get(0);
//         for (int i = 1; i < list.size(); i++)
//             avg += list.get(i);
//         return avg/list.size(); 
// }
// }
