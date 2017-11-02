package com.example.abhinavchinta.adoptionapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Abhinav Chinta on 10/28/2017.
 */

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);
        final EditText age = (EditText)findViewById(R.id.age);
        final EditText name = (EditText)findViewById(R.id.name);
        final EditText username= (EditText)findViewById(R.id.username);
        final EditText password = (EditText)findViewById(R.id.password);



        final Button Register = (Button)findViewById(R.id.Register);
        Register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final String name1 = name.getText().toString();
                final String username1 = username.getText().toString();
                final String password1 = password.getText().toString();
                final int age1 = Integer.parseInt(age.getText().toString());

                Response.Listener<String> responseListener = new Response.Listener<String>(){

                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonresponse= new JSONObject(response);
                            boolean success = jsonresponse.getBoolean("success");

                            if (success){
                                //Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                //startActivity(intent);
                                Toast.makeText(getApplicationContext(),"SUCCESS",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(RegisterActivity.this, LoginPage.class);
                                startActivity(intent);

                            }
                            else {
                                AlertDialog.Builder BUILDER = new AlertDialog.Builder(RegisterActivity.this);
                                BUILDER.setMessage("Register Failed")
                                        .setNegativeButton("Rety",null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };
                RegisterRequest registerRequest = new RegisterRequest(name1,username1,age1,password1,responseListener);
                RequestQueue queue= Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);


            }
        });


    }
}
