package com.panibrat.binary_search._278;

public class VersionControl {

  private final int bad;

  public VersionControl(int bad) {
    this.bad = bad;
  }

  boolean isBadVersion(int version) {
    return bad == version;
  }
}
