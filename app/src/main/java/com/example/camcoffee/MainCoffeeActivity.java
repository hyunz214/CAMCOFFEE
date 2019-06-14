package com.example.camcoffee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainCoffeeActivity extends AppCompatActivity {


    private DrawerLayout drawerLayout;
    private View drawerView;
//    TextView espreso, tea, smoothie, dessert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_coffee);


        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawerView = (View)findViewById(R.id.sidearea);
//        espreso = (TextView)findViewById(R.id.espreso);
//        tea = (TextView)findViewById(R.id.tea);
//        smoothie = (TextView)findViewById(R.id.smoothie);
//        dessert = (TextView)findViewById(R.id.dessert);

        ImageView coffee = (ImageView)findViewById(R.id.btn_espresso);
        ImageView tea = (ImageView)findViewById(R.id.btn_tea);
        ImageView ade = (ImageView)findViewById(R.id.btn_ade);
        ImageView dessert = (ImageView)findViewById(R.id.btn_dessert);


        ImageView btn_open = (ImageView)findViewById(R.id.side_open);
        ImageView btn_close = (ImageView)findViewById(R.id.side_close);



        coffee.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainCoffeeSubActivity.class);
                startActivity(intent);
            }
        });
        tea.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainCoffeeSubActivity.class);
                startActivity(intent);
            }
        });


        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);
            }
        });

        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawers();
            }
        });

        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

//        espreso.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                Frag_Espresso frag_espresso = new Frag_Espresso();
//                transaction.replace(R.id.frame, frag_espresso);
//                transaction.commit();
//
//            }
//        });
//
//        tea.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                Frag_Tea frag_tea = new Frag_Tea();
//                transaction.replace(R.id.frame, frag_tea);
//                transaction.commit();
//            }
//        });
//
//        smoothie.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                Frag_Smoothie frag_smoothie = new Frag_Smoothie();
//                transaction.replace(R.id.frame, frag_smoothie);
//                transaction.commit();
//            }
//        });
//
//        dessert.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                Frag_Dessert frag_dessert = new Frag_Dessert();
//                transaction.replace(R.id.frame, frag_dessert);
//                transaction.commit();
//            }
//        });



    }
}
