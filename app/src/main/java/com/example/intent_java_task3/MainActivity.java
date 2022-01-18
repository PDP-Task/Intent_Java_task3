package com.example.intent_java_task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn_main);

        btn.setOnClickListener(v -> {
            User user = new User("Samandar", "18");
            openSecondActivity(user);
        });
    }

    private void openSecondActivity(User user) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", user);
        startActivity(intent);
    }
}