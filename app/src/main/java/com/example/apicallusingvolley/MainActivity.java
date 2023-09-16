package com.example.apicallusingvolley;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    adapter adapter;
    RecyclerView recyclerView;
    TextView textView;
    String pincode;
    ProgressBar process;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        pincode=getIntent().getStringExtra("pincode");
        String url="https://pincode13.p.rapidapi.com/"+pincode;
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
       recyclerView=findViewById(R.id.reciview);
       process=findViewById(R.id.process);



        RequestQueue queue=   Volley.newRequestQueue(this);
        StringRequest request= new StringRequest(Request.Method.GET,url,new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
              GsonBuilder builder=new GsonBuilder();
              Gson gson=new Gson();

              gson=builder.create();
             modle modle =  gson.fromJson(response,modle.class);

             process.setVisibility(View.GONE);

              //  Toast.makeText(MainActivity.this, modle.PostOffice.get(0).Name, Toast.LENGTH_SHORT).show();
               if(modle.PostOffice!=null) {
                    adapter = new adapter(getApplicationContext(), modle.PostOffice);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    recyclerView.setAdapter(adapter);
                }
               else{
                   Toast.makeText(MainActivity.this, "NO Recode Found", Toast.LENGTH_SHORT).show();
               }



            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
               process.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "Please Enter the valid Pincode", Toast.LENGTH_SHORT).show();

            }
        }

        ){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String,String>headers=new HashMap<>();
                headers.put("X-RapidAPI-Key", "4f27711990msh161ee48ad793e1ep1706acjsn453ffca582c1");
                headers.put("X-RapidAPI-Host" ,"pincode13.p.rapidapi.com");
                return headers;
            }
        };
        queue.add(request);

    }
}