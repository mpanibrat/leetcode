package com.panibrat.concurrency._1116;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class ZeroEvenOddTest {

  @Test
  public void test() throws InterruptedException {
    int n = 5;

    ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(n);
    StringBuilder buffer = new StringBuilder();
    ExecutorService executor = Executors.newFixedThreadPool(3);

    executor.submit(
        () -> {
          try {
            zeroEvenOdd.zero(buffer::append);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        });
    executor.submit(
        () -> {
          try {
            zeroEvenOdd.even(buffer::append);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        });
    executor.submit(
        () -> {
          try {
            zeroEvenOdd.odd(buffer::append);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        });

    executor.shutdown();
    executor.awaitTermination(1, TimeUnit.MINUTES);

    assertThat(buffer.toString()).isEqualTo("0102030405");
  }
}
