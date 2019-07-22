package com.panibrat.concurrency._1117;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class H2OTest {

  @Test
  public void test() throws InterruptedException {
    ExecutorService executorService = Executors.newWorkStealingPool();
    String sequence = "OOOOHHHHHHHHOOOOHHHHHHHH";
    StringBuilder buffer = new StringBuilder();
    H2O h2o = new H2O();

    for (char c : sequence.toCharArray()) {
      if (c == 'H') {
        executorService.submit(
            () -> {
              try {
                h2o.hydrogen(() -> buffer.append('H'));
              } catch (InterruptedException e) {
                return;
              }
            });
      } else if (c == 'O') {
        executorService.submit(
            () -> {
              try {
                h2o.oxygen(() -> buffer.append('O'));
              } catch (InterruptedException e) {
                return;
              }
            });
      }
    }

    executorService.shutdown();
    executorService.awaitTermination(1, TimeUnit.MINUTES);

    assertThat(buffer.toString()).matches(H2OTest::waterMoleculesSequence);
  }

  private static boolean waterMoleculesSequence(String s) {
    for (int i = 0; i < s.length(); i += 3) {
      String molecule = s.substring(i, i + 3);
      if (!molecule.equals("HOH") && !molecule.equals("OHH") && !molecule.equals("HHO")) {
        return false;
      }
    }
    return true;
  }
}
