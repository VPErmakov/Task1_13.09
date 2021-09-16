public class Task1
{
    //посчитать факториал числа n
    //0.5 балла - если посчитаете в цикле
    //1 балл - если посчитаете рекурсией
    public static int fact(int n){
        if (n==1)
            return 1;
        return n * fact(n-1);
    }

    //вывести таблицу умножения на экран - 1 балл
    //подсказка - использовать двойной for
    public static void table(String[] args) {
        for (int n = 1; n <= 10; n++)
            for (int m = 1; m <= 10; m++) {
                System.out.println(n * m);
            }
    }

    //посчитать сумму цифр числа
    //можно посчитать для трехзначного - 0.5 балла
    //для любого числа - 1 балл
    //подсказка - в случае для любого числа используйте while
    public static int sum(int n){
                int sum=0;
                while (n>0)
                {sum+=n%10;
                    n/=10;
                }
                return sum;
    }

    //определить, является ли год високосным
    //В високосном году - 366 дней, тогда как в обычном - 365.
    //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    //Годы 2100, 2200 и 2300 - не високосные.
    //за правильный ответ - 0.5 балла
    public static boolean isLeapYear(int k) {
            if (k%4==0){
                if (k>99 && k%100==0 && k%400!=0){
                    return false;
                }return true;
            }
            else return false;
    }

    //здесь вам нужно будет использовать результат прошлой задачи
    //и вывести, сколько дней в году
    //правильный ответ - 0.5 балла
    public static int daysInYear(int k) {
        if (isLeapYear(k)){
            return 366;
        } else {
            return 365;
        }
    }

    //определить номер дня недели по строке
    //например: Понедельник - 1
    //правильный ответ - 1 балл
    public static int dayOfTheWeek(String s){
        int m=0;
        if("Понедельник".equals(s))
            m=1;
        if("Вторник".equals(s))
            m=2;
        if("Среда".equals(s))
            m=3;
        if("Четверг".equals(s))
            m=4;
        if("Пятница".equals(s))
            m=5;
        if("Суббота".equals(s))
            m=6;
        if("Воскресенье".equals(s))
            m=7;
        return m;
    }

    //вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
    //правильное решение - 0.5 балла
    public static void printArray(int[] array){
        int[] Array = {1,5,3,7,10,2,5};
        System.out.print("[");
        for(int i=0;i<6;i++) {
            System.out.print(Array[i] + ", ");
        }
        System.out.print(Array[6]);
        System.out.print("]");
        //Ваше решение здесь
    }

    //вывести двойной массив на экран в виде:
    // [1, 5, 3, 7, 10, 2, 5]
    // [1, 5, 3, 7, 10, 2, 5]
    // ...
    //правильное решение - 0.5 балла
    public static void printArray(int[][] array){
     for(int i=0;i<array.length;i++){
      System.out.print("[");
      for(int j=0;j<array[i].length-1;j++){
          System.out.print(array[i][j]+", ");
        }
      System.out.print(array[i][array[i].length-1]+"]");
    }



    }

    //отсортировать одномерный массив в порядке возрастания
    //если не знаете, как сортировать, то подсказка -
    //метод пузырька (один из самых простых для понимания)
    //правильный ответ - 1 балл
    public static int[] sort(int[] array){
        int b;
        for(int i =0;i< array.length-1;i++){
            for(int j=i+1;j< array.length;j++) {
                if(array[i]>array[j]) {
                    b=array[i];
                    array[i]=array[j];
                    array[j]=b;
                }
            }

        }
        return array;
    }


    //здесь можете тестировать свои решения
   /* public static void main(String[] args){
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Понедельник"));

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}};
        printArray(array2D);
    }*/
}
