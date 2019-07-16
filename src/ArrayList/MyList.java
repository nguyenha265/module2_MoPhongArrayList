package ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elemenls;

    public int getSide() {
        return size;
    }

    public void setSide(int side) {
        this.size = side;
    }

    public Object[] getElemenls() {
        return elemenls;
    }

    public void setElemenls(Object[] elemenls) {
        this.elemenls = elemenls;
    }

    public static int getDefaultCapacity() {
        return DEFAULT_CAPACITY;
    }

    public MyList() {
        elemenls = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int newsize) {
        elemenls = new Object[newsize];
    }

    private void ensureCapaCity() {
        int newSize = elemenls.length + 1;
        elemenls = Arrays.copyOf(elemenls, newSize);
    }

    public boolean addLast(E e) {
        if (elemenls.length == size) {
            ensureCapaCity();
        }
        elemenls[size++] = e;
        return true;
    }

    public void add(int index, E element) {
        for (int i = 0; i < elemenls.length; i++) {
            if (index == i) {
                elemenls[i] = element;
            }
        }
    }

    public void upDate(int index, E e) {
        for (int i = 0; i < elemenls.length; i++) {
            if (i == index - 1) {
                elemenls[i] = e;
            }
        }

    }

    public E remote(int index) {
        for (int i = 0; i < elemenls.length; i++) {
            if (i == index - 1) {
                for (int j = index; j < elemenls.length && elemenls[j] != null; j++) {
                    elemenls[j] = elemenls[j + 1];
                }
            }
        }
        return (E) elemenls;
    }

    public int size() {
        int check = 0;
        for (int i = 0; i < elemenls.length; i++) {
            if (elemenls[i] != null) {
                check++;
            }
        }
        return check;
    }

    public E clone() {
        MyList<E> myList = new MyList<>();
        myList.elemenls = this.elemenls;
        myList.size = this.size;
        return (E) myList;
    }

    public E[] show() {
        return (E[]) elemenls;
    }

    public boolean contains(E o) {
        boolean check = false;
        for (int i = 0; i < elemenls.length && elemenls[i] != null; i++) {
            if (elemenls[i].equals(o)) {
                check = true;
            }
        }
        return check;
    }

    public int indexOf(E o) {
        int check = -1;
        for (int i = 0; i < elemenls.length && elemenls[i] != null; i++) {
            if (elemenls[i].equals(o)) {
                check = i;
            }
        }
        return check;
    }

    public E get(int index) {
        return (E) elemenls[index];
    }

    public void clear() {
        for (int i = 0; i < elemenls.length; i++) {
            elemenls[i] = null;
        }
    }
}
