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

public class LoginPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText username= (EditText)findViewById(R.id.lusername);
        final EditText password = (EditText)findViewById(R.id.lpassword);
        final Button login = (Button)findViewById(R.id.loginbutton);
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final String username1 = username.getText().toString();
                final String password1 = password.getText().toString();

                Response.Listener<String> responseListener= new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonresponse = new JSONObject(response);
                            boolean success= jsonresponse.getBoolean("success");
                            if (success){
                                //String name = jsonresponse.getString("name");
                                int age = jsonresponse.getInt("age");
                                //String username = jsonresponse.getString("username");
                                int balance = jsonresponse.getInt("balance");
                                String name = jsonresponse.getString("name");
                                Toast.makeText(getApplicationContext(),"SUCCESS",Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(LoginPage.this, UserAreaActivity.class);
                                intent.putExtra("name",name);
                                intent.putExtra("username",username1);

                                startActivity(intent);


                            }else {


                                AlertDialog.Builder BUILDER = new AlertDialog.Builder(LoginPage.this);
                                BUILDER.setMessage("Wrong credentials, please try again.");
                                BUILDER.setPositiveButton("OK",null);
                                username.setText("");password.setText("");

                                AlertDialog alertDialog = BUILDER.create();
                                alertDialog.show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };

                LoginRequest loginRequest = new LoginRequest(username1,password1,responseListener);
                RequestQueue queue= Volley.newRequestQueue(LoginPage.this);
                queue.add(loginRequest);
            }
        });


    }
}
