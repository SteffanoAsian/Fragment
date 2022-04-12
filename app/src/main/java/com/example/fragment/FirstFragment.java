package com.example.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.textfield.TextInputEditText;

public class FirstFragment extends Fragment {
    private PageViewModel pageViewModel;
    public FirstFragment() {
// Required empty public constructor
    }
    public static FirstFragment newInstance() {
        return new FirstFragment();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    @Override public void onViewCreated(@NonNull View view, @Nullable
            Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Edit Nama
        TextInputEditText nameEditText =
                view.findViewById(R.id.textInputTextName);

        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setName(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });

        //EditAlamat
        TextInputEditText addressEditText =
                view.findViewById(R.id.textInputAddress);

        addressEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setAddress(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });

        //EditSekolah
        TextInputEditText schoolEditext =
                view.findViewById(R.id.textInputSchool);

        schoolEditext.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setSchool(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });

        //EditTTL
        TextInputEditText TTLEditText =
                view.findViewById(R.id.textInputTTL);

        TTLEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setTTL(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });

        //EditEmail
        TextInputEditText emailEditText =
                view.findViewById(R.id.textInputAddress);

        emailEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setEmail(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });

        //EditTel
        TextInputEditText telEditText =
                view.findViewById(R.id.textInputAddress);

        telEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setTel(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });
    }
}