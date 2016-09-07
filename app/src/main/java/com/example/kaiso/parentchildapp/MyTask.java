package com.example.kaiso.parentchildapp;

import android.os.AsyncTask;

/**
 * Created by kaiso on 9/7/2016.
 */
public class MyTask extends AsyncTask<RequestPackage, String, String> {
    @Override
    protected String doInBackground(RequestPackage... params) {
        String content = HttpManager.getData(params[0]);
        System.out.println(content);
        return content;
    }

    protected void onPostExecute(String result) {

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
