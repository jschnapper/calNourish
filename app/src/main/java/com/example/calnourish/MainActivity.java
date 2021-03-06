package com.example.calnourish;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.info:
                        Intent infoIntent = new Intent(MainActivity.this, InfoActivity.class);
                        startActivity(infoIntent);
                        break;
                    case R.id.category:
                        Intent categoryIntent = new Intent(MainActivity.this, InfoActivity.class);
                        startActivity(categoryIntent);
                        break;
                    case R.id.search:
                        Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                        startActivity(searchIntent);
                        break;
                    case R.id.foodrecovery:
                        Intent foodrecoveryIntent = new Intent(MainActivity.this, InfoActivity.class);
                        startActivity(foodrecoveryIntent);
                        break;
                    case R.id.menu:
                        Intent menuIntent = new Intent(MainActivity.this, InfoActivity.class);
                        startActivity(menuIntent);
                        break;
                }


                return false;
            }
        });
    }
}
