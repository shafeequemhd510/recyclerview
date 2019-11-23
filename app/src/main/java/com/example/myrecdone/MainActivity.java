package com.example.myrecdone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Users> users= new ArrayList<Users>();
                users.add(new Users(R.drawable.pic1,"Lilly"));
                users.add(new Users(R.drawable.pic2,"Rose"));
                users.add(new Users(R.drawable.pic3,"Rose"));
                users.add(new Users(R.drawable.pic4,"Rose"));
                users.add(new Users(R.drawable.pic5,"Rose"));
                users.add(new Users(R.drawable.pic6,"Rose"));
                users.add(new Users(R.drawable.pic8,"Passport_size"));
                users.add(new Users(R.drawable.pic9,"Shop"));
                users.add(new Users(R.drawable.pic10,"Personal"));
                users.add(new Users(R.drawable.pic11,"Kids"));

        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new UserAdapter(users));

    }
}
