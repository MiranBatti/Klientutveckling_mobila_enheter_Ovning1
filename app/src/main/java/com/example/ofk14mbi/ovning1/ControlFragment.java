package com.example.ofk14mbi.ovning1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ofk14mbi on 2017-11-24.
 * Klassen för Add och Clear knapparna
 */

public class ControlFragment extends Fragment
{
    private View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance)
    {
        rootView = inflater.inflate(R.layout.fragment_control, container, false);
        return rootView;
    }

    /*
    public void setText()
    {
        ((TextView)rootView.findViewById(R.id.fragment_text_textView)).setText("Hej!");
    }

    public void clearText()
    {
        ((TextView)rootView.findViewById(R.id.fragment_text_textView)).setText("");
    }*/
}
