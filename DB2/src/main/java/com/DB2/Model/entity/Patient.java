package com.DB2.Model.entity;

import java.time.LocalDate;
import java.util.List;

public class Patient {
    private String fullName;
    private LocalDate dateOfBirth;
    private Character gender; 
    private String identificationNumber;
    private String address;
    private String phoneNumber;
    private String email;
    private Boolean healthInsurance;
    private ConsultationHistory consultationHistory;

    public enum Gender {
        MALE, FEMALE, OTHER
    }
}
