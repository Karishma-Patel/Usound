package com.hack.music.usound;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {
    private Button recordButton;
    private Button keyboardButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        recordButton = (Button) findViewById(R.id.recordButton);
        keyboardButton = (Button) findViewById(R.id.keyboardButton);

        recordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, RecordActivity.class);
                startActivity(intent);
            }
        });

        keyboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, KeyboardActivity.class);
                startActivity(intent);
            }
        });
    }
}
