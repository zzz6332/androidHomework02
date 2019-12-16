package com.example.androidhomework.fragment;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.androidhomework.R;

public class FirstFragment extends Fragment {

    private int imageId;
    private String text;
    public static FirstFragment getInstance(int imageId, String text){
        FirstFragment firstFragment = new FirstFragment();
        firstFragment.setText(text);
        firstFragment.setImageId(imageId);
        return firstFragment;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vp_first, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.tv_first_Fragment);
        imageView.setImageResource(imageId);
        textView.setText(text);
    }
}
