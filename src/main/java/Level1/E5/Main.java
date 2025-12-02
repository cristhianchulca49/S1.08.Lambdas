package Level1.E5;

public record Main() {
    public void main(String[] args) {
        final double PI = 3.1415;
        PiInterface pi = () -> PI;
        System.out.println(pi.getPiValue());
    }
}
