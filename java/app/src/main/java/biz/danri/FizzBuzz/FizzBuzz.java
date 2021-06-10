package biz.danri.FizzBuzz;

public class FizzBuzz {

    public final static String FIZZ = "Fizz";
    public final static String BUZZ = "Buzz";

    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    boolean isFizz() {
        return (this.number % 3 == 0);
    }

    boolean isBuzz() {
        return (this.number % 5 == 0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isFizz()) {
            sb.append(FIZZ);
        }
        if (isBuzz()) {
            sb.append(BUZZ);
        }
        if (sb.length() == 0) {
            return Integer.toString(this.number);
        }
        return sb.toString();
    }
}
