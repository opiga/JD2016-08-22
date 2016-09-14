package by.it.grechishnikov.jd01_02;

/**
 * Created by Evgeniy on 24.08.16.
 */
public class Runner {
    public static void main(String[] args) {
        String[] arr = introduction();
//        String[] test = { "10", "12", "-30" }; //для тестов

        taskA(arr);
        taskB(args);
        taskC();
    }

    public static String[] introduction() {
        //Ввести n чисел с консоли через пробел. Преобразовать полученную строку в массив целых чисел
        System.out.println("Введите числа через пробел:");
        String line = Util.getLine();

        String[] strMass = line.split(" ");
        int[] intMass = Util.getIntArr(strMass); //преобразование в массив целых чисел. Требуется в задании
        return strMass;
    }

    public static void taskA(String[] arr) {
        System.out.println("Задание А.");
        //1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длинну
        TaskA.printMin(arr);
        TaskA.printMax(arr);

        //2.Вывести на консоль те числа, длинна которых меньше среднего арифметического
        TaskA.printMean(arr);

        //3.Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них
        TaskA.getUniqInt(arr);
    }

    public static void taskB(String[] arr) {
        System.out.println("Задание В.");
        //1.Определить принадлежность некоторого значения k к интервалу [n, m]
        TaskB.interval();

        //2.Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз(k выберите квадратом челого числа)
        TaskB.printMatrix();

        //3.Найти корни квадратного уравнения. Параметры уравнения передавать с командной строкой
        TaskB.getSqrt(arr);

        /* 4.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующее данному месяцу. Осуществлять
        проверку корректности ввода чисел */
        TaskB.printMonth();

    }

    public static void taskC() {
        System.out.println("Задание С.");
        //1.Ввести с консоли n-размерность матрицы a[n][n].

        //2.Задать значение элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел

        /* 3.Выполнить следующие шаги (после каждого шага необходимо печатать на консоль полученный результат):
        1.Найти сумму элементов матрицы, расположенных между первым и вторым положительным элементом каждой строки.
        2.Транспортировать матрицу
        3.Повернуть матрицу на 90 градусов против часовой стрелки
        4.Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое
        5.Найти максимальный элемент(ы) в матрице и удалить из матрицы все строки и столбцы, содержащие его
        6.В матрице найти минимальный элемент и переместить его на место [1,1] путем перестановки строк и столбцов
        7.Преобразовать строки матрицы таким образом, что бы элементы, равные нулю, распологались после всех остальных
         */
        TaskC.matrix();
    }
}