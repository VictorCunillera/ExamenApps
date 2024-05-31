package com.example.myapplication;

import android.os.CountDownTimer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<String> _timeLeft = new MutableLiveData<>("10");
    public LiveData<String> timeLeft = _timeLeft;

    public void startCountdown() {
        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                _timeLeft.setValue(String.valueOf(millisUntilFinished / 1000));
            }

            public void onFinish() {
                _timeLeft.setValue("0");

                showAlert();
            }
        }.start();
    }

    private void showAlert() {


    }
}
