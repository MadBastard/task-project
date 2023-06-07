package chapter2.two29;

public class IntegerValueofaCharacter {
    public static void main(String[] args) {
        char[] array = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};
        for (char c : array) {
            System.out.printf("The character %c has the value %d%n", c, ((int) c));
        }
    }
}
