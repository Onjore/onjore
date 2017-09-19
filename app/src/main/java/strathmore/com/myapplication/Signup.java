package strathmore.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button btnSign_up = (Button)findViewById(R.id.sign_up);
        EditText txtlastname = (EditText)findViewById(R.id.lastname);
        EditText txtfirstname =(EditText)findViewById(R.id.firstname);
        EditText txtemail =(EditText)findViewById(R.id.email);
        EditText phonenumber =(EditText)findViewById(R.id.phone_number);
        EditText password =(EditText)findViewById(R.id.password);


        btnSign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homepageintent = new Intent(ActivitySignup.this,Homeactivity.class);

                startActivity(homepageintent);

            }
        });

    }}
