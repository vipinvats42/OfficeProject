package com.example.tapesh.officeproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editphone,editpassword;
    Button btn;
    boolean doubleBackToExitPressedOnce=false;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);



        editphone=(EditText)findViewById(R.id.editText);
        editpassword=(EditText)findViewById(R.id.editText2);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);

        btn=(Button)findViewById(R.id.button);
        progressBar.setVisibility(View.GONE);

        btn.setOnClickListener(this);




    }
    @Override
    public void onClick(View view)
    {
        progressBar.setVisibility(View.VISIBLE);
       Intent intent=new Intent(this,Second.class);
        startActivity(intent);
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

   @Override
    public   void onBackPressed()
   {
       if(doubleBackToExitPressedOnce) {
           super.onBackPressed();

           return;

       }
   this.doubleBackToExitPressedOnce=true;
       Toast.makeText(this,"Please Click BACK again to exit",Toast.LENGTH_SHORT).show();

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               doubleBackToExitPressedOnce=false;

           }
       },2000) ;






   }



}
