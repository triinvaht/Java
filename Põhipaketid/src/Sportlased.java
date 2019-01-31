import java.io.Serializable;

public class Sportlased implements Comparable<Sportlased>, Serializable {
    private String name;
    private Double result;

    public Sportlased(String name, Double result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return String.format("%s\t%5.2f", this.name, this.result);
    }

    @Override
    public int compareTo(Sportlased other) {
//        if(other.result < this.result) return -1;
//        else if(other.result > this.result) return 1;
//        else return 0;
        return other.result.compareTo(this.result);
    }
}