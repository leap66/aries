package com.leap.aries.presentation;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.leap.aries.R;
import com.leap.aries.databinding.ActivityMainBinding;
import com.leap.aries.presentation.base.BaseActivity;
import com.leap.mini.util.ToastUtil;

import org.greenrobot.eventbus.EventBus;

public class MainActivity extends BaseActivity {
  private ActivityMainBinding binding;
  private Context context;

  @Override
  protected void initComponent() {
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
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
  }
}
