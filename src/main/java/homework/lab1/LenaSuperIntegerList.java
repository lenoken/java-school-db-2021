package homework.lab1;

import java.util.Arrays;

public class LenaSuperIntegerList implements SuperIntegerList{

    private int[] myList;
    private int lastIndex;

    public LenaSuperIntegerList() {
        this.myList = new int[1];
        this.lastIndex = 0;
    }

    @Override
    public void add(int number) {
        int[] newList = new int[myList.length + 1];
        System.arraycopy(myList, 0, newList,0, myList.length);
        newList[++lastIndex] = number;
        myList = newList;
    }

    @Override
    public void removeByIndex(int index) {
        if (index > lastIndex || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int[] newList = new int[myList.length - 1];
        System.arraycopy(myList, 0, newList,0, index);
        System.arraycopy(myList, index + 1, newList, index, lastIndex - index);
        myList = newList;
        lastIndex--;
    }

    @Override
    public void removeByValue(int value) {
        for (int i = 0; i <= lastIndex; i++) {
            if (myList[i] == value) {
                this.removeByIndex(i--);
            }
        }
    }

    @Override
    public int get(int index) {
        if (index < 0 || index > lastIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return myList[index];
    }

    @Override
    public void printAll() {
        for (int value : myList) {
            System.out.println(value + " ");
        }
    }
}
