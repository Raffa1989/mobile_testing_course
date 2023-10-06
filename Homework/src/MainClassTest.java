import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassString() {
        MainClass mainClass = new MainClass();
        String text = mainClass.getClassString();
        boolean containsHello = text.contains("hello") || text.contains("Hello");
        Assert.assertTrue("\n" +
                "the getClassString method returns a result that contains the substring \"hello\" or \"Hello\"", containsHello);
    }
}
