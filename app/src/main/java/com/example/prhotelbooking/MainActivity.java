package com.example.prhotelbooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RadioGroup radioGroup;
    RadioButton Customer;
    RadioButton Employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      final  Intent myIntent2=new Intent(MainActivity.this,usersignup.class);

        final EditText username = findViewById(R.id.edtemail);
        final TextView message=findViewById(R.id.tvmessage);
        final EditText password = findViewById(R.id.edtpassword);
        final Button login = findViewById(R.id.btnsignin);
        final Button signup=findViewById(R.id.btnsignup);

        radioGroup = findViewById(R.id.radiogrp);





        login.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {

                                         String value = ((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();
                                         String inputid = username.getText().toString();
                                         String inputpassword = password.getText().toString();

                                         if(value.equals("Employee"))
                                         {
                                             List<Employee> employees = EmployeeRepo.getInstance().getEmployees();
                                             for (int i = 0; i < employees.size(); i++) {
                                                 Employee emp = employees.get(i);
                                                 if (emp.username.equals(inputid) && emp.Password.equals(inputpassword)) {
                                                     Intent intent = new Intent(MainActivity.this,findperson.class);
                                                     startActivity(intent);

                                                 }
                                                 else
                                                 {
                                                     message.setText("incorrect username or password");
                                                 }

                                             }

                                         }
                                         else if(value.equals("User")) {
                                             List<Customer> customers=CustomerRepo.getInstance().getCustomers();
                                             for (int i = 0; i < customers.size(); i++)
                                             {
                                                 Customer customer = customers.get(i);

                                                 if (customer.getUsername().equals(inputid) && customer.getPassword().equals(inputpassword)) {
                                                     Intent intent = new Intent(MainActivity.this,findperson.class );
                                                     startActivity(intent);

                                                 }
                                                 else
                                                 {
                                                     message.setText("incorrect username or password");
                                                 }


                                             }
                                         }
                                         else
                                         {
                                             message.setText("incorrect username or password");
                                         }


                                     }

                                 }


        );
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(myIntent2);
            }
        });
    }
}



