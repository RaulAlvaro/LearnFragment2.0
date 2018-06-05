package com.example.raul.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


/*
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BlankFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class BlankFragment extends Fragment {
    private final String LOG_TAG = "test";
    private TextView holafragment;
    OnPressButtonListener onPressButtonListener;
    /*
    public static BlankFragment newInstate() {
        return new BlankFragment();
    }
    */

    public interface OnPressButtonListener{
        public void onButtonPress(Uri buttonUri);
    }



    @Override
    public void onAttach (Context context) {
        super.onAttach(context);
        try {
            onPressButtonListener = (OnPressButtonListener) getActivity();
        } catch (ClassCastException e){
            throw new ClassCastException(getActivity().toString() + "must implemented OnPressButtonListener");
        }

        Log.v(LOG_TAG, "onAttach");
        //Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onAttach", Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        holafragment = (TextView) getActivity().findViewById(R.id.tv_holafragment);
        Log.v(LOG_TAG, "onCreate");
        //Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onCreate", Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
        holafragment = (TextView) rootView.findViewById(R.id.tv_holafragment);

        Log.v(LOG_TAG, "onCreateView");
        //Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onCreateView", Toast.LENGTH_SHORT);
        //toast.show();
        return rootView;
    }


    @Override
    public void onActivityCreated (Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.v(LOG_TAG, "onActivityCreated");
        //Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onActivityCreated", Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    public void onViewStateRestored (Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.v(LOG_TAG, "onViewStateRestored");
        //Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onViewStateRestored", Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    public void onStart () {
        super.onStart();
        Log.v(LOG_TAG, "onStart");
        //Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onStart", Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    public void onResume () {
        super.onResume();
        Log.v(LOG_TAG, "onResume");
        //Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onResume", Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    public void onPause () {
        super.onPause();
        Log.v(LOG_TAG, "onPause");
        //Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onPause", Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    public void onStop () {
        super.onStop();
        Log.v(LOG_TAG, "onStop");
        //Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onStop", Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    public void onDestroyView () {
        super.onDestroyView();
        Log.v(LOG_TAG, "onDestroyView");
        //Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onDestroyView", Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    public void onDestroy () {
        super.onDestroy();
        Log.v(LOG_TAG, "onDestroy");
        //Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onDestroy", Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    public void onDetach () {
        super.onDetach();
        Log.v(LOG_TAG, "onDetach");
        //Toast toast = Toast.makeText(getActivity().getApplicationContext(),"onDetach", Toast.LENGTH_SHORT);
        //toast.show();
    }


}

