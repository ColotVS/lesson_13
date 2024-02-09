public class lesson_13_04 {
    //Autoboxing и unboxing

    //Однако даже простые операции с типом Integer писать непросто.

    //Как мы уже говорили, тип Integer — неизменяемый (immutable).
    //Чтобы создать объект типа Integer с новым значением типа int, нужно явно создать новый объект Integer.
    //Зато получить значение типа int, которое хранится внутри объекта Integer, просто: нужно вызвать метод intValue().

    //Код	                            Описание
    //Integer a = Integer.valueOf(5);   Оборачиваем 5 в класс Integer
    //int b = a.intValue();             Получаем значение из объекта Integer
    //Integer c = new Integer(b + 5)    Создаем новое значение Integer == 10

    //Код довольно громоздкий, не находите?
    //Создатели Java тоже так считают, поэтому они научили компилятор делать эти операции автоматически.
    //Автоматическое преобразование int в Integer называется autoboxing (box — коробка, класть в коробку),
    //а обратная операция — Integer к int — unboxing.

    //Ваш код	                            Что видит компилятор
    //Integer a = 10;                       Integer a = Integer.valueOf(10);
    //int b = a;                            int b = a.intValue();
    //Integer c = a + b;                    Integer c = Integer.valueOf(a.intValue() + b);

    //Благодаря autoboxing и unboxing, вы можете спокойно присваивать тип int типу Integer и наоборот.
    //Можно писать выражения любой сложности и не делать различий между типами int и Integer.




}
