package com.jiajia.alldemo.mvp.view;

/**
 * Created by jiajia on 2017/2/8.
 */

public interface IView {

     /**
      * 设置进度条的显示
      *
      * */
    void showProgress( boolean isShow);

    // 显示条进度显示
    void showProgressValue(int progress);

    // 显示具体的内容
    void showView(String result);

    // 显示错误信息
    void showFailMess(String result);
}
