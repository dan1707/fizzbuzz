package biz.danri.FizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzUnitTest {

    @Test
    public void testIsFizzIsTrueForMultipleOf3() {
        FizzBuzz fb = new FizzBuzz(3);
        Assertions.assertTrue(fb.isFizz());
        Assertions.assertEquals(FizzBuzz.FIZZ, fb.toString());

        fb = new FizzBuzz(9);
        Assertions.assertTrue(fb.isFizz());
        Assertions.assertEquals(FizzBuzz.FIZZ, fb.toString());
    }

    @Test
    public void testIsFizzIsFalseForNotMultipleOf3() {
        FizzBuzz fb = new FizzBuzz(4);
        Assertions.assertFalse(fb.isFizz());
        Assertions.assertEquals("4", fb.toString());

        fb = new FizzBuzz(8);
        Assertions.assertFalse(fb.isFizz());
        Assertions.assertEquals("8", fb.toString());
    }

    @Test
    public void testIsBuzzIsTrueForMultipleOf5() {
        FizzBuzz fb = new FizzBuzz(5);
        Assertions.assertTrue(fb.isBuzz());
        Assertions.assertEquals(FizzBuzz.BUZZ, fb.toString());

        fb = new FizzBuzz(10);
        Assertions.assertTrue(fb.isBuzz());
        Assertions.assertEquals(FizzBuzz.BUZZ, fb.toString());
    }

    @Test
    public void testIsBuzzIsFalseForNotMultipleOf5() {
        FizzBuzz fb = new FizzBuzz(7);
        Assertions.assertFalse(fb.isBuzz());
        Assertions.assertEquals("7", fb.toString());

        fb = new FizzBuzz(11);
        Assertions.assertFalse(fb.isBuzz());
        Assertions.assertEquals("11", fb.toString());
    }

    @Test
    public void testIsFizzAndIsBuzzIsTrueForMultipleOf15() {
        FizzBuzz fb = new FizzBuzz(15);
        Assertions.assertTrue(fb.isFizz());
        Assertions.assertTrue(fb.isBuzz());
        Assertions.assertEquals(FizzBuzz.FIZZ + FizzBuzz.BUZZ, fb.toString());

        fb = new FizzBuzz(30);
        Assertions.assertTrue(fb.isFizz());
        Assertions.assertTrue(fb.isBuzz());
        Assertions.assertEquals(FizzBuzz.FIZZ + FizzBuzz.BUZZ, fb.toString());
    }

    @Test
    public void testIsFizzAndIsBuzzIsFalseForNotMultipleOf15() {
        FizzBuzz fb = new FizzBuzz(22);
        Assertions.assertFalse(fb.isFizz());
        Assertions.assertFalse(fb.isBuzz());
        Assertions.assertEquals("22", fb.toString());

        fb = new FizzBuzz(38);
        Assertions.assertFalse(fb.isFizz());
        Assertions.assertFalse(fb.isBuzz());
        Assertions.assertEquals("38", fb.toString());
    }
}
