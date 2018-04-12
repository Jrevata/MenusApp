package com.menuapp.jrevata.menusapp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.menuapp.jrevata.menusapp.Fragments.FifthFragment;
import com.menuapp.jrevata.menusapp.Fragments.FirstFragment;
import com.menuapp.jrevata.menusapp.Fragments.FourthFragment;
import com.menuapp.jrevata.menusapp.Fragments.SecondFragment;
import com.menuapp.jrevata.menusapp.Fragments.ThirdFragment;

public class DashBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);


        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        Toast.makeText(DashBoardActivity.this, "Go home section...", Toast.LENGTH_SHORT).show();
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        Fragment fragment = new FirstFragment();
                        fragmentManager.beginTransaction().replace(R.id.content, fragment).addToBackStack("tag").commit();
                        break;
                    case R.id.menu_camera:
                        Toast.makeText(DashBoardActivity.this, "Go camera section...", Toast.LENGTH_SHORT).show();
                        fragmentManager = getSupportFragmentManager();
                        fragment = new SecondFragment();
                        fragmentManager.beginTransaction().replace(R.id.content, fragment).addToBackStack("tag").commit();
                        break;
                    case R.id.menu_search:
                        Toast.makeText(DashBoardActivity.this, "Go share section...", Toast.LENGTH_SHORT).show();
                        fragmentManager = getSupportFragmentManager();
                        fragment = new ThirdFragment();
                        fragmentManager.beginTransaction().replace(R.id.content, fragment).addToBackStack("tag").commit();
                        break;
                    case R.id.menu_notification:
                        Toast.makeText(DashBoardActivity.this, "Go notification section...", Toast.LENGTH_SHORT).show();
                        fragmentManager = getSupportFragmentManager();
                        fragment = new FourthFragment();
                        fragmentManager.beginTransaction().replace(R.id.content, fragment).addToBackStack("tag").commit();
                        break;
                    case R.id.menu_more:
                        Toast.makeText(DashBoardActivity.this, "Go more sections...", Toast.LENGTH_SHORT).show();
                        fragmentManager = getSupportFragmentManager();
                        fragment = new FifthFragment();
                        fragmentManager.beginTransaction().replace(R.id.content, fragment).addToBackStack("tag").commit();
                        break;
                }
                return true;
            }
        });

    }

}
