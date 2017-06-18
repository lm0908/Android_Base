package com.example.android_base.util.app;

import android.os.Bundle;

public interface ArgumentsFactory<T>{
    public Bundle onCreateArguments(T item);
}