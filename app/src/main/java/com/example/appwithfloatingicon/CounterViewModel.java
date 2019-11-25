package com.example.appwithfloatingicon;

import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    private int counter;

    public CounterViewModel(){
        this.counter=0;
    }



    public CounterViewModel(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void incrementCounter(){
        this.counter +=1;
    }
}
