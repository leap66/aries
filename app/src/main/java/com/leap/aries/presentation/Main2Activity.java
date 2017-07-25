package com.leap.aries.presentation;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.leap.aries.R;
import com.leap.aries.databinding.ActivityMain2Binding;
import com.leap.aries.presentation.base.BaseActivity;
import com.leap.mini.util.ToastUtil;

import org.greenrobot.eventbus.EventBus;

public class Main2Activity extends BaseActivity {
  private String TAG = "Main2Activity";
  private ActivityMain2Binding binding;
  private Context context;

  @Override
  protected void initComponent() {
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
    context = this;
  }

  @Override
  protected void loadData(Bundle savedInstanceState) {
    EventBus.getDefault().post("");
  }

  @Override
  protected void createEventHandlers() {
    binding.button1.setOnTouchListener(new View.OnTouchListener() {
      @Override
      public boolean onTouch(View v, MotionEvent event) {
        Log.e("OnTouchListener", event.getAction() + "");
        ToastUtil.showFailure(context, getString(R.string.test_1));
        return false;
      }
    });
    binding.testView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(Main2Activity.this, MainActivity.class));
      }
    });
  }

  // onCreate, onStart, onResume, onPause, onStop, onDestroy

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState,
      @Nullable PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    Log.i(TAG, "onCreate");
  }

  @Override
  protected void onStart() {
    super.onStart();
    Log.i(TAG, "onStart");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.i(TAG, "onResume");
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.i(TAG, "onPause");
  }

  @Override
  protected void onStop() {
    super.onStop();
    Log.i(TAG, "onStop");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Log.i(TAG, "onDestroy");
  }
}
