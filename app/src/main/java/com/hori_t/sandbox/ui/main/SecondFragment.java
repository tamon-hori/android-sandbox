package com.hori_t.sandbox.ui.main;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hori_t.sandbox.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        final NavController controller = Navigation.findNavController(getActivity(), R.id.fragment);
        view.findViewById(R.id.button2).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        controller.navigate(R.id.action_secondFragment_to_thirdFragment);
                    }
                }
        );
        return view;
    }

}
