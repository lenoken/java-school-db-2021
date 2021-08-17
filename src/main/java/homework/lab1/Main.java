package homework.lab1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        LenaSuperIntegerList list = new LenaSuperIntegerList();
        list.add(3);
        list.add(1);
        list.add(4);
        list.printAll();
        list.removeByIndex(0);
        list.printAll();
        list.add(3);
        list.printAll();
        list.removeByValue(3);
        list.printAll();
        System.out.println(list.get(0));
    }
}
