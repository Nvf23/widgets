package com.example.widgets;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeLayoutExample extends AppCompatActivity {

    private EditText entryEditText;
    private Button okButton, cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_relative_layout);

        // Inicializar los componentes
        entryEditText = findViewById(R.id.entry);
        okButton = findViewById(R.id.ok);
        cancelButton = findViewById(R.id.cancel);

        // Configurar el botón "OK"
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = entryEditText.getText().toString().trim();

                // Validar si el texto no está vacío
                if (!url.isEmpty()) {
                    // Validar si la URL comienza con "http://" o "https://"
                    if (!url.startsWith("http://") && !url.startsWith("https://")) {
                        url = "http://" + url; // Añadir "http://" si no está presente
                    }

                    // Crear un Intent para abrir la URL
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(browserIntent);
                } else {
                    // Mostrar un mensaje de error si el campo está vacío
                    Toast.makeText(RelativeLayoutExample.this, "Por favor, ingresa una URL válida.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Configurar el botón "Cancel"
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Limpiar el campo de texto
                entryEditText.setText("");
            }
        });
    }
}