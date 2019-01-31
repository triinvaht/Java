import java.util.ArrayList;
import java.util.Collections;

public class SortableList<T extends Comparable<T>> extends ArrayList<T> {
    public void sort() {
        Collections.sort(this);
    }
}