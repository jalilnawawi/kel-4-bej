package org.example;

import org.example.model.KantorCabang;
import org.example.model.Karyawan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Data {
    static ArrayList<Karyawan> listKaryawan = new ArrayList<Karyawan>();

    public static void initiateData() {
        KantorCabang kc1 = new KantorCabang();
        kc1.setId(new Random().nextLong(100))
                .setCity("Bandung")
                .setAddress("Jalan Bandung");

        KantorCabang kc2 = new KantorCabang().setId(new Random().nextLong(100))
                .setCity("Jakarta")
                .setAddress("Bundaran HI");

        Karyawan k1 = new Karyawan().setId(new Random().nextLong(100))
                .setName("Karyawan1")
                .setDateOfBirth(LocalDate.of(2002, 4, 20))
                .setAddress("Rumah Karyawan 1")
                .setStatus("Hadir")
                .setKantorCabang(kc1);

        Karyawan k2 = new Karyawan().setId(new Random().nextLong(100))
                .setName("Karyawan2")
                .setDateOfBirth(LocalDate.of(2000, 12, 7))
                .setAddress("Rumah Karyawan 2")
                .setStatus("Absen")
                .setKantorCabang(kc2);

        listKaryawan.add(k1);
        listKaryawan.add(k2);
    }

}
