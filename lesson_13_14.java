public class lesson_13_14 {
    //Сравнение ArrayList и Array


    //Фактически у массива есть всего 4 действия:

    //Создание массива
    //Получение элемента по номеру
    //Установка элемента по номеру
    //Получение длины массива

    //Вот аналоги этих операций в массиве и в ArrayList:

    //Массив	                            ArrayList
    //String[] array = new String[10];      ArrayList<String> list = new  ArrayList<String>();
    //String s = array[0];                  String s = list.get(0);
    //array[0] = "Пока";                    list.set(0, "Пока");
    //int count = array.length;             int count = list.size();

    //В принципе можно провести четкую аналогию. Причем в массиве все даже как-то короче и понятнее что-ли.
    //Но и в ArrayList не сильно сложно: получить элемент — метод get(), изменить элемент — метод set(), получить длину списка — метод size().

    //Так зачем программисты используют класс ArrayList?

    //Конечно же, все дело в остальных методах, которых у массива нет и не будет:

    //Добавление элемента в список
    //Вставка элемента в середину списка
    //Поиск элемента в списке
    //Удаление элемента из списка

    //Ты видишь рабочую программу, в которой массив int[] numbers заполняется числами в методе init().
    //Затем в методе reverse() происходит перестановка чисел в обратном порядке.
    //Твоя задача — переписать код так, чтобы вместо массива int[] numbers использовался список ArrayList<Integer> numbers.
    //Название методов и переменных не изменяй.
    //Методы main() и print() не принимают участие в проверке.

    public static int[] numbers = new int[10];

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
    }

    public static void reverse() {
        int n = numbers.length - 1;
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - i];
            numbers[n - i] = temp;
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
