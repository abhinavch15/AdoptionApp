package com.example.abhinavchinta.adoptionapp;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Abhinav Chinta on 10/11/2017.
 */

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL="http://192.168.43.165/register.php";
    private Map<String, String>params;



    public RegisterRequest(String name, String username, int age, String password, Response.Listener<String> listener){
        super(Method.POST,REGISTER_REQUEST_URL,listener,null);
      
        params = new HashMap<>();
        params.put("name",name);
        params.put("username", username);
        params.put("password",password);
        params.put("age",age+"");


    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
