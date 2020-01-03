public class MathHelper {

    public int simple_int = 7;
    public static int static_int = 7;

    public void changeSimpleInt() {

    }
    public int calc (int a, int b, char action) {
        int result = 0;
        switch (action) {
            case '+' :
                result = plus(a, b);
                break;
            case '-':
                result = minus(a, b);
                break;
            case '*':
                result = multiply(a, b);
                break;
            case '/':
                result = divide(a, b);
                break;
            default:
                typeAnError("Unknown operation '" + action + "'. Use +, -, *, /" );
                break;
        }
        return result;
    }


    private void typeAnError(String error_meaasge) {
        System.out.println(error_meaasge);
    }

    private int multiply(int a) {
        return a * 2;
    }

    private int plus (int a, int b) {
        return a + b;
    }

    private int minus (int a, int b) {
        return a - b;
    }

    private int multiply (int a, int b) {
        return a * b;
    }

    private int divide (int a, int b) {
        if (b == 0) {
            this.typeAnError("Division by zero is unacceptable");
            return 0;
        }
        return a / b;
    }
}
