import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ranNum = new Random();
        LinkedList<String> firstList = new LinkedList<>();
        LinkedList<String> secondList = new LinkedList<>();
        LinkedList<Integer> thirdList = new LinkedList<>();
        Queue<String> queList = new LinkedList<>();
        fillList(firstList);
        fillInt(thirdList, ranNum);

//------------------------------------Задача 1------------------------------------------------
        //System.out.println("Оригинальный LinkedList => " + firstList);
        //System.out.println("Перевёрнутый LinkedList => " + task1(firstList, secondList));

//------------------------------------Задача 2------------------------------------------------
        //System.out.println("Оригинальный LinkedList => " + firstList);
        //System.out.println("Queque очередь заполненная с помощью enque(add) по условию только чётных индексов => " + task2(queList, firstList));
        //queList.poll();
        //System.out.println("Используем метод poll(remove) чтобы удалить первый элемент => " + queList);
        //System.out.println("Используем метод pick(element) чтобы показать первый элемент не удаляя его => " + queList.peek());

//------------------------------------Задача 3------------------------------------------------
        //System.out.println("Оригинальный Интеджеровый LinkedList => " + thirdList);
        //System.out.println("Сумма чисел этого массива = " + task3(thirdList));
    }

    static LinkedList<String> task1(LinkedList<String> getList, LinkedList<String> returnList) {
        //Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        for (int i = getList.size() - 1; i >= 0; i--) {
            returnList.add(getList.get(i));

        }
        return returnList;
    }

    static LinkedList<String> fillList(LinkedList<String> fillLinked) {
        fillLinked.add("Раз");
        fillLinked.add("Два");
        fillLinked.add("Три");
        fillLinked.add("Ёлочка");
        fillLinked.add("Гори");
        return fillLinked;
    }

    static Queue<String> task2(Queue list, LinkedList<String> getList) {
        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в
        конец очереди, dequeue () - возвращает первый элемент из очереди и удаляет его, first() - возвращает
        первый элемент из очереди, не удаляя.
         */
        String test = new String();
        for (int i = 0; i < getList.size(); i++) {
            if (i % 2 == 0)
                list.add(getList.get(i));
        }
        return list;
    }

    static LinkedList<Integer> fillInt(LinkedList<Integer> getList, Random ranNum) {
        for (int i = 0; i < 10; i++) {
            getList.add(ranNum.nextInt(10));
        }
        return getList;
    }

    static Integer task3(LinkedList<Integer> getList) {
        //Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
        int sum = 0;
        for (Integer itList : getList) {
            sum += itList.intValue();
        }
        return sum;
    }

}