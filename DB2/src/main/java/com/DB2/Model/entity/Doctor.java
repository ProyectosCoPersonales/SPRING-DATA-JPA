package com.DB2.Model.entity;

import java.time.LocalDate;
import java.util.List;

public class Doctor {
    private String fullName;
    private Speciality speciality;
    private String licenseNumber;
    private String phoneNumber;
    private String email;
    private List<String> officeHours;
    private Office assignedOffice;
    private LocalDate dateOfJoining;

    public enum Speciality {
        GENERAL_MEDICINE, PEDIATRICS, CARDIOLOGY, DERMATOLOGY, NEUROLOGY
    }

    public enum Office {
        OFFICE_1, OFFICE_2, OFFICE_3, OFFICE_4
    }
}
