import com.github.davidmoten.rtree.Entry;
import com.github.davidmoten.rtree.geometry.Point;
import info.debatty.java.stringsimilarity.Jaccard;

class Pairs {
    private Entry<String, Point> firstPoint;
    private Entry<String, Point> secondPoint;

    public Pairs(Entry<String, Point> firstPoint, Entry<String, Point> secondPoint) { //constructor of pairs
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }
    public static double pairJaccardSimilarity(Pairs pair){
        Jaccard jac = new Jaccard(3);
        String string1 = pair.firstPoint.value();
        String string2 = pair.secondPoint.value();
        double jaccardSimilarity = jac.similarity(string1, string2);


        return jaccardSimilarity;
    }


    @Override
    public String toString() {
        return "\nPair{" + "FIRST=" + firstPoint + ", SECOND=" + secondPoint + '}';
    }

}