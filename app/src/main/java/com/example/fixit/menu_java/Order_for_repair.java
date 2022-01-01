package com.example.fixit.menu_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fixit.R;
import com.example.fixit.menu_java.send_mail.SendMail;


public class Order_for_repair extends AppCompatActivity implements View.OnClickListener {

EditText model_name;
EditText serial_number;
EditText date;
EditText problem;
EditText name;
EditText number;
EditText email;
Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_for_repair);
        model_name = (EditText) findViewById(R.id.model_name);
        serial_number = (EditText) findViewById(R.id.serial_number);
        date = (EditText) findViewById(R.id.date);
        problem = (EditText) findViewById(R.id.problem);
        name = (EditText) findViewById(R.id.name);
        number = (EditText) findViewById(R.id.number);
        email = (EditText) findViewById(R.id.email);

        send = (Button) findViewById(R.id.send);

        //Adding click listener
        send.setOnClickListener(this);
    }


    private void sendEmail() {
        //Getting content for email

        String subject = "Заявка на ремонт";
        String mail = "service@grovers.ru"; //service@grovers.ru  groverscorp@gmail.com
        String msg = "Модель: "+ model_name.getText().toString().trim() + "\n" + "\n" +
                "Серийный номер: " + serial_number.getText().toString().trim() + "\n"+ "\n" +
                "Дата продажи: " + date.getText().toString().trim() + "\n"+ "\n" +
                "Проблема: " + problem.getText().toString().trim() + "\n"+ "\n" +
                "ФИО: " + name.getText().toString().trim() + "\n"+ "\n" +
                "Номер: " + number.getText().toString().trim() + "\n"+ "\n" +
                "Почта: " + email.getText().toString().trim();


        //Creating SendMail object
        SendMail sm = new SendMail(this, mail, subject, msg);

        //Executing sendmail to send email
        sm.execute();
    }

    @Override
    public void onClick(View v) {
        int one = model_name.getText().toString().trim().length();
        int two = number.getText().toString().trim().length();
        int three = serial_number.getText().toString().trim().length();
        int four = date.getText().toString().trim().length();
        int five = problem.getText().toString().trim().length();
        int six = name.getText().toString().trim().length();
        int seven = email.getText().toString().trim().length();
        if(one != 0 && two != 0 && three != 0 && four != 0 && five != 0 && six != 0 && seven != 0 ){
            sendEmail();
            //Toast.makeText(this, (CharSequence) number, Toast.LENGTH_LONG).show();
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