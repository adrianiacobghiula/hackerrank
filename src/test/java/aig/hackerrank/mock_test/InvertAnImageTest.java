package aig.hackerrank.mock_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

class InvertAnImageTest {

    private InvertAnImage classUnderTest;

    @BeforeEach
    void init() {
        classUnderTest = new InvertAnImage();
    }

    @Test
    void sample1() {
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12),
                Arrays.asList(13, 14, 15, 16)
        );
        lists = classUnderTest.invertImage(lists);
        boolean deepEquals = Objects.deepEquals(lists, Arrays.asList(
                Arrays.asList(16, 15, 14, 13),
                Arrays.asList(12, 11, 10, 9),
                Arrays.asList(8, 7, 6, 5),
                Arrays.asList(4, 3, 2, 1)
        ));
        assertThat(deepEquals).isTrue();
    }
}
