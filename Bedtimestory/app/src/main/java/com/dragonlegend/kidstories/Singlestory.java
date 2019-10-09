package com.dragonlegend.kidstories;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class Singlestory extends AppCompatActivity {
    private ImageView story_pic, like_btn;
    private TextView story_author , story_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singlestory);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Book Title");

        story_author = findViewById(R.id.author_name);
        story_content = findViewById(R.id.story_content);
        story_pic = findViewById(R.id.story_pic);
        like_btn = findViewById(R.id.like_button);

    }

}
