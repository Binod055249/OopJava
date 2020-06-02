package com.binodroxx.oopjava;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private Button throwJab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        throwJab =findViewById(R.id.throwJab);
//        Boxer myBoxer =new Boxer();

//        Log.i("myTag",myBoxer.toString());
//
//        KickBoxer kick=new KickBoxer();
//        Log.i("myTag",kick.toString());
//
//        kick.punchPower=200;
//        Log.i("myTag","punchPower: "+kick.punchPower+"  punchSpeed: "+kick.punchSpeed);

//        myBoxer.setNumberOfGloves(00);
//        Toast.makeText(this, "number of gloves: "+myBoxer.getNumberOfGloves(), Toast.LENGTH_SHORT).show();
//
//      Boxer.setStamina(38);
//        Toast.makeText(this, ""+Boxer.getStamina(), Toast.LENGTH_SHORT).show();
//        Log.i("myTag",Boxer.getStamina()+"" );

//    Boxer.setStamina(48);
//        Toast.makeText(this, ""+Boxer.getStamina(), Toast.LENGTH_SHORT).show();
//        Log.i("myTag",Boxer.getStamina()+"" );
//
    Log.i("myTag",Boxer.getStamina()+"" );

        Log.i("myTag",Boxer.getStamina()+"" );

        final Boxer boxer =new Boxer();
        throwJab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, boxer.throwJab(), Toast.LENGTH_SHORT).show();
            }
        });
    }


//    public void  ThrowJabIsClicked(View buttonView)
//    {
//        Toast.makeText(MainActivity.this, "Btton is clicked", Toast.LENGTH_SHORT).show();
//
//    }

}
