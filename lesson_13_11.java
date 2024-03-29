public class lesson_13_11 {
    //Класс ArrayList

    //Это первый класс из так называемых коллекций.

    //Программистам очень не нравилось одно свойство массива — его размер нельзя изменять.
    //Что делать, если нужно сохранить в массиве ещё три элемента, а свободное место только одно?

    //Единственным решением проблемы нехватки места в массиве было создание массива очень большого размера,
    //чтобы все элементы туда точно поместились. Но это часто приводило к нерациональному расходу памяти.
    //Если обычно в массиве хранилось два-три элемента, но был хотя бы мизерный шанс, что там их будет 100,
    //приходилось создавать массив на 100 элементов.

    //И что же придумали программисты? Они написали класс ArrayList (массив-список),
    //который выполнял ту же работу, что и Array (массив), но мог изменять свой размер.

    //Само название ArrayList происходит из двух слов: Array + List. Array — это массив, а List — список.
    //Внутри каждого объекта типа ArrayList хранится обычный массив элементов. Когда вы считываете элементы из ArrayList,
    //он считывает их со своего внутреннего массива. Когда записываете — записывает их во внутренний массив.

    //У класса ArrayList отсутствуют все недостатки, которые есть у массивов. Он умеет:
    //Хранить элементы определенного типа
    //Динамически менять размер списка
    //Добавлять элементы в конец списка
    //Вставлять элементы в начало и середину списка
    //Удалять элементы из любого места списка


}
