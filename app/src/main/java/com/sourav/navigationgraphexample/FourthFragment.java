package com.sourav.navigationgraphexample;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;


/**
 * A simple {@link Fragment} subclass.
 */

public class FourthFragment extends Fragment {


    private MainActivity activity;

    public FourthFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        Toast.makeText(getActivity().getApplicationContext(), "Bundle args " + getArguments().getBoolean("test_boolean"), Toast.LENGTH_SHORT).show();

        /*View.OnClickListener s = Navigation.createNavigateOnClickListener(R.id.action_fourthFragment_to_homeFragment);
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(s);*/

        final Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*final NavController navController = Navigation.findNavController(getActivity(), R.id.demo_nav_host_fragment);
                navController.navigateUp();

                navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
                    @Override
                    public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
//                        Bundle bundle = new Bundle();
//                        bundle.putString("amount", "120");
//                        controller.navigate(R.id.action_thirdFragment_to_homeFragment, bundle);

                       if (destination.getId()==R.id.action_fourthFragment_to_homeFragment);
                        Log.d("TAG", destination.getLabel() + " ");
                    }

                });*/
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity=(MainActivity) context;
    }

}
