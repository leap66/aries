package com.leap.aries.presentation.base;

import android.os.Bundle;

import com.leap.mini.base.BaseCompatActivity;

/**
 * BaseActivity
 * <p></>
 * Created by ylwei on 2017/6/25.
 */

public abstract class BaseActivity extends BaseCompatActivity {

  @Override
  protected abstract void initComponent();

  @Override
  protected abstract void loadData(Bundle savedInstanceState);

}
