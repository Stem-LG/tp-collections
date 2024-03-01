package ex1;
import java.util.ArrayList;

public class Stats {

    float moy = 0, meilleur = 0, moins = 20;

    ArrayList<Statisticable> list;

    Stats(ArrayList<Statisticable> s) {
        list = s;

        for (Statisticable c : list) {
            float value = c.getValue();
            moy += value;
            if (value > meilleur) {
                meilleur = value;
            }

            if (value < moins) {
                moins = value;
            }

        }

        moy /= list.size();
    }

    public float getMoy() {
        return moy;
    }

    public float getMeilleur() {
        return meilleur;
    }

    public float getMoins() {
        return moins;
    }

}
