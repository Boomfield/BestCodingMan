package Core;

import java.util.ArrayList;

public class CustomArrayList <T> {
    Object[] list = new Object[10];
    private int size;


    public void Add(T t) {
        list[size] = t;
        size = size + 1;
    }

    public ArrayList<T> ToList() {
        ArrayList<T> arrayList = new ArrayList<>();
            for (int i = 0;i<size;i++) {
                arrayList.add((T)list[i]);

        }
        return arrayList;
    }


}