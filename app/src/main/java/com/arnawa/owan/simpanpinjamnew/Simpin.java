package com.arnawa.owan.simpanpinjamnew;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Simpin extends Fragment {

    public Simpin() {}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.fragment_simpin, container, false);

        Button bt_dataPengajuan = (Button) view.findViewById(R.id.bt_dataPengajuan);
        bt_dataPengajuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDataPengajuan = new Intent(getActivity(), SimpanPinjamDataPengajuan.class);
                startActivity(intentDataPengajuan);
            }
        });

        Button bt_pengajuanPinjaman = (Button) view.findViewById(R.id.bt_pengajuanPinjaman);
        bt_pengajuanPinjaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPengajuanPinjaman = new Intent(getActivity(), SimpanPinjamPengajuanBaru.class);
                startActivity(intentPengajuanPinjaman);
            }
        });

        Button bt_bayarPinjaman = (Button) view.findViewById(R.id.bt_bayarPinjaman);
        bt_bayarPinjaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBayarPinjaman = new Intent(getActivity(), SimpanPinjamBayarPinjaman.class);
                startActivity(intentBayarPinjaman);
            }
        });

        Button bt_tambahSimpanan = (Button) view.findViewById(R.id.bt_tambahSimpanan);
        bt_tambahSimpanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTambahSimpanan = new Intent(getActivity(), SimpanPinjamTambahSimpanan.class);
                startActivity(intentTambahSimpanan);
            }
        });

        return view;
    }

}
