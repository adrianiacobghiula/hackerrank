package aig.hackerrank.mock_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class VendingTest {

    Vending classUnderTest;

    @BeforeEach
    void init() {
        classUnderTest = new Vending();
    }

    @Test
    void sample1() {

        List<Integer> report = classUnderTest.getReport(Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(0, 3)
                ),
                Collections.singletonList(
                        Arrays.asList(0, 5)
                ));

        assertThat(report).containsExactly(2, 1);
    }

    @Test
    void sample2() {
        List<Integer> report = classUnderTest.getReport(Arrays.asList(
                Arrays.asList(1, 0),
                Arrays.asList(0, 10)
                ),
                Arrays.asList(
                        Arrays.asList(1, 5),
                        Arrays.asList(0, 6),
                        Arrays.asList(0, 5)
                ));


        assertThat(report).containsExactly(1, 15);

    }

    @Test
    void sample3() {
        List<Integer> report = classUnderTest.getReport(Arrays.asList(
                Arrays.asList(1, 0),
                Arrays.asList(0, 0),
                Arrays.asList(2, 0)
                ),
                Arrays.asList(
                        Arrays.asList(0, 3),
                        Arrays.asList(1, 2),
                        Arrays.asList(0, 4)
                ));
        assertThat(report).containsExactly(7, 2, 0);
    }

}

