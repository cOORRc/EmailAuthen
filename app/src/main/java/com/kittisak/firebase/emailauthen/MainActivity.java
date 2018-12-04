package com.kittisak.firebase.emailauthen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1= findViewById(R.id.buttonreg);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                openreg();
            }
        });

        button2= findViewById(R.id.buttonlogin);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                openlogin();
            }
        });

    }
    public void openreg(){
        Intent intent = new Intent(this, register.class);
        startActivities(new Intent[]{intent});
    }

    public void openlogin(){
        Intent intent = new Intent(this, login.class);
        startActivities(new Intent[]{intent});
    }


}
