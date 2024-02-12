import java.util.ArrayList;

public class lesson_13_27 {
    //Дженерики

    //Под дженериками в Java подразумевают возможность добавлять к типам типы-параметры.
    //Таким образом получаются сложные составные типы. Такой составной тип в общем случае выглядит так:
    //ОсновнойТип<ТипПараметр>
    //Все вместе — это именно тип. И он может использоваться там, где обычно можно использовать типы.

    //Код	                                Описание
    //ArrayList<Integer> list;              Создание переменных
    //list = new ArrayList<Integer> ();     Создание объектов
    //ArrayList<Integer>[] array;           Создание массивов

    //Например, в такую коллекцию можно сохранить только переменные типа Integer:
    //Код	                                                    Описание
    //ArrayList<Integer> list = new ArrayList<Integer>();       Коллекция типа ArrayList с элементами типа Integer
    //list.add(new Integer(1));                                 Так можно
    //list.add(2);                                              И так можно: сработает autoboxing
    //list.add("Привет");                                       А так нельзя: ошибка компиляции

    //На самом деле Generics работают до ужаса примитивно.
    //Компилятор просто заменяет тип с параметром на него же, только без параметра.
    //А при взаимодействии с его методами добавляет операцию приведения типа к типу-параметру:
    //Код	                                                    Что сделает компилятор
    //ArrayList<Integer> list = new ArrayList<Integer>();       ArrayList list = new ArrayList();
    //list.add(1);                                              list.add( (Integer) 1 );
    //int x = list.get(0);                                      int x = (Integer) list.get(0);
    //list.set(0, 10);                                          list.set(0, (Integer) 10);

    //В классе UniversityDepartment есть метод printStudentNames(ArrayList), который принимает список объектов и выводит их имена.
    //Но на данный момент программа не компилируется.
    //Твоя задача исправить этот баг. Для этого нужно исправить сигнатуру метода printStudentNames(ArrayList),
    //чтобы он принимал список объектов только типа Student(используй дженерик).
    //Метод main не участвует в проверке.
}
class UniversityDepartment {

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Евгений"));
        students.add(new Student("Владислав"));

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


