package org.example.service;
import java.util.List;

import org.example.model.Karyawan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Data
@Setter
@EqualsAndHashCode
@Getter


public class KaryawanService {
  public void tambahKaryawan (Karyawan karyawan, Long id, String name, List<Karyawan> listKaryawan) {
    karyawan.setId(id);
    karyawan.setName(name);
    
    Karyawan karyawan1 = new Karyawan();
    karyawan1.setId(1L);
    karyawan1.setName("Karyawan1");
    listKaryawan.add(karyawan1);

    
  }
  
}
