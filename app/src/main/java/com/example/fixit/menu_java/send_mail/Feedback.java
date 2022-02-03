package com.example.fixit.menu_java.send_mail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.fixit.R;
import com.example.fixit.menu_java.Other;

import java.io.File;

public class Feedback extends AppCompatActivity implements View.OnClickListener {
    EditText name_feedback;
    EditText email_feedback;
    EditText text_feedback;
    EditText number_feedback;
    Button send_feedback;
    private File chosenImageUri = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        name_feedback = (EditText) findViewById(R.id.name_feedback);
        email_feedback = (EditText) findViewById(R.id.email_feedback);
        text_feedback = (EditText) findViewById(R.id.text_feedback);
        send_feedback = (Button) findViewById(R.id.send_feedback);
        number_feedback = (EditText) findViewById(R.id.number_feedback);

        //Adding click listener
        send_feedback.setOnClickListener(this);
    }
    private void sendEmail() {
        //Getting content for email

        String subject = "Обратная связь";
        String mail = "groverscorp@gmail.com";
        String msg = "Имя : "+ name_feedback.getText().toString().trim() + "\n" + "\n" +
                "Почта: " + email_feedback.getText().toString().trim() + "\n"+ "\n" +
                "Номер: " + number_feedback.getText().toString().trim() + "\n"+ "\n" +
                "Предложения или замечания: " + text_feedback.getText().toString().trim() + "\n"+ "\n"
                ;


        //Creating SendMail object

        SendMail sm = new SendMail(this, mail, subject, msg,chosenImageUri);

        //Executing sendmail to send email
        sm.execute();
    }

    @Override
    public void onClick(View v) {
        int one = name_feedback.getText().toString().trim().length();
        int two = email_feedback.getText().toString().trim().length();
        int three = text_feedback.getText().toString().trim().length();
        if(one != 0 & two != 0 & three != 0){
            sendEmail();
        }
        else {
            Toast.makeText(this, "Нужно заполнить все поля", Toast.LENGTH_LONG).show();
        }
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), Other.class);
        startActivity(intent);
    }
}