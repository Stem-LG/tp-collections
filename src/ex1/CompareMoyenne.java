package ex1;
import java.util.Comparator;

public class CompareMoyenne implements Comparator<Etudiant> {

    public int compare(Etudiant e1, Etudiant e2) {
        return e1.compareTo(e2);
    }

}
