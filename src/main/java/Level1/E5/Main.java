package Level1.E5;

public record Main() {
    public void main(String[] args) {
        PiInterface pi = () -> 3.1415;
        System.out.println(pi.getPiValue());
    }
}
