package com.sapulidi.sapulidi.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.sapulidi.sapulidi.R;
import com.sapulidi.sapulidi.adapter.AdapterLaporan;
import com.sapulidi.sapulidi.model.ModelLaporan;

import java.util.ArrayList;

/**
 * Created by ar-android on 04/12/2015.
 */
public class FragmentLaporanBaru extends Fragment {

    private ArrayList<ModelLaporan> data;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_laporanbaru, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            data.add(new ModelLaporan(i, R.drawable.face_circle,
                    "Pungutan Pengurusan Setufujat",
                    "review",
                    "Terjadi penmungutan liar dalam mengurus sertifikat saya oleh pihak desa",
                    "@ahmadrosid", "16/12/2015 22.57"));
        }

        ListView list = (ListView) getActivity().findViewById(R.id.list);
        AdapterLaporan adapter= new AdapterLaporan(getContext(), data);
        list.setAdapter(adapter);
    }
}