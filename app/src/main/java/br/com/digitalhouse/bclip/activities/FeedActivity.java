package br.com.digitalhouse.bclip.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import br.com.digitalhouse.bclip.R;
import br.com.digitalhouse.bclip.adapter.FeedAdapter;
import retrofit2.Retrofit;

public class FeedActivity extends AppCompatActivity {

    private Retrofit retrofit;

    private Button relevanciaButton;
    private Button recentesButton;

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        relevanciaButton = findViewById(R.id.relevancia_button);
        recentesButton = findViewById(R.id.recentes_button);

        recyclerView =findViewById(R.id.recycler_view);
        // configurando adapter

        FeedAdapter feedAdapter = new FeedAdapter();
        // configurando recyclerview

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(  feedAdapter  );

        retrofit = new Retrofit.Builder()
                .baseUrl("https://newsapi.org/v2/everything?domains=wsj.com&apiKey=ac329ede06bc4196bb9e52a18fd939c5")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


    }
}
