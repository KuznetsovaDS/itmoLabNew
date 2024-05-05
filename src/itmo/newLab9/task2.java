package itmo.newLab9;
import java.util.Collection;
import java.util.HashSet;

public class task2 {
    public static <T> Collection<T> withoutDublicats(Collection<T> collection){
        return new HashSet<>(collection);
    }
}
