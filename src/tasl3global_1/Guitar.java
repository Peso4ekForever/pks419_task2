package tasl3global_1;

public class Guitar implements IInstrument{
    private int stringCount;

    @Override
    public void play() {
        System.out.println("Гитара играет");
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }

    public int getStringCount() {
        return stringCount;
    }
}
