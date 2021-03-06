/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class InlineVector extends java.util.AbstractList<Inline> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected InlineVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InlineVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_InlineVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public InlineVector(Inline[] initialElements) {
    this();
    for (Inline element : initialElements) {
      add(element);
    }
  }

  public InlineVector(Iterable<Inline> initialElements) {
    this();
    for (Inline element : initialElements) {
      add(element);
    }
  }

  public Inline get(int index) {
    return doGet(index);
  }

  public Inline set(int index, Inline e) {
    return doSet(index, e);
  }

  public boolean add(Inline e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, Inline e) {
    modCount++;
    doAdd(index, e);
  }

  public Inline remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public InlineVector() {
    this(AdaptiveCardObjectModelJNI.new_InlineVector__SWIG_0(), true);
  }

  public InlineVector(InlineVector other) {
    this(AdaptiveCardObjectModelJNI.new_InlineVector__SWIG_1(InlineVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return AdaptiveCardObjectModelJNI.InlineVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    AdaptiveCardObjectModelJNI.InlineVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return AdaptiveCardObjectModelJNI.InlineVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AdaptiveCardObjectModelJNI.InlineVector_clear(swigCPtr, this);
  }

  public InlineVector(int count) {
    this(AdaptiveCardObjectModelJNI.new_InlineVector__SWIG_2(count), true);
  }

  public InlineVector(int count, Inline value) {
    this(AdaptiveCardObjectModelJNI.new_InlineVector__SWIG_3(count, Inline.getCPtr(value), value), true);
  }

  private int doSize() {
    return AdaptiveCardObjectModelJNI.InlineVector_doSize(swigCPtr, this);
  }

  private void doAdd(Inline value) {
    AdaptiveCardObjectModelJNI.InlineVector_doAdd__SWIG_0(swigCPtr, this, Inline.getCPtr(value), value);
  }

  private void doAdd(int index, Inline value) {
    AdaptiveCardObjectModelJNI.InlineVector_doAdd__SWIG_1(swigCPtr, this, index, Inline.getCPtr(value), value);
  }

  private Inline doRemove(int index) {
    long cPtr = AdaptiveCardObjectModelJNI.InlineVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Inline(cPtr, true);
  }

  private Inline doGet(int index) {
    long cPtr = AdaptiveCardObjectModelJNI.InlineVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Inline(cPtr, true);
  }

  private Inline doSet(int index, Inline value) {
    long cPtr = AdaptiveCardObjectModelJNI.InlineVector_doSet(swigCPtr, this, index, Inline.getCPtr(value), value);
    return (cPtr == 0) ? null : new Inline(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    AdaptiveCardObjectModelJNI.InlineVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
