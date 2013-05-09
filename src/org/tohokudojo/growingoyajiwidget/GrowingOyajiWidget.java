package org.tohokudojo.growingoyajiwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class GrowingOyajiWidget extends AppWidgetProvider {
	private final String TAG = this.getClass().getSimpleName();
	@Override
	public void onEnabled(Context context) {
		Log.d(TAG, this.getClass().getName());
		super.onEnabled(context);
	}
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
		Log.d(TAG, this.getClass().getName());
		super.onUpdate(context, appWidgetManager, appWidgetIds);
	}
	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		Log.d(TAG, this.getClass().getName());
		super.onDeleted(context, appWidgetIds);
	}
	@Override
	public void onDisabled(Context context) {
		Log.d(TAG, this.getClass().getName());
		super.onDisabled(context);
	}
	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d(TAG, this.getClass().getName());
		super.onReceive(context, intent);
	}
}