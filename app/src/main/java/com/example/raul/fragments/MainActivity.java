package com.example.raul.fragments;


import android.app.FragmentManager;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements BlankFragment.OnPressButtonListener, DinamicFragment.OnItemSelected{

    private TextView tvChange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvChange = findViewById(R.id.tv_wacambiar);


        /*getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new BlankFragment())
                .disallowAddToBackStack().commit();*/

        /*Fragment fragment = new BlankFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.layout_principal, fragment);
        transaction.commit();*/

        /*
        Fragment blankFragment = (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.frame_layout);
        blankFragment = BlankFragment.newInstate();
        android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.layout_principal, blankFragment);
        transaction.commit();
        */

        //FragmentManager fragmentManager = getSupportFragmentManager();


        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlankFragment fragment = new BlankFragment();
        fragmentTransaction.add(R.id.layout_principal, fragment);


        //Fragment dinamico
        FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
        DinamicFragment dinamicFragment = new DinamicFragment();
        fragmentTransaction2.add(R.id.frame_layout_container, dinamicFragment);
        fragmentTransaction2.commit();



    }



    @Override
    public void onButtonPress(Uri buttonUri) {

    }

    @Override
    public void onButtonSelected(int idButton) {
        if (idButton == R.id.btn_dinamicf){
            tvChange.setText("YA CAMBIE ALVVV");
            Toast toast = Toast.makeText(getApplicationContext(),"ENTRO AL ACTIVITY", Toast.LENGTH_SHORT);
            toast.show();
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(),"FALLA EL ACTIVITY", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
