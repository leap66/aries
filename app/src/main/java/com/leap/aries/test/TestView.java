package com.leap.aries.test;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;

/**
 * Created by ylwei on 2017/7/9.
 */

public class TestView extends android.support.v7.widget.AppCompatImageView {

  private String TAG = "TextView";

  public TestView(Context context) {
    super(context, null);
  }

  public TestView(Context context, AttributeSet attrs) {
    super(context, attrs, 0);
  }

  public TestView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  // onFinishInflate --> onAttachedToWindow --> onMeasure --> onSizeChanged -->
  // onLayout --> onDraw -->
  // onDetackedFromWindow

  @Override
  protected void onFinishInflate() {
    super.onFinishInflate();
    Log.e(TAG, "onFinishInflate");
  }

  @Override
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    Log.e(TAG, "onAttachedToWindow");
  }

  @Override
  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    Log.e(TAG, "onMeasure");
  }

  @Override
  protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    super.onSizeChanged(w, h, oldw, oldh);
    Log.e(TAG, "onSizeChanged");
  }

  @Override
  protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    super.onLayout(changed, left, top, right, bottom);
    Log.e(TAG, "onLayout");
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    Log.e(TAG, "onDraw");
  }

  @Override
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    Log.e(TAG, "onDetachedFromWindow");
  }
}
