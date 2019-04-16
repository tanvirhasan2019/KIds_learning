package com.kidslearning.tansh.kids_learning;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Youtube_link extends AppCompatActivity implements View.OnClickListener {

    private ImageView larva, oggy, rhyme, story;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_link);

        larva=(ImageView) findViewById(R.id.LarvaID);
        oggy=(ImageView) findViewById(R.id.OggyID);
        rhyme=(ImageView) findViewById(R.id.RhymeID);
        story=(ImageView) findViewById(R.id.StoryID);

        larva.setOnClickListener(this);
        oggy.setOnClickListener(this);
        rhyme.setOnClickListener(this);
        story.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==larva.getId())
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.youtube.com/watch?v=q9CnaMLVBHA"));
            startActivity(intent);

        }
        if(v.getId()==oggy.getId())
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.youtube.com/watch?v=EHjTiEDN6P4"));
            startActivity(intent);

        }
        if(v.getId()==rhyme.getId())
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.youtube.com/watch?v=i7ygKQunfmE"));
            startActivity(intent);

        }
        if(v.getId()==story.getId())
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.youtube.com/watch?v=4LV3tdG-aGk"));
            startActivity(intent);

        }

    }
}
