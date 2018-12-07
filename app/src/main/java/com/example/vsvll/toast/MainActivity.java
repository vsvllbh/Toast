package com.example.vsvll.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button SimpleToast;
    Button CustomToast;
    LayoutInflater layoutInflater;
    View toastLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleToast = findViewById(R.id.BSimpleToast);
        CustomToast = findViewById(R.id.BCustomToast);
        layoutInflater = getLayoutInflater();
        toastLayout = layoutInflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.CustomToast));


    }

    public void clickSimpleToast(View view) {

        Toast.makeText(this,"I am a Simple toast",Toast.LENGTH_SHORT).show();
    }

    public void clickCustomToast(View view) {

        Toast toast = Toast.makeText(this,"",Toast.LENGTH_SHORT);
        //toast.setGravity(Gravity.CENTER,10,10);
        toast.setView(toastLayout);

        toast.show();
    }
}
