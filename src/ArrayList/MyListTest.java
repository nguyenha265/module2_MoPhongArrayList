package ArrayList;

public class MyListTest {
    static MyList myList = new MyList();
    static Object[] myLists = myList.show();

    public static void main(String[] args) {
        myList.addLast("hello");
        myList.addLast(212312);
        myList.addLast(true);
        myList.add(3, "ok");
        myList.add(7, "chao dai ca");

        myList.upDate(2, "sua phan tu 2");

        myList.remote(3);

        System.out.println(myList.get(7));

        System.out.println(myList.contains(212312));


        show();

    }

    public static void show() {
        int check = 0;
        for (Object product : myLists) {
            check++;
            if (product != null) {
                System.out.println(product.toString());
            }
        }
    }

}
