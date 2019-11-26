package com.example.readmine.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class URViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public URViewModel() {
        mText = new MutableLiveData<>();
       // mText.setValue("This is share fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}