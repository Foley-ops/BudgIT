package com.example.budgit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.ComponentActivity;

public class Login extends ComponentActivity {
    private Button login_button;
    private Button register_button;
    private EditText user_name;
    private EditText password_prompt;

    private int id = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        setButton();
    }


    public void setButton(){
        login_button = (Button) findViewById(R.id.loginButton);
        user_name = (EditText) findViewById(R.id.UserNamePrompt);
        password_prompt = (EditText) findViewById(R.id.passwordPrompt);
        register_button = (Button) findViewById(R.id.registerButton);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id < 0){
                    password_prompt.setError("Wrong Username or Password");
                    user_name.setError("Wrong Username or Password");
                }else{
                    Intent program = new Intent(Login.this, MainActivity.class);
                    program.putExtra("id", id);
                    startActivity(program);
                }
            }
        });
    }

}