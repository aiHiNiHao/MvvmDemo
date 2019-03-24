package com.example.lijing.mvvmdemo.recycelrviewmvvm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.lijing.mvvmdemo.BR;


/**
 * Created by lijing on 2019/3/23.
 */

public class ShowBean extends BaseObservable{
    private int age;
    private String name;
    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public ShowBean(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
