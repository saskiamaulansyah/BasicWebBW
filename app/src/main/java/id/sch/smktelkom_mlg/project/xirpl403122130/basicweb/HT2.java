package id.sch.smktelkom_mlg.project.xirpl403122130.basicweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HT2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ht2);

        findViewById(R.id.imageViewHome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HT2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.imageView13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HT2.this, HT3.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.imageView14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HT2.this, HT.class);
                startActivity(intent);
            }
        });
    }
}
