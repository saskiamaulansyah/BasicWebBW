package id.sch.smktelkom_mlg.project.xirpl403122130.basicweb;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;

public class Kuis5Activity extends Activity implements View.OnClickListener {
    ImageView alert, alert2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis5);
        alert = (ImageView) findViewById(R.id.imageView);
        alert.setOnClickListener(this);
        alert2 = (ImageView) findViewById(R.id.imageView2);
        alert2.setOnClickListener(this);


        findViewById(R.id.imageView18).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kuis5Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {
        if (view == alert) {

            new AlertDialog.Builder(this)
                    .setTitle("Jawaban Anda : ")
                    .setMessage("SALAH")
                    .setNeutralButton("Tutup", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dlg, int sumthin) {

                        }
                    })
                    .show();
        } else if (view == alert2) {

            new AlertDialog.Builder(this)
                    .setTitle("Jawaban Anda : ")
                    .setMessage("BENAR")
                    .setNeutralButton("Tutup", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dlg, int sumthin) {

                        }
                    })
                    .show();
        }
    }
}
