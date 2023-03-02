
package com.example.heads_or_tails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

import java.util.Random;

public class resultActivty extends AppCompatActivity {

    private Button buttonReturn;
    private ImageView imageResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        buttonReturn = findViewById(R.id.buttonReturn);
        imageResult = findViewById(R.id.imageResult);

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);

            }
        });

        int radomNumber = new Random().nextInt(2);

        String[] options = {"heads", "tails"};
        String appOptions = options[radomNumber];

        switch (appOptions) {
            case "heads":
                imageResult.setImageResource(R.drawable.moeda_cara);
                break;
            case "tails":
                imageResult.setImageResource(R.drawable.moeda_coroa);
        }

    }
}
