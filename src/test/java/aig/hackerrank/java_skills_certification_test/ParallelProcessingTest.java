package aig.hackerrank.java_skills_certification_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ParallelProcessingTest {

    ParallelProcessing classUnderTest;

    @BeforeEach
    void init() {
        classUnderTest = new ParallelProcessing();
    }

    @Test
    void sample1() {
        List<Integer> files = Arrays.asList(4, 1, 3, 2, 8);
        int numCores = 4;
        int limit = 1;
        long minTime = classUnderTest.minTime(files, numCores, limit);
        assertThat(minTime).isEqualTo(12);

    }

    @Test
    void sample2() {
        List<Integer> files = Arrays.asList(5, 3, 1);
        int numCores = 5;
        int limit = 5;
        long minTime = classUnderTest.minTime(files, numCores, limit);
        assertThat(minTime).isEqualTo(5);

    }
}
