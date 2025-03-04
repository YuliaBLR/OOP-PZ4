package Homework;

public class Programm {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */

    public static void main(String[] args) {


        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> box1 = new Box<>("Box #1");
        box1.addFruits(apple);
        box1.addFruits(apple);
        box1.addFruits(apple);
//        System.out.println(box1.getWeight());
        System.out.println(box1);

        Box<Orange> box2 = new Box<>("Box #2");
        box2.addFruits(orange);
        box2.addFruits(orange);
//        System.out.println(box2.getWeight());
        System.out.println(box2);

        Box<Orange> box3 = new Box<>("Box #3");
        box3.addFruits(orange);
        System.out.println(box3);

        System.out.println();
        System.out.println(box2.compare(box1));
        System.out.println(box1.compare(box3));

        System.out.println();
        box2.overfilling(box3);
        System.out.println(box2);
        System.out.println(box3);


    }

}