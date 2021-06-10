package biz.danri.FizzBuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzzBuilder {

    private final Stream<FizzBuzz> fizzBuzzStream;

    public FizzBuzzBuilder(Stream<FizzBuzz> fizzBuzzStream) {
        this.fizzBuzzStream = fizzBuzzStream;
    }

    public static FizzBuzzBuilder build(final int start, final int end) {
        Stream<FizzBuzz> stream = IntStream.rangeClosed(start, end).
                mapToObj(FizzBuzz::new);
        return new FizzBuzzBuilder(stream);
    }

    public List<FizzBuzz> getFizzBuzzList() {
        return fizzBuzzStream.collect(Collectors.toList());
    }

    public String getDelimitedFizzBuzzListString(String delimiter) {
        return this.fizzBuzzStream.
                map(FizzBuzz::toString).
                collect(Collectors.joining(delimiter));
    }
}
