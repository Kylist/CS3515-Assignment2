package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name , email, password, confirmpassword;

    EditText nameInput;
    EditText emailInput;
    EditText passwordInput;
    EditText CFpasswordInput;

    android.widget.Button SaveButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = (EditText) findViewById(R.id.Name);
        emailInput = (EditText) findViewById(R.id.Email);
        passwordInput = (EditText) findViewById(R.id.Password);
        CFpasswordInput = (EditText) findViewById(R.id.PasswordConfirm);

        SaveButton = (android.widget.Button) findViewById(R.id.SaveButton);
        SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                password = passwordInput.getText().toString();
                confirmpassword = CFpasswordInput.getText().toString();
                check();


            }

        });

    }
    private void check(){
        if (confirmpassword.equals(password) ) {
            if (android.text.TextUtils.isEmpty(name) || android.text.TextUtils.isEmpty(email) || android.text.TextUtils.isEmpty(password) || android.text.TextUtils.isEmpty(confirmpassword)){
                showToast("Please Fill In All The Information " );
            }
         else {
            showToast("Welcome, " + name + ", to the SignUpForm App");

        }} else {showToast("Confirm Password isn't correct, please try again " );}
    }
    private void showToast (String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();
    }

}

