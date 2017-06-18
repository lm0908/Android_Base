package com.example.android_base.util.content;

import android.content.Context;
import android.net.Uri;

import com.example.android_base.util.java.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;


public class ContentUtils {
	/**
	 * 读取数据 
	 * @param context
	 * @param uri
	 * @return
	 */
	public static byte[] readData(Context context, Uri uri){
        InputStream inputStream = null;
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            if(inputStream == null) return null;
            return IOUtils.read(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
