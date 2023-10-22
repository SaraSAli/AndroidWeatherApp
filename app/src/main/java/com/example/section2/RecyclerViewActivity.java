package com.example.section2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.section2.adapter.PostAdapter;
import com.example.section2.model.Post;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        Post[] myListData = new Post[] {
                new Post("Email", "Here is the Email", android.R.drawable.ic_dialog_email),
                new Post("Info", "Here is the Info", android.R.drawable.ic_dialog_info),
                new Post("Delete", "Here is the Delete", android.R.drawable.ic_delete),
                new Post("Dialer", "Here is the Dialer", android.R.drawable.ic_dialog_dialer),
                new Post("Alert", "Here is the Alert", android.R.drawable.ic_dialog_alert),
                new Post("Map", "Here is the Map", android.R.drawable.ic_dialog_map),
                new Post("Email", "Here is the Email", android.R.drawable.ic_dialog_email),
                new Post("Info", "Here is the Info", android.R.drawable.ic_dialog_info),
                new Post("Delete", "Here is the Delete", android.R.drawable.ic_delete),
                new Post("Dialer", "Here is the Dialer", android.R.drawable.ic_dialog_dialer),
                new Post("Alert", "Here is the Alert", android.R.drawable.ic_dialog_alert),
                new Post("Map", "Here is the Map", android.R.drawable.ic_dialog_map),
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        PostAdapter adapter = new PostAdapter(myListData);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}