package com.hori_t.sandbox.ui.main;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hori_t.sandbox.R;

public class FirstFragment extends Fragment {

    private MainViewModel mViewModel;

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        final NavController controller = Navigation.findNavController(getActivity(), R.id.fragment);
        view.findViewById(R.id.button1).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        controller.navigate(R.id.action_firstFragment_to_secondFragment);
                    }
                }
        );
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

}
