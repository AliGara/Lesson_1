import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{

    @Test
    public void testGetClassNumber() {
        int actual = this.getClassNumber();
        Assert.assertTrue("Number less than <= 45.", actual > 45);
    }
}
