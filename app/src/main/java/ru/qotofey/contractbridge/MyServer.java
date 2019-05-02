package ru.qotofey.contractbridge;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

public class MyServer implements LifecycleObserver {
    private static final String TAG = "MyServer";

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void connect() {
        Log.i(TAG, "connected");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void disconnect() {
        Log.i(TAG, "disconnected");
    }

}
