package com.example.asynctasktext.menus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.m1:
            {
                //Toast.makeText(this,"selected"+item.getTitle().toString(),Toast.LENGTH_SHORT).show();
                Intent i=new Intent(this,Second.class);
                startActivity(i);
                break;
            }

            case R.id.m2:
            {
                //Toast.makeText(this,"selected"+item.getTitle().toString(),Toast.LENGTH_SHORT).show();
                Intent i=new Intent(this,Third.class);
                startActivity(i);
               break;
            }
            case R.id.m3:
            {
               // Toast.makeText(this,"selected"+item.getTitle().toString(),Toast.LENGTH_SHORT).show();
                Intent i=new Intent(this,Fourth.class);
                startActivity(i);
                break;
            }
        }
        return true;
    }
}
