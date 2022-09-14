package tasl3global_1;

public class Trumpet implements IInstrument{
    private int trumpetDiameter;

    @Override
    public void play() {
        System.out.println("Труба играет");
    }

    public void setTrumpetDiameter(int trumpetDiameter) {
        this.trumpetDiameter = trumpetDiameter;
    }

    public int getTrumpetDiameter() {
        return trumpetDiameter;
    }
}
