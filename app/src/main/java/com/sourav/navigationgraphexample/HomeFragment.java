package com.sourav.navigationgraphexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        View.OnClickListener s = Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_thirdFragment);
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(s);

// -----------------Alterbate way 1------------------------
    /*    final NavController navController = Navigation.findNavController(getActivity(), R.id.demo_nav_host_fragment);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_firstFragment_to_secondFragment);
            }
        });*/

// -----------------Alterbate way 2------------------------
       /* final NavDirections navDirections = FirstFragmentDirections.actionFirstFragmentToSecondFragment();
        final NavController navController = Navigation.findNavController(getActivity(), R.id.demo_nav_host_fragment);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(navDirections);
            }
        });*/


        return view;
    }

}
