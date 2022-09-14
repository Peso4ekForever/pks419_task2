package tasl3global;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IPrintable> printable = new ArrayList<>();

        Book book = new Book();
        Magazine magazine = new Magazine();
        printable.add(book);
        printable.add(magazine);
        printable.add(magazine);
        printable.add(magazine);
        printable.add(book);

        for (int i = 0; i < printable.size(); i++){
            printable.get(i).print();
        }
    }
}
