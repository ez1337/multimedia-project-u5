package com.carballeira.multimedia;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ItemRVFragment extends Fragment {
    private MultimediaViewModel data;

    public ItemRVFragment() {
        // Required empty public constructor
    }

    public static ItemRVFragment newInstance() {
        ItemRVFragment fragment = new ItemRVFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = new ViewModelProvider(requireActivity()).get(MultimediaViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_item_r_v, container, false);
    }
}