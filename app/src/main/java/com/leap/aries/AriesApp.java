package com.leap.aries;

import android.os.StrictMode;
import android.support.multidex.MultiDexApplication;

import com.leap.mini.mgr.StorageMgr;
import com.leap.mini.mgr.TokenMgr;
import com.leap.mini.mgr.logger.CrashHandler;
import com.leap.mini.mgr.logger.LogStashDescription;
import com.leap.mini.mgr.logger.Logger;
import com.leap.mini.net.ApiClient;

/**
 * AriesApp
 * Created by ylwei on 2017/6/23.
 */

public class AriesApp extends MultiDexApplication {

  @Override
  public void onCreate() {
    super.onCreate();
    // 初始化网络组件
    ApiClient.init(this, BuildConfig.SERVER_URL);
    // 初始化更新组件
    // UpdateMgr.init(this, BuildConfig.UPDATE_URL, BuildConfig.APPLICATION_ID,
    // String.valueOf(BuildConfig.VERSION_CODE), R.mipmap.ic_launcher);
    // 初始化日志组件
    LogStashDescription description = new LogStashDescription(this, BuildConfig.SERVER_URL,
        BuildConfig.SERVER_URL, BuildConfig.SERVER_URL);
    Logger.addDestination(description);
    description.sendNow();
    CrashHandler.getInstance().init();
    // 初始化缓存组件
    StorageMgr.init(this);
    if (BuildConfig.DEBUG) {
      StrictMode.enableDefaults();
    }
    // 初始化会话组件
//    SessionMgr.init(this);
    // 初始化Token组件
    TokenMgr.init();
  }
}
