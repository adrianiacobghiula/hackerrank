package aig.hackerrank.interview_preparation_kit.dictionaries;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FrequencyQueriesTest {

  @Test
  void testFreqQuerySampleA() {
    List<Integer> answers =
        new FrequencyQueries(
                Arrays.asList(
                    insert(1), remove(2), query(2), insert(1), insert(1), remove(1), query(2)))
            .freqQuery();
    assertThat(answers).containsExactly(0, 1);
  }

  @Test
  void testFreqQuerySample0() {
    List<Integer> answers =
        new FrequencyQueries(
                Arrays.asList(
                    insert(5),
                    insert(6),
                    query(2),
                    insert(10),
                    insert(10),
                    insert(6),
                    remove(5),
                    query(2)))
            .freqQuery();
    assertThat(answers).containsExactly(0, 1);
  }

  @Test
  void testFreqQuerySample1() {
    List<Integer> answers =
        new FrequencyQueries(Arrays.asList(query(4), remove(1003), insert(16), query(1)))
            .freqQuery();
    assertThat(answers).containsExactly(0, 1);
  }

  @Test
  void testFreqQuerySample2() {
    List<Integer> answers =
        new FrequencyQueries(
                Arrays.asList(
                    insert(3), remove(2), query(2), insert(4), insert(5), insert(5), insert(4),
                    query(2), remove(4), query(2)))
            .freqQuery();
    assertThat(answers).containsExactly(0, 1, 1);
  }

  private List<Integer> insert(int key) {
    return Arrays.asList(1, key);
  }

  private List<Integer> remove(int key) {
    return Arrays.asList(2, key);
  }

  private List<Integer> query(int key) {
    return Arrays.asList(3, key);
  }
}
