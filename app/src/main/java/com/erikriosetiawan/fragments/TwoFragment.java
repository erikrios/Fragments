package com.erikriosetiawan.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TwoFragment extends Fragment {

    Button buttonGetText;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        buttonGetText = getActivity().findViewById(R.id.button_get_text);
        buttonGetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                TextView textViewFragmentOne = getActivity().findViewById(R.id.text_view_fragment_one);
//                Toast.makeText(getActivity(), textViewFragmentOne.getText().toString(), Toast.LENGTH_SHORT).show();
                ThreeFragment dialogFragment = ThreeFragment.newInstance("Are you sure to do this action?");
                dialogFragment.show(getFragmentManager(), "dialog");
            }
        });
    }
}
