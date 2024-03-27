package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List; // Add this import statement


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)

public class Karyawan extends Entity {
    private LocalDate dateOfBirth;
    private String status;
    private KantorCabang kantorCabang;
}
