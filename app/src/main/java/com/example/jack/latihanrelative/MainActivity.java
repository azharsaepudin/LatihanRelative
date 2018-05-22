package com.example.jack.latihanrelative;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                Intent hal1 = new Intent(MainActivity.this, Halaman1.class);
                startActivity(hal1);
                break;
            case R.id.btn2:
                Intent hal2 = new Intent(MainActivity.this, Halaman2.class);
                startActivity(hal2);
                break;
            case R.id.btn3:
                String url = "https://www.youtube.com";
                Intent youtube = new Intent(Intent.ACTION_VIEW);
                youtube.setData(Uri.parse(url));
                startActivity(youtube);
                break;
        }
    }
}
