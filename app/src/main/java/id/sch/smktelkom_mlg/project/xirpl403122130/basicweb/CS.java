package id.sch.smktelkom_mlg.project.xirpl403122130.basicweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs);

        findViewById(R.id.imageView9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CS.this, MainActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.imageViewke).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CS.this, CS1.class);
                startActivity(intent);
            }
        });

    }


}
