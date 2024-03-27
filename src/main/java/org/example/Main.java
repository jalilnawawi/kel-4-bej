package org.example;

import org.example.model.Karyawan;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Data.initiateData();

        printKaryawan("Bandung", Data.listKaryawan);
        System.out.println("\n");
        printKaryawan("Jakarta", Data.listKaryawan);
    }

    static void printKaryawan(String kota, ArrayList<Karyawan> listKaryawan) {
        System.out.println("Berikut adalah list karyawan untuk cabang " + kota);

        for (Karyawan karyawan : listKaryawan) {
            if (karyawan.getKantorCabang()
                    .getCity()
                    .equals(kota)) {
                System.out.println("ID : " + karyawan.getId() + " || Nama: " + karyawan.getName() + " || DOB: "
                        + karyawan.getDateOfBirth() + " || Address: " + karyawan.getAddress() + " || Status: " + karyawan.getStatus());
            }
        }
    }
}