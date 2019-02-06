package com.arnawa.owan.simpanpinjamnew;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Laporan extends Fragment {


    public Laporan() {}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.fragment_laporan, container, false);

        Button bt_laporanPembayaran = (Button) view.findViewById(R.id.bt_laporanPembayaran);
        bt_laporanPembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLaporanPembayaran = new Intent(getActivity(), SimpanPinjamLaporanPembayaran.class);
                startActivity(intentLaporanPembayaran);
            }
        });

        Button bt_laporanPinjaman = (Button) view.findViewById(R.id.bt_laporanPinjaman);
        bt_laporanPinjaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLaporanPinjaman = new Intent(getActivity(), SimpanPinjamLaporanPinjaman.class);
                startActivity(intentLaporanPinjaman);
            }
        });

        Button bt_laporanSimpanan = (Button) view.findViewById(R.id.bt_laporanSimpanan);
        bt_laporanSimpanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLaporanSimpanan = new Intent(getActivity(), SimpanPinjamLaporanSimpanan.class);
                startActivity(intentLaporanSimpanan);
            }
        });

        return view;
    }

}
