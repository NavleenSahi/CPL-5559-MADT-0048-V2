package com.example.readmine.ui.share;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.readmine.R;

public class URFragment extends Fragment {

    private URViewModel URViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        URViewModel =
                ViewModelProviders.of(this).get(URViewModel.class);
        View root = inflater.inflate(R.layout.fragment_share, container, false);
        final Button button = root.findViewById(R.id.logout);
        URViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                button.setText(s);
            }
        });
        return root;
    }
}