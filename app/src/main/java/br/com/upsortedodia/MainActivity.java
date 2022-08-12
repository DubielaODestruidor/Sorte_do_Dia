package br.com.upsortedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.AbstractList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private Button buttonAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTitle = findViewById(R.id.text_title);
        buttonAction = findViewById(R.id.button_action);

        AbstractList<String> messages = null;
        messages.add("Você vai ser menos feio");
        messages.add("Você vai ser menos burro");

        View.OnClickListener listener = new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                int position = new Random().nextInt(messages.size());
                String message = messages.get(position);
                textViewTitle.setText(message);
            }

        };

        buttonAction.setOnClickListener(listener);
    }
}