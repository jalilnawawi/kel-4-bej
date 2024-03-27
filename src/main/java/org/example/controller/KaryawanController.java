package org.example.controller;

import java.util.List;

import org.example.model.Karyawan;
import org.example.service.KaryawanService;

public class KaryawanController {

    private KaryawanService karyawanService;

    public void tambahKaryawan(Karyawan karyawan, Long id, String name, List<Karyawan> listKaryawan) {
    karyawanService.tambahKaryawan(karyawan, id, name, listKaryawan);    
    
    }



}
