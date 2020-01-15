package com.example.zee.taskfinal;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class data extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        listView=findViewById(R.id.listview);

        final ArrayList<String> food= new ArrayList<>();
        final ArrayAdapter adapt=new ArrayAdapter<String>(this, R.layout.adapter,food);
        listView.setAdapter(adapt);

        DatabaseReference reference= FirebaseDatabase.getInstance().getReference().child("food");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                food.clear();
                for (DataSnapshot val: dataSnapshot.getChildren()){
                    food.add(val.getValue().toString());
                }
                adapt.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
