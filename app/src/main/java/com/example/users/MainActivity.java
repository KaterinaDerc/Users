package com.example.users;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.os.Bundle;
import android.util.Log;

import com.example.users.model.User;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MenuBuilder studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Log.d("tag", "hi");
                    ArrayList<User> userList = NetworkManager.getStudentList();
                    for (int i = 0; i < userList.size(); i++) {
                        if (userList.get(i).getName().startsWith("L") ||userList.get(i).getName().startsWith("E") ) {
                            Log.d("tag",userList.get(i).getFullDescription());
                        }
                        //Log.d("tag", userList.get(i).getFullDescription());

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
