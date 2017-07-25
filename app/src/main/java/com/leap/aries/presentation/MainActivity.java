package com.leap.aries.presentation;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.github.markzhai.recyclerview.BaseViewAdapter;
import com.github.markzhai.recyclerview.SingleTypeAdapter;
import com.leap.aries.R;
import com.leap.aries.databinding.ActivityMainBinding;
import com.leap.aries.model.Chart;
import com.leap.aries.presentation.base.BaseActivity;
import com.leap.aries.presentation.chart.ChartActivity;
import com.leap.mini.util.ToastUtil;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
  private String TAG = "MainActivity";
  private ActivityMainBinding binding;
  private Context context;
  private List<Chart> chartList;
  private SingleTypeAdapter adapter;

  @Override
  protected void initComponent() {
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    chartList = new ArrayList<>();
    context = this;
    adapter = new SingleTypeAdapter(context,R.layout.item_main);
  }

  @Override
  protected void loadData(Bundle savedInstanceState) {
    chartList.add(new Chart("折线图", "带下阴影的折线图", ChartActivity.class));
    adapter.set(chartList);
    adapter.setPresenter(new Presenter());
    binding.setAdapter(adapter);
  }

  @Override
  protected void createEventHandlers() {
    binding.button1.setOnTouchListener(new View.OnTouchListener() {
      @Override
      public boolean onTouch(View v, MotionEvent event) {
        ToastUtil.showFailure(context, getString(R.string.test_1));
        return false;
      }
    });
  }

  public class Presenter implements BaseViewAdapter.Presenter{

    public void onItem(Chart chart) {
      Log.d(TAG, chart.getmClass().toString());
      startActivity(new Intent(context, chart.getmClass()));
    }
  }
}
