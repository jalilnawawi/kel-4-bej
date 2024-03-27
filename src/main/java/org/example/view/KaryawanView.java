package org.example.view;

import org.example.Data;
import org.example.model.Karyawan;

public class KaryawanView {
    public void printKaryawan() {
        for (Karyawan karyawan : Data.getListKaryawan()) {
            System.out.println("ID: " + karyawan.getId());
            System.out.println("Name: " + karyawan.getName());
        }
    }
}
