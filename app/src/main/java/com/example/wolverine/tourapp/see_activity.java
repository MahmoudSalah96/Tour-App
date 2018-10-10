package com.example.wolverine.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class see_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_activity);
        Bundle b = getIntent().getExtras();

        ImageView imageView = (ImageView) findViewById(R.id.Imagedes);
        imageView.setImageResource(b.getInt("ImageId"));

        TextView textname = (TextView) findViewById(R.id.ImageName);
        textname.setText(b.getString("monumentname"));

        TextView textdes = (TextView) findViewById(R.id.descripe);
        textdes.setText(b.getString("description"));

        TextView buildertxt = (TextView) findViewById(R.id.builder);
        buildertxt.setText(b.getString("BuilderName"));
    }
}
