package pl.zabrze.zs10.kartkowka4ps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button buttonDalej;
    Button buttonWstecz;
    Button buttonPobierz1;
    Button buttonPobierz2;
    ImageView imageView1;
    ImageView imageView2;
    TextView textView1;
    TextView textView2;
    int aktualny =0 ;
    ArrayList<Obraz> obrazki = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonDalej = findViewById(R.id.button4);
        buttonWstecz = findViewById(R.id.button);
        buttonPobierz1 = findViewById(R.id.button2);
        buttonPobierz2 = findViewById(R.id.button3);
        imageView1 = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        obrazki.add(new Obraz(R.drawable.las1));
        obrazki.add(new Obraz(R.drawable.las2));
        obrazki.add(new Obraz(R.drawable.las3));
        wyswietl1(aktualny);
        wyswietl2(aktualny+1);
        buttonDalej.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aktualny++;
                if(aktualny+1==obrazki.size()){
                    aktualny = 0;
                }
                wyswietl1(aktualny);
                wyswietl2(aktualny+1);
            }
        });
        buttonPobierz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               dodajPobranie(aktualny);
            }
        });
        buttonPobierz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dodajPobranie(aktualny+1);
            }
        });

    }
    private void dodajPobranie(int aktualny){
        obrazki.get(aktualny).setPobrania();
        textView1.setText(String.valueOf(obrazki.get(aktualny).getPobrania()));
        //String.valueOf(int nhbhjhj)
        //Integer.toString(int mhgjkdfgb)
    }
    private void  wyswietl1(int aktualny){
        imageView1.setImageResource(obrazki.get(aktualny).getIdObrazka());
        textView1.setText(String.valueOf(obrazki.get(aktualny).getPobrania()));
    }
    private void  wyswietl2(int aktualny){
        imageView2.setImageResource(obrazki.get(aktualny).getIdObrazka());
        textView2.setText(String.valueOf(obrazki.get(aktualny).getPobrania()));
    }
}