import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombinationIteratorTest {
    @Test
    public void test1(){
        CombinationIterator ci = new CombinationIterator("fiklnuy",3);
        while(ci.hasNext()){
            System.out.println(ci.next());
        }
    }
}
