package com.example.kaiso.parentchildapp;

import org.json.JSONArray;
import org.json.JSONObject;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.Firebase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

import static android.R.layout.simple_list_item_1;

public class ParentActivity4 extends AppCompatActivity {
    public String json_urld = "https://api.twilio.com/2010-04-01/Accounts/AC75c5a30cbe87711998feac74b96cadf0/Messages.json";

    JSONObject jsonObject = new JSONObject();
    List<String> items;
    String name = "robert";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

    }

    private void postData2(String url) {

        RequestPackage p = new RequestPackage();

        p.setMethod("GET");
        EditText hello = (EditText) findViewById(R.id.editText);

     //   p.setUri("https://api.twilio.com/2010-04-01/Accounts/AC75c5a30cbe87711998feac74b96cadf0/Messages.json");
        p.setUri(url);
        p.setParam("to", "+12019520582");
        p.setParam("from", "+12019577775");
        p.setParam("body", "hello");


        MyTask task = new MyTask();
        task.execute(p);
        //return task.execute(p);
    }


    public void ledOne(){

        postData2("http://192.168.240.1/arduino/digital/13/0");
    }
    public void ledTwo(){

        postData2("http://192.168.240.1/arduino/digital/12/0");

    }
    public void ledThree(){

        postData2("http://192.168.240.1/arduino/digital/11/0");

    }
    public void ledFour(){

        postData2("http://192.168.240.1/arduino/digital/10/0");

    }
    public void ledFive(){
        postData2("http://192.168.240.1/arduino/digital/9/0");


    }
    public void ledSix(){


        postData2("http://192.168.240.1/arduino/digital/8/0");
    }


}
