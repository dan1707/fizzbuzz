package biz.danri.FizzBuzz;

public class App {
    public static void main(String[] args) {
        String result = FizzBuzzBuilder.build(1, 100).getDelimitedFizzBuzzListString(",");
        System.out.println(result);
    }
}
