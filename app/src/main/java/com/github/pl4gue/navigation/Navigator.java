package com.github.pl4gue.navigation;

import android.content.Context;
import android.content.Intent;

import com.github.pl4gue.mvp.view.activity.AddHomeworkActivity;
import com.github.pl4gue.mvp.view.activity.GetHomeworkActivity;

/**
 * @author David Wu (david10608@gmail.com)
 *         Created on 14.10.17.
 */

public class Navigator {

    public void navigateToShowHomeworkPage(Context context) {
        if (context != null) {
            Intent intentToLaunch = GetHomeworkActivity.getCallingIntent(context);
            context.startActivity(intentToLaunch);
        }
    }

    public void navigateToAddHomeworkPage(Context context) {
        if (context != null) {
            Intent intentToLaunch = AddHomeworkActivity.getCallingIntent(context);
            context.startActivity(intentToLaunch);
        }
    }
}
