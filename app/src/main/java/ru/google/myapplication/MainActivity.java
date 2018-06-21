package ru.google.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Короткая запись.
        //Toast.makeText(this, "onCreate();", Toast.LENGTH_SHORT).show();

        // Длинная запись.
        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        ImageView image = new ImageView(this);
        image.setImageResource(android.R.drawable.ic_dialog_alert);
        toast.setView(image);
        toast.show();

        Log.i(TAG, "onCreate();");
    }
    // После onCreate() вызывается onStart();

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart();");
        Toast.makeText(this, "onStart();", Toast.LENGTH_SHORT).show();
    }
    // После onStart() вызывается onResume();

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume();");
        Toast.makeText(this, "onResume();", Toast.LENGTH_SHORT).show();
    }
    // После onResume() вызывается onPause();

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause();");
        Toast.makeText(this, "onPause();", Toast.LENGTH_SHORT).show();
    }


    // После onPause() вызывается
    // либо onResume(), либо onStop();

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop();");
        Toast.makeText(this, "onStop();", Toast.LENGTH_SHORT).show();
    }
    // После onStop() вызывается
    // либо onRestart(), либо onDestroy();

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart();");
        Toast.makeText(this, "onRestart();", Toast.LENGTH_SHORT).show();
    }
    // После onRestart() вызывается onStart();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy();");
        Toast.makeText(this, "onDestroy();", Toast.LENGTH_SHORT).show();
    }
    // После onDestroy() ничего не вызывается.

    // Основные методы с которыми вы будете работать:
    // onCreate(); onPause(); onResume();

    // Открыли приложение:
    // onCreate() -> onStart() -> onResume();

    // Нажали Home
    // onPause() -> onStop();

    // На рабочем столе снова вызываете приложение.
    // onRestart() -> onStart() -> onResume();

    // Из приложения нажали кнопку Back.
    // onPause() -> onStop() -> onDestroy();

    // Запускаем приложение снова:
    // onCreate() -> onStart() -> onResume();

    // onCreate();
    // onRestart();
    // onStart();
    // onResume();
    // onPause();
    // onStop();
    // onDestroy();
}
