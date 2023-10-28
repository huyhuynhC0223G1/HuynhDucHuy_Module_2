package ss8_clean_code.thuc_hanh;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static void main(String[] args) {
        System.out.println(calculate(1, 2, ADDITION));
    }

    public static int calculate(int number1, int number2, char opera) {
        switch (opera) {
            case ADDITION:
                return number1 + number2;
            case SUBTRACTION:
                return number1 - number2;
            case MULTIPLICATION:
                return number1 * number2;
            case DIVISION:
                if (number2 != 0)
                    return number1 / number2;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}