import org.junit.Test;

public class MainTest {
//    int a =5;
//    int b = 11;

    @Test
    public void myFirstTest() {

        MathHelper helper = new MathHelper();
        int a = helper.calc(5, 8, '+');
        System.out.println(a);

        int b = helper.calc(10, 15, '*');
        System.out.println(b);
    }

    @Test
    public void mySecondTest () {
        System.out.println("Before test static_int: " + MathHelper.static_int);
        MathHelper.static_int = 0;
        MathHelper helper = new MathHelper();
        System.out.println("Before test simple_int: " + helper.simple_int);
        helper.simple_int = 8;
    }

    @Test
    public void myThirdTest () {
        System.out.println("Before test static_int: " + MathHelper.static_int);
        MathHelper.static_int = 0;
        MathHelper helper = new MathHelper();
        System.out.println("Before test simple_int: " + helper.simple_int);
        helper.simple_int = 8;
    }
}
