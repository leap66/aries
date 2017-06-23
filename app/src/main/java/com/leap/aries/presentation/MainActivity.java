package com.leap.aries.presentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.leap.aries.R;
import com.leap.mini.util.ToastUtil;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ToastUtil.showFailure(this,"hahahaha");
  }
}
