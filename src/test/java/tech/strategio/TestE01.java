package tech.strategio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class TestE01 {
    @DisplayName("findThreeLargestNumbers")
    @ParameterizedTest(name = "{index} => {0} is {1}")
    @MethodSource("argumentStream")
    void argumentStream(int[] values, int[] result) {
        int[] val = E01.findThreeLargestNumbers(values);
        assertArrayEquals(result, val);
    }

    private static Stream<Arguments> argumentStream() {
        return Stream.of(
                Arguments.arguments(new int[] { 141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7 },
                        new int[] { 18, 141, 541 }),
                Arguments.arguments(new int[] { 55, 7, 8 }, new int[] { 7, 8, 55 }),
                Arguments.arguments(new int[] { 55, 43, 11, 3, -3, 10 }, new int[] { 11, 43, 55 }),
                Arguments.arguments(new int[] { 7, 8, 3, 11, 43, 55 }, new int[] { 11, 43, 55 }),
                Arguments.arguments(new int[] { 55, 7, 8, 3, 43, 11 }, new int[] { 11, 43, 55 }),
                Arguments.arguments(new int[] { 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 }, new int[] { 7, 7, 7 }),
                Arguments.arguments(new int[] { 7, 7, 7, 7, 7, 7, 8, 7, 7, 7, 7 }, new int[] { 7, 7, 8 }),
                Arguments.arguments(new int[] { -1, -2, -3, -7, -17, -27, -18, -541, -8, -7, 7 },
                        new int[] { -2, -1, 7 }));

    }
}
