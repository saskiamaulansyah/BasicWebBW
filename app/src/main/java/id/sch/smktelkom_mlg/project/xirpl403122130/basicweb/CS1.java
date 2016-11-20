package id.sch.smktelkom_mlg.project.xirpl403122130.basicweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CS1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs1);


        findViewById(R.id.imageView9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CS1.this, MainActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.imageView12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CS1.this, CS.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.imageView10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CS1.this, CS2.class);
                startActivity(intent);
            }
        });
    }
}
