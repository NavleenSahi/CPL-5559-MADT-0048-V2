package com.example.readmine.ui.send;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BookViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BookViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue("This is send fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}