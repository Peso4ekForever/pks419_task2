package tasl3global_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IInstrument> instruments = new ArrayList<>();

        Drum drum = new Drum();
        Guitar guitar = new Guitar();
        Trumpet trumpet = new Trumpet();

        instruments.add(drum);
        instruments.add(guitar);
        instruments.add(trumpet);
        instruments.add(trumpet);

        for(int i = 0; i < instruments.size(); i++){
            instruments.get(i).play();
        }
    }
}
