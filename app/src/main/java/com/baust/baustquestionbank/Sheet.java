package com.baust.baustquestionbank;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class Sheet extends BottomSheetDialogFragment {

    private Button online,offline;
    private ReadMethod readMethod;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_bottom_sheet,container,false);

        online=v.findViewById(R.id.onlinereadid);
        offline=v.findViewById(R.id.oflinereadid);

        online.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readMethod.onlineRead(true);
                dismiss();
            }
        });
        offline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readMethod.offlineRead(true);
                dismiss();
            }
        });
        return v;

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            readMethod= (ReadMethod) context;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public interface ReadMethod{

        void onlineRead(boolean flag);
        void offlineRead(boolean flag);

    }


}
