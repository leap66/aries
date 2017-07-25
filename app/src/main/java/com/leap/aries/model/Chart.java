package com.leap.aries.model;

/**
 * Itme项实体类
 * <p>
 * </> Created by ylwei on 2017/7/25.
 */

public class Chart {

  private String name;
  private String remark;
  private Class mClass;

  public Chart() {
  }

  public Chart(String name, String remark, Class mClass) {
    this.name = name;
    this.remark = remark;
    this.mClass = mClass;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public Class getmClass() {
    return mClass;
  }

  public void setmClass(Class mClass) {
    this.mClass = mClass;
  }
}
