package com.aplicacionesmoviles.licenciadeconducirberazategui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.aplicacionesmoviles.licenciadeconducirberazategui.R;

public class MainActivity extends AppCompatActivity {
    RelativeLayout rl1, rl2,rl3;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl1=(RelativeLayout)findViewById(R.id.soyuno);
        rl2=(RelativeLayout)findViewById(R.id.soydos);
        rl3=(RelativeLayout)findViewById(R.id.rl3);

    }
    public void boton(View view){
        rl2.setVisibility(View.INVISIBLE);
        rl1.setVisibility(View.VISIBLE);

    }
    public void boton2(View view){
        Uri uri = Uri.parse("http://berazategui.eregulations.org/procedure/7/7/step/224?|=es");
        intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }
    public void boton3(View view){
        rl1.setVisibility(View.INVISIBLE);
        rl2.setVisibility(View.VISIBLE);
    }
    public void boton4(View view){
        intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }

    public void boton5(View view){
        rl1.setVisibility(View.INVISIBLE);
        rl2.setVisibility(View.INVISIBLE);
        rl3.setVisibility(View.VISIBLE);
    }
    public void boton6(View view){
        intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void boton7(View view){
        rl1.setVisibility(View.INVISIBLE);
        rl2.setVisibility(View.VISIBLE);
        rl3.setVisibility(View.INVISIBLE);
    }
}
