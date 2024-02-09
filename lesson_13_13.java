import java.util.ArrayList;

public class lesson_13_13 {
    //Операции с ArrayList
    //Изначально длина только что созданного списка равна нулю: он содержит 0 элементов.
    //Если в список добавить один элемент, его длина увеличится на 1. Если удалить добавленный элемент, опять уменьшится до нуля.

    //Более подробно можно узнать о методах класса ArrayList из таблицы:

    //Методы	                        Описание
    //void add(тип value)               Добавляет в список переданный элемент
    //void add(int index, тип value)    Добавляет элемент в определенное место списка.
    //тип get(int index)                Возвращает элемент, который находится под номером index
    //void set(int index, тип value)    Меняет значение элемента с номером index на value
    //тип remove(int index)             Удаляет элемент под номером index. Возвращает удаленный элемент.
    //boolean remove(тип value)         Удаляет элемент: нужно передать сам элемент в список.
                                        //Если таких элементов несколько, будет удален первый из них.
    //void clear()                      Очищает список — удаляет все элементы из списка.
    //boolean contains(тип value)       Проверяет, содержится ли в списке элемент value.
    //boolean isEmpty()                 Проверяет, пустой список или нет. Равна ли длина списка нулю.
    //int size()                        Возвращает размер списка — количество элементов списка.
    //тип[] toArray(тип[] array)        Возвращает массив, содержащий те же элементы, что и список.Массив нужно передать в метод.

    //В классе lesson_13_13 есть список сотрудников waitingEmployees, которые ждут зарплату,
    //и список сотрудников alreadyGotSalaryEmployees, которые её уже получили.
    //Необходимо реализовать метод paySalary(String), который в качестве аргумента принимает имя сотрудника, желающего получить зарплату.
    //Метод должен проверить наличие сотрудника в списке waitingEmployees, и если он не получал зарплату, выдать её:
    //Если параметр метода paySalary(String) равняется null, ничего не нужно делать.
    //Добавить имя сотрудника в список alreadyGotSalaryEmployees.
    //В списке waitingEmployees заменить имя сотрудника на null.

    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        for (int i = 0; i < waitingEmployees.size(); i++) {
            if (name == null) {
                break;
            }
            if (name.equals(waitingEmployees.get(i)))
            {
                alreadyGotSalaryEmployees.add(waitingEmployees.get(i));
                waitingEmployees.set(i,null);
            }
        }
    }
}
