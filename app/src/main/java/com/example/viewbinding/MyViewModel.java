package com.example.viewbinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
 public   MutableLiveData<Integer> score=new MutableLiveData<>();
    public MyViewModel() {
        score.setValue(0);
    }
    public void increment(){
        score.setValue(score.getValue()+1);
    }
    public void decrement(){
        score.setValue(score.getValue()-1);
    }


//      int score=0;
//   public MyViewModel() {
//   }
//    public void increment(){
//        score++;
//    }
//    public void decrement(){
//        score--;
//    }
}
