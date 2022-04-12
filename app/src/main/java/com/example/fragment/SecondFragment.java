package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class SecondFragment extends Fragment {
    private PageViewModel pageViewModel;
    private TextView txtName, txtAlamat, txtSchool, txtTTL, txtEmail, txtTel;
    public SecondFragment () {
// Required empty public constructor
    }
    /**
     * Use this factory method to create a new instance of this fragment.
     *
     * @return A new instance of fragment SecondFragment.
     */
    public static SecondFragment newInstance() {
        return new SecondFragment();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// initialise ViewModel here
        pageViewModel =
                ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle
            savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //View Name
        txtName = view.findViewById(R.id.textViewName);
        pageViewModel.getName().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtName.setText(s);
                    }
                });

        //View Alamat
        txtAlamat = view.findViewById(R.id.TVAlamat);
        pageViewModel.getAddress().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtAlamat.setText(s);
                    }
                });

        //View Sekolah
        txtSchool = view.findViewById(R.id.TVSekolah);
        pageViewModel.getSchool().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtSchool.setText(s);
                    }
                });

        //View TTL
        txtTTL = view.findViewById(R.id.TVTTL);
        pageViewModel.getTTL().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtTTL.setText(s);
                    }
                });

        //View Email
        txtEmail = view.findViewById(R.id.TVEmail);
        pageViewModel.getEmail().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtEmail.setText(s);
                    }
                });

        //View Tel
        txtTel = view.findViewById(R.id.TVTel);
        pageViewModel.getTel().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtTel.setText(s);
                    }
                });
    }
}