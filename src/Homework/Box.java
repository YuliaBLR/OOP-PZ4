package Homework;

import java.util.ArrayList;

public class Box<T extends Fruit>{

    private String name;
    private ArrayList<T> fruits;

    public Box(String name) {
        this.name = name;
        fruits = new ArrayList<>();
    }

    /**
     * Метод добавления фрукта в коробку
     * @param f фрукт
     */
    public void addFruits(T f){
        fruits.add(f);
    }

    /**
     * Метод удаляет все фрукты из коробки
     */
    public void deleteAllFruits(){
        fruits.clear();
    }

    /**
     * Метод, возвращающий вес коробки
     * @return вес коробки
     */
    public float getWeight(){
        return fruits.size()*fruits.getFirst().getWeight();
    }

    /**
     * Метод сравнения текущей коробки с указанной в скобках
     * @param o коробка для сравнения с текущей коробкой
     * @return true – если их массы равны, иначе - false
     */
    public boolean compare(Box o) {
        return this.getWeight() == o.getWeight();
    }

    /**
     * Метод пересыпки фруктов из текущей коробки в другую
     * @param to коробка, в которую необходимо пересыпать фрукты
     */
    public void overfilling(Box<T> to){
        System.out.printf("Из коробки %s в коробку %s пересыпано фруктов (%s): %d шт.\n",
                this.name, to.name, fruits.getFirst().getName(), fruits.size());
        for (T f: this.fruits) {
            to.addFruits(f);
        }
        this.deleteAllFruits();
    }

    @Override
    public String toString() {
        if (fruits.isEmpty()) {
            return String.format("Наименование коробки: %s;\nКоличество фруктов: 0 шт.;\nВес коробки: 0", name);
        } else {
            return String.format("Наименование коробки: %s;\nТип фруктов: %s;\nКоличество фруктов: %d шт.;\nВес коробки: %.1f",
                    name, fruits.getFirst().getName(),fruits.size(), this.getWeight());
        }
    }
}


