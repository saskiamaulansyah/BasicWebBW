package id.sch.smktelkom_mlg.project.xirpl403122130.basicweb;


import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;

public class Kuis2Activity extends Activity implements View.OnClickListener {
    ImageView alert, alert2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis2);
        alert = (ImageView) findViewById(R.id.imageView);
        alert.setOnClickListener(this);
        alert2 = (ImageView) findViewById(R.id.imageView2);
        alert2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == alert) {

            new AlertDialog.Builder(this)
                    .setTitle("Jawaban Anda : ")
                    .setMessage("BENAR")
                    .setNeutralButton("Tutup", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dlg, int sumthin) {

                        }
                    })
                    .show();
        } else if (view == alert2) {

            new AlertDialog.Builder(this)
                    .setTitle("Jawaban Anda : ")
                    .setMessage("SALAH")
                    .setNeutralButton("Tutup", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dlg, int sumthin) {

                        }
                    })
                    .show();
        }
    }
}
