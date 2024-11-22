package com.example.portofolio.activitas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portofolio.Adapter.TrendsAdaptor;
import com.example.portofolio.Domain.TrendsDomain;
import com.example.portofolio.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterTrends;
private RecyclerView recyclerViewTrends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        profileInit();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.profileBtn), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void profileInit() {
        LinearLayout profileBtn=findViewById(R.id.profileBtn);
        profileBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,ProfileActivity.class)));
    }

    private void initRecyclerView() {
        ArrayList<TrendsDomain> items=new ArrayList<>();
        items.add(new TrendsDomain("Future in Ai,What will Tomorrow be like","The National","trends"));
        items.add(new TrendsDomain("Important Point in concluding work contract","Galaxy","trends2"));
        items.add(new TrendsDomain("Future in Ai,What will Tomorrow be like","The National","trends"));

        recyclerViewTrends=findViewById(R.id.view1);
        recyclerViewTrends.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterTrends=new TrendsAdaptor(items);
        recyclerViewTrends.setAdapter(adapterTrends);
    }
}