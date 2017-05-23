package android.myapplicationdev.com.webeventv20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class Signup extends AppCompatActivity {
    EditText et_name,et_username,et_password,et_email;
    Button btn_signUp,btn_to_login;
    ToggleButton toggle_member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        et_name = (EditText) findViewById(R.id.et_user_name);
        et_username = (EditText) findViewById(R.id.et_user_username);
        et_email = (EditText) findViewById(R.id.et_user_email);
        et_password = (EditText) findViewById(R.id.et_user_pass);

        btn_signUp = (Button) findViewById(R.id.btn_signup);
        btn_to_login = (Button) findViewById(R.id.btn_to_login);

        btn_to_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //JSON stuff
                finish();
            }
        });
    }
}
