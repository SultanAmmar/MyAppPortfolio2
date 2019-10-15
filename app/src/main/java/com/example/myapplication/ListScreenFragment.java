package com.example.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListScreenFragment extends Fragment {

    private final String TAG = this.getClass().getSimpleName();
    private ArrayAdapter<String> datesArrayAdapter;
    private String[] datesStringsList;

    public ListScreenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG,"onCreateView called !");

//        Initiating the root view
        View rootView = inflater.inflate(R.layout.fragment_listscreen, container,
                false);

        datesStringsList = getResources().getStringArray(R.array.listscreen_dates_exemple);

        datesArrayAdapter = new ArrayAdapter<String>(getActivity(), R.layout.fragment_listscreen_element,
                R.id.listview_element_date, datesStringsList);

//        Creating the listView
        ListView datesList = (ListView)rootView.findViewById(R.id.fragment_listscreen_listview);
        datesList.setAdapter(datesArrayAdapter);

        return rootView;

    }

}
