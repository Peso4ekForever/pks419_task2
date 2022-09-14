package tasl3global;

public class Book implements IPrintable{
    @Override
    public void print(){
        System.out.println("Книга");
    }

    public static void printBooks(IPrintable[] printables) {
        for (int i = 0; i < printables.length; i++) {
            if (printables[i] instanceof Book) {
                printables[i].print();
            }
        }
    }
}

