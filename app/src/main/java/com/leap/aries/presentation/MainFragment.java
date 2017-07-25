package com.leap.aries.presentation;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leap.aries.R;
import com.leap.aries.databinding.ActivityMain2Binding;
import com.leap.mini.base.BaseFragment;

/**
 * Created by ylwei on 2017/7/9.
 */

public class MainFragment extends BaseFragment {

  private ActivityMain2Binding binding;

  @Override
  protected View initComponent(LayoutInflater inflater, ViewGroup container) {
    binding = DataBindingUtil.inflate(inflater, R.layout.activity_main2, container, false);
    return binding.getRoot();
  }

  @Override
  protected void loadData(Bundle savedInstanceState) {

  }

  @Override
  public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    Log.d("MainFragment", isVisibleToUser + "");
  }
}
