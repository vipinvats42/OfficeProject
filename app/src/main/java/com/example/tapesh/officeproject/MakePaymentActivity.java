package com.example.tapesh.officeproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by TAPESH on 5/23/2016.
 */
public class MakePaymentActivity extends AppCompatActivity{
    TextView textphonenumber,textBillNo,textBillAmount;
     String phonenumber,billNo,BillAmount;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.makepayment);



        textphonenumber=(TextView)findViewById(R.id.textView);
        textBillNo=(TextView)findViewById(R.id.textView2);
        textBillAmount=(TextView)findViewById(R.id.textView3);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        phonenumber=extras.getString("phonenumber");
        billNo=extras.getString("billno");
        BillAmount=extras.getString("billamount");


        textphonenumber.setText("Ph :"+phonenumber);
        textBillNo.setText("BillNo :"+billNo);
        textBillAmount.setText("Bill Amount :"+BillAmount);


    }


    @Override
    protected void onResume() {
        super.onResume();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
