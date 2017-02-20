package com.jiajia.alldemo;

import android.app.Activity;
import android.content.Context;

import java.util.Stack;

/**
 * 应用程序Activity管理类
 * 用于Activity的管理及应用程序的退出
 * Created by jiajia on 2017/2/15.
 */

public class ActManager {
    private static Stack<Activity> actStack;
    private static ActManager instance;
    private ActManager() {
    }


    public static ActManager getManager() {
        if (instance == null) {
            instance = new ActManager();
        }
        return instance;
    }

    /**
     * 获取当前Activity
     */
    public static Activity getCurrActivity() {
        if (actStack.lastElement() != null) {
            Activity activity = actStack.lastElement();
            return activity;
        }
        return null;
    }


    /**
     * 添加Activity到堆栈
     */
    public static void addActivity(Activity activity) {
        if (actStack == null) {
            actStack = new Stack<Activity>();
        }
        actStack.add(activity);

    }

    /**
     * 结束指定的Activity
     */
    public static void finishActivty(Activity activity) {
        if (activity != null) {
            actStack.remove(activity);
            activity.finish();
            activity = null;
        }
    }

    /**
     * 结束指定类名的Activity
     */

    public static void finishActivity(Class<?> clas) {
        for (Activity act : actStack) {
            if (act != null && !act.isFinishing()) {
                if (act.getClass().equals(clas)) {
                    finishActivty(act);
                }
            }
        }
    }

    /**
     * 结束所有的Activity
     */
    public static void finishAllActivity() {
        for (Activity act : actStack) {
            if (act != null && !act.isFinishing())
                act.finish();
        }
        actStack.clear();
    }

    /**
     * 退出应用程序，结束所有Activity
     * */
    public static void AppExit(Context context){
        //TODO 退出应用程序
    }
}
