public class lesson_13_02 {
    //Преобразование типа int к Integer

    //Типы-обертки считаются аналогами их более примитивных собратьев:
    //можно легко создать соответствующий объект-обертку для примитивного типа.
    //Разберем взаимодействие примитивных типов и их типов-оберток на примере типа int.
    //Вот как бы выглядел код преобразования типа int к типу Integer и наоборот:

    //Чтобы преобразовать тип int к типу Integer, нужно написать код:
    //Integer имя = new Integer(значение);
    //Где имя — это имя переменной типа Integer, а значение — это оборачиваемое значение типа int.

    //Integer age = new Integer(18);
    //Integer hundred = new Integer(100);
    //Integer zero = new Integer(0);

    //А чтобы преобразовать тип Integer к типу int, нужно написать код:
    //int имя = переменная.intValue();
    //Где имя — это имя переменной типа int, а переменная — это переменная-ссылка на объект типа Integer.

    //Integer age = new Integer(18);
    //int x = age.intValue();

    //Integer hundred = new Integer(100);
    //int y = hundred.intValue();

    //Integer zero = new Integer(0);
    //int z = zero.intValue();

    //int i = 110;
    //Integer zero = new Integer(i);
    //int z = zero.intValue();

    //В классе Solution представлены 8 переменных примитивных типов с именами вида типValue.
    //Для каждой из этих переменных необходимо создать объекты-обертки и присвоить им имена вида типValueBox.
    //Для создания объектов-оберток используй метод Тип.valueOf(примитив).

    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    Byte byteValueBox = Byte.valueOf(byteValue);
    Short shortValueBox = Short.valueOf(shortValue);
    Integer integerValueBox = Integer.valueOf(intValue);
    Long longValueBox = Long.valueOf(longValue);

    Float floatValueBox = Float.valueOf(floatValue);
    Double doubleValueBox = Double.valueOf(doubleValue);

    Character characterValueBox = Character.valueOf(charValue);
    Boolean booleanValueBox = Boolean.valueOf(booleanValue);
}
