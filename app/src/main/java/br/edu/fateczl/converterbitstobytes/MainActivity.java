package br.edu.fateczl.converterbitstobytes;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
     *@author: RODRIGO VINICIUS FERRAZ DA SILVA
     *@RA: 1110482313043
     */


    private EditText editTextBits;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextBits = findViewById(R.id.editTextBits);
        textViewResultado = findViewById(R.id.textViewResultado);
        Button buttonConverter = findViewById(R.id.buttonConverter);

        buttonConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                converterBits();
            }
        });
    }

    private void converterBits() {
        String input = editTextBits.getText().toString();
        if (!input.isEmpty()) {
            long bits = Long.parseLong(input);
            String resultado = "Bytes: " + (bits / 8) + "\n" +
                    "KB: " + (bits / 8192) + "\n" +
                    "MB: " + (bits / 8388608) + "\n" +
                    "GB: " + (bits / 8796093022208L) + "\n" +
                    "TB: " + (bits / 1125899906842624L);
            textViewResultado.setText(resultado);
        } else {
            textViewResultado.setText("Por favor, insira um valor.");
        }
    }
}
