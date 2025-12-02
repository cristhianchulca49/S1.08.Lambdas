package Level1.E8;

public class Main {
    public static void main(String[] args) {
        String message = "cristhian";
        ReverseInterface reverseMessage = (phrase) -> new StringBuilder(phrase).reverse().toString();
        System.out.println(reverseMessage.reverse(message));
    }
}
