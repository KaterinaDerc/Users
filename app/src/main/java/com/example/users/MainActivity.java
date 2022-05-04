package com.example.users;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.users.model.User;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            ArrayList<User> userList = NetworkManager.getStudentList();
            for (int i = 0; i < userList.size(); i++) {
                System.out.println(userList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
