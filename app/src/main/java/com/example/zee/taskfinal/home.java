package com.example.zee.taskfinal;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class home extends android.support.v4.app.Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home,container,false);
        RecyclerView posts=(RecyclerView) view.findViewById(R.id.recycle);

        recycleadapt listadapt=new recycleadapt();
        posts.setAdapter(listadapt);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getActivity());
        posts.setLayoutManager(layoutManager);
        return view;

    }


}