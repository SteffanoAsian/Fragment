package com.example.fragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();
    private MutableLiveData<String> mAddress = new MutableLiveData<>();
    private MutableLiveData<String> mSchool = new MutableLiveData<>();
    private MutableLiveData<String> mTTL = new MutableLiveData<>();
    private MutableLiveData<String> mEmail = new MutableLiveData<>();
    private MutableLiveData<String> mTel = new MutableLiveData<>();

    public void setName(String name){
        mName.setValue(name);
    }
    public LiveData<String> getName(){
        return mName;
    }

    public void setAddress(String address){
        mAddress.setValue(address);
    }
    public LiveData<String> getAddress(){
        return mAddress;
    }

    public void setSchool(String school){
        mSchool.setValue(school);
    }
    public LiveData<String> getSchool(){
        return mSchool;
    }
    public void setTTL(String TTL){
        mTTL.setValue(TTL);
    }
    public LiveData<String> getTTL(){
        return mTTL;
    }

    public void setEmail(String email){
        mEmail.setValue(email);
    }
    public LiveData<String> getEmail(){
        return mEmail;
    }

    public void setTel(String tel){
        mTel.setValue(tel);
    }
    public LiveData<String> getTel(){
        return mTel;
    }
}
