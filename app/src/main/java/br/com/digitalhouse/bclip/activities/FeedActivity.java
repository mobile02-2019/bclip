package br.com.digitalhouse.bclip.activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import br.com.digitalhouse.bclip.R;

public class FeedActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private TextView feedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        feedTextView = findViewById(R.id.feed_text_view);
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if(menuItem.getItemId() == R.id.home){
                    feedTextView.setText("Home");
                } else if (menuItem.getItemId() == R.id.favoritos){
                    feedTextView.setText("Favoritos");
                } else {
                    feedTextView.setText("Busca");
                }

                return true;
            }
        });






    }
}
