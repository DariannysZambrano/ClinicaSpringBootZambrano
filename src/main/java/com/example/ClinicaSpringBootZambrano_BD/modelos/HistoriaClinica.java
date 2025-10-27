package com.example.ClinicaSpringBootZambrano_BD.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="clinicalHistory")
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer historyId;
    @Column(length = 50, nullable = false)
    private LocalDate creationDate;
    @Column(length = 1000, nullable = false)
    private String reasonForConsultation;
    @Column(length = 500, nullable = false)
    private String diagnosis;
    @Column(length = 500, nullable = false)
    private String treatment;
    @Column(length = 50, nullable = false)
    private String allergies;
    @Column(nullable = false)
    private String medicalHistory;
    @Column(length = 1000, nullable = false)
    private String examResults;
    @Column(length = 500, nullable = false)
    private String observations;
    @Column(nullable = false)
    private boolean active;

@OneToOne(mappedBy = "historiaclinica")
    private Paciente paciente;

    public HistoriaClinica() {
    }

    public HistoriaClinica(Integer historyId, LocalDate creationDate, String reasonForConsultation, String diagnosis, String treatment, String allergies, String medicalHistory, String examResults, String observations, boolean active, Paciente paciente) {
        this.historyId = historyId;
        this.creationDate = creationDate;
        this.reasonForConsultation = reasonForConsultation;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.allergies = allergies;
        this.medicalHistory = medicalHistory;
        this.examResults = examResults;
        this.observations = observations;
        this.active = active;
        this.paciente = paciente;
    }

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getReasonForConsultation() {
        return reasonForConsultation;
    }

    public void setReasonForConsultation(String reasonForConsultation) {
        this.reasonForConsultation = reasonForConsultation;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getExamResults() {
        return examResults;
    }

    public void setExamResults(String examResults) {
        this.examResults = examResults;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
