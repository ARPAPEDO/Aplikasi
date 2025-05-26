package com.example.implisitintentarpa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.implisitintentarpa.R;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton btnBrowser = findViewById(R.id.btn_browser);
        MaterialButton btnCall = findViewById(R.id.btn_call);
        MaterialButton btnEmail = findViewById(R.id.btn_email);

        btnBrowser.setOnClickListener(view -> openBrowser());
        btnCall.setOnClickListener(view -> openDialer());
        btnEmail.setOnClickListener(view -> sendEmail());
    }

    private void openBrowser() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://id.pinterest.com/"));
        startActivity(intent);
    }

    private void openDialer() {
        String phoneNumber = "+629685027086";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://wa.me/" + phoneNumber));
        startActivity(intent);
    }


    private void sendEmail() {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("arfabian796@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Judul Email");
        intent.putExtra(Intent.EXTRA_TEXT, "Halo, ini adalah email yang dikirim dari aplikasi.");
        startActivity(intent);
    }
}
