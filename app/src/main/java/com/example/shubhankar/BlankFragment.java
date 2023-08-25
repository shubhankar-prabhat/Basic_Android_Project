package com.example.shubhankar;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("fragment_lifecycle", "onCreate: Fragment Created");
        Toast.makeText(getActivity(), "FRAGMENT_CREATED", Toast.LENGTH_LONG).show();
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        Log.d("fragment_lifecycle", "onCreate: Fragment CreateView");
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("fragment_lifecycle", "onViewCreated: Fragment ViewCreated");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("fragment_lifecycle", "onViewCreated: Fragment ActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("fragment_lifecycle", "onStart: Fragment Started");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("fragment_lifecycle", "onResume: Fragment Resumed");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("fragment_lifecycle", "onPause: Fragment Paused");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("fragment_lifecycle", "onStop: Fragment Stopped");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("fragment_lifecycle", "onDestroyView: Fragment DestroyedView");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("fragment_lifecycle", "onDestroy: Fragment Destroyed");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("fragment_lifecycle", "onDetach: Fragment Detached");
    }
}