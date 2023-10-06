import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        int number = mainClass.getClassNumber();
        Assert.assertTrue("\n" +
                "getClassNumber method returns a number greater than 45", number > 45);
    }
}
