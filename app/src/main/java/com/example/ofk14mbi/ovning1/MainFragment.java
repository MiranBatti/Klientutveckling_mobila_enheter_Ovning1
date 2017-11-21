package com.example.ofk14mbi.ovning1;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ofk14mbi on 2017-11-21.
 */

public class MainFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance)
    {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        View startButton = rootView.findViewById(R.id.start_button);
        View aboutButton = rootView.findViewById(R.id.about_button);

        startButton.setOnClickListener(new View.OnClickListener()
                                       {
                                           @Override
                                           public void onClick(View view)
                                           {
                                               Intent intent = new Intent(getActivity(), InputActivity.class);
                                               getActivity().startActivity(intent);
                                           }
                                       });

        return rootView;
    }
}
