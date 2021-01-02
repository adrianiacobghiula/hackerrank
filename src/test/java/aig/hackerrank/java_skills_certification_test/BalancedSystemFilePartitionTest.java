package aig.hackerrank.java_skills_certification_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BalancedSystemFilePartitionTest {

    BalancedSystemFilePartition classUnderTest;

    @BeforeEach
    void init() {
        classUnderTest = new BalancedSystemFilePartition();
    }

    @Test
    void sample1() {
        List<Integer> parent = Arrays.asList(-1, 0, 0, 1, 1, 2);
        List<Integer> filesSize = Arrays.asList(1, 2, 2, 1, 1, 1);
        int diff = classUnderTest.absoluteDifference(parent, filesSize);
        assertThat(diff).isEqualTo(0);
    }

    @Test
    void sample2() {
        List<Integer> parent = Arrays.asList(-1, 0, 1, 2);
        List<Integer> filesSize = Arrays.asList(1, 4, 3, 4);

        int diff = classUnderTest.absoluteDifference(parent, filesSize);
        assertThat(diff).isEqualTo(2);
    }
}
