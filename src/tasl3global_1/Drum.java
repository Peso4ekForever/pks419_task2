package tasl3global_1;

public class Drum implements IInstrument{
    private int drumSize;

    @Override
    public void play() {
        System.out.println("Барабан играет");
    }

    public void setDrumSize(int drumSize) {
        this.drumSize = drumSize;
    }

    public int getDrumSize() {
        return drumSize;
    }
}
