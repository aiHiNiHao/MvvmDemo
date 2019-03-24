package com.example.lijing.mvvmdemo.activitymvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.lijing.mvvmdemo.R;
import com.example.lijing.mvvmdemo.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserBean bean = new UserBean("lijing", 26);
        binding.setUser(bean);

        com.example.lijing.mvvmdemo.activitymvvm.bean.UserBean userBean = new com.example.lijing.mvvmdemo.activitymvvm.bean.UserBean("我是UserBean");
        binding.setUser2(userBean);


        ArrayList<String> list = new ArrayList<>();
        list.add("listt11");
        list.add("listt22");
        binding.setList(list);

        Map<String, Object> map = new HashMap<>();
        map.put("key1", "obj1");
        map.put("key2", "obj2");
        binding.setMap(map);

        String[] strings = new String[]{"arr1", "arr2"};
        binding.setArray(strings);

        binding.setClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "点击点击", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
