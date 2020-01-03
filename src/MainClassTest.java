import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        int wantedNumber = 14;
        MainClass mainClass = new MainClass();
        int gotNumber = mainClass.getLocalNumber();
        Assert.assertEquals(
                "[ERROR] LocalNumber doesn't match to expected: " + wantedNumber + " instead of " + gotNumber,
                wantedNumber, gotNumber);
    }

    @Test
    public void testGetClassNumber() {
        int wantedLimit = 45;
        MainClass mainClass = new MainClass();
        int gotNumber = mainClass.getClassNumber();
        Assert.assertTrue("[ERROR] Expected nunber more then " + wantedLimit + ", but found: " + gotNumber,
                gotNumber > wantedLimit);
    }

    @Test
    public void testGetClassString() {
        String[] wantedSubstrings = {"Hello", "hello"};
        String string = new MainClass().getClassString();
        boolean found = false;

        for (String substring : wantedSubstrings) {
            if (string.contains(substring)) {
                found = true;
                break;
            }
        }

        Assert.assertTrue(
                "[ERROR] String \"" + string + "\" doesn't contain wanted substrings: [" + String.join(",", wantedSubstrings) + "]",
                found);

    }

}