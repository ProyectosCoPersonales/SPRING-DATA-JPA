package com.DB2.Model.entity;

import java.time.LocalDate;

public class Appointment {
    private Long appointmentId;
    private LocalDate dateAndTimeOfAppointment;
    private Doctor assignedDoctor;
    private Patient patient;
    private String reasonForAppointment;
    private String diagnosis;
    private String prescribedTreatment;
    private String additionalNotes;
}
