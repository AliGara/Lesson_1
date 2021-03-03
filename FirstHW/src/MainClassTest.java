import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetClassString() {
      Assert.assertTrue("There are no substrings", this.getClassString().contains("Hello") || this.getClassString().contains("hello"));
    }
}
   