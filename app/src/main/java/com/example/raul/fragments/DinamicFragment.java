package com.example.raul.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


/*
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DinamicFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DinamicFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DinamicFragment extends Fragment implements View.OnClickListener{

    private Button btndinamicf;
    private TextView tvdinamicf;

    OnItemSelected onItemSelected;

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_dinamicf){
            Toast toast = Toast.makeText(getActivity().getApplicationContext(),"presiono", Toast.LENGTH_SHORT);
            toast.show();
            onItemSelected.onButtonSelected(R.id.btn_dinamicf);
        }
        else{
            Toast toast = Toast.makeText(getActivity().getApplicationContext(),".VVVVVV", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public interface OnItemSelected {
        public void onButtonSelected(int idButton);
    }


    public DinamicFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            onItemSelected = (OnItemSelected) context;
        }catch (ClassCastException e){
            throw new ClassCastException(getActivity().toString() + "must implement onItemSelected");
        }

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dinamic, container, false);




        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvdinamicf = view.findViewById(R.id.tv_dinamicf);
        btndinamicf = view.findViewById(R.id.btn_dinamicf);
        btndinamicf.setOnClickListener(this);
    }
}
