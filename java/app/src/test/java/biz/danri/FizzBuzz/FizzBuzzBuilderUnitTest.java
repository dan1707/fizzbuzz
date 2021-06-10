package biz.danri.FizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FizzBuzzBuilderUnitTest {

    static String EXPECTED_DELIMITED_LIST_STRING = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz";
    static String DELIMITER = ",";

    @Test
    public void testBuildAndList() {
        FizzBuzzBuilder builder = FizzBuzzBuilder.build(1, 15);

        List<FizzBuzz> fbList = builder.getFizzBuzzList();
        Assertions.assertEquals(15, fbList.size());
    }

    @Test
    public void testDelimitedListString() {
        FizzBuzzBuilder builder = FizzBuzzBuilder.build(1, 15);

        String result = builder.getDelimitedFizzBuzzListString(DELIMITER);
        Assertions.assertEquals(EXPECTED_DELIMITED_LIST_STRING, result);
    }

}
