import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        int localNumber = mainClass.getLocalNumber();
        Assert.assertEquals("\n" +
                "Method getLocalNumber() should return 14", 14, localNumber);
    }
}