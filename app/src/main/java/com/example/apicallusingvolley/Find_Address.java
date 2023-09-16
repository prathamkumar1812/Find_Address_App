package com.example.apicallusingvolley;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Find_Address extends AppCompatActivity {
EditText editText;
Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_address);
        editText=findViewById(R.id.editPincode);
        button=findViewById(R.id.find);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkPincode()) {
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    i.putExtra("pincode", editText.getText().toString().trim());
                    startActivity(i);
                }
            }

        }  );

    }
    boolean checkPincode(){
        if(editText.getText().toString().trim().isEmpty()||editText.getText().toString().length()!=6){
            Toast.makeText(this, "Enter valid Pincode", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}