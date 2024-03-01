package ex1;
import java.util.ArrayList;

public class Etudiant implements Statisticable, Comparable<Etudiant> {
    int matricule;
    String nom;
    ArrayList<Note> notes;

    public String getNom() {
        return nom;
    }

    public void addNote(Note n) {
        notes.add(n);
    }

    public float getValue() {
        float res = 0;

        for (Note note : notes) {
            res += note.getValue();
        }

        res /= notes.size();

        return res;
    }

    public int compareTo(Etudiant e) {
        if (getValue() == e.getValue()) {
            return 0;
        } else if (getValue() > e.getValue()) {
            return 1;
        } else {
            return -1;
        }
    }

}
