package tasl3global;

public class Magazine implements IPrintable {
    @Override
    public void print() {
        System.out.println("Журнал");
    }

    public static void printMagazines(IPrintable[] printables) {
        for (int i = 0; i < printables.length; i++) {
            if (printables[i] instanceof Magazine) {
                printables[i].print();
            }
        }
    }
}
