package com.z0ltan.designpatterns.behavioural.iterator;

import java.util.NoSuchElementException;

public class Range implements MyIterable<Integer> {
  private int start;
  private int end;

  public Range(final int start, final int end) {
    this.start = start;
    this.end = end;
  }

  public int getStart() {
    return this.start;
  }

  public int getEnd() {
    return this.end;
  }

  @Override
  public MyIterator<Integer> iterator() {
    return new RangeIterator(this);
  }
}

class RangeIterator implements MyIterator<Integer> {
  private Range range;
  private int curr;

  public RangeIterator(final Range range) {
    this.range = range;
    this.curr = range.getStart();
  }

  @Override
  public boolean hasNext() {
    return curr < range.getEnd();
  }

  @Override
  public Integer next() {
    if (!hasNext()) throw new NoSuchElementException("range has been exhausted!");
    int val = this.curr;
    this.curr++;

    return val;
  }
}
