package Task1;

public class Program {
    public static void main(String[] args) {

        MyArrayList<Employee> myArrayList = new MyArrayList<>(new Employee[1000]);
//        myArrayList.add("Hello");
        myArrayList.add(new Employee("Name #1"));
        myArrayList.add(new Employee("Name #2"));
//        myArrayList.add(false);
//        myArrayList.add(35.56);
        System.out.println("Количество элементов массива: " + myArrayList.size());

        Employee o = myArrayList.get(1);
//        Employee e = (Employee)o;
        System.out.println(o.getName());

    }
}
