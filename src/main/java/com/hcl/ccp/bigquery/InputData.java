package com.hcl.ccp.bigquery;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InputData implements Serializable {

    @JsonProperty("customerID")
    private String customerID;
    @JsonProperty(" State__")
    private String  State__;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("SeniorCitizen")
    private int SeniorCitizen;
    @JsonProperty("Partner")
    private boolean Partner;
    @JsonProperty("Dependents")
    private boolean Dependents;
    @JsonProperty("tenure")
    private int tenure;
    @JsonProperty("Tech_issue_repo_M1")
    private int Tech_issue_repo_M1;
    @JsonProperty("Tech_issue_repo_M2")
    private int Tech_issue_repo_M2;
    @JsonProperty("Tech_issue_repo_M3")
    private int Tech_issue_repo_M3;
    @JsonProperty("PhoneService")
    private boolean PhoneService;
    @JsonProperty("MultipleLines")
    private String MultipleLines;
    @JsonProperty("TypeOfInternetService")
    private String TypeOfInternetService;
    @JsonProperty("OnlineSecurity")
    private boolean OnlineSecurity;
    @JsonProperty("OnlineBackup")
    private boolean OnlineBackup;
    @JsonProperty("DeviceProtection")
    private boolean DeviceProtection;
    @JsonProperty("TechSupport")
    private boolean TechSupport;
    @JsonProperty("HDStreamingServc")
    private boolean HDStreamingServc;
    @JsonProperty("_4KStreamingServc")
    private boolean _4KStreamingServc;
    @JsonProperty("Contract")
    private String Contract;
    @JsonProperty("SeviceQualityFdback")
    private String SeviceQualityFdback;
    @JsonProperty("PaperlessBilling")
    private boolean PaperlessBilling;
    @JsonProperty("PaymentMethod")
    private String PaymentMethod;

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setState__(String state__) {
        State__ = state__;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSeniorCitizen(int seniorCitizen) {
        SeniorCitizen = seniorCitizen;
    }

    public void setPartner(boolean partner) {
        Partner = partner;
    }

    public void setDependents(boolean dependents) {
        Dependents = dependents;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public void setTech_issue_repo_M1(int tech_issue_repo_M1) {
        Tech_issue_repo_M1 = tech_issue_repo_M1;
    }

    public void setTech_issue_repo_M2(int tech_issue_repo_M2) {
        Tech_issue_repo_M2 = tech_issue_repo_M2;
    }

    public void setTech_issue_repo_M3(int tech_issue_repo_M3) {
        Tech_issue_repo_M3 = tech_issue_repo_M3;
    }

    public void setPhoneService(boolean phoneService) {
        PhoneService = phoneService;
    }

    public void setMultipleLines(String multipleLines) {
        MultipleLines = multipleLines;
    }

    public void setTypeOfInternetService(String typeOfInternetService) {
        TypeOfInternetService = typeOfInternetService;
    }

    public void setOnlineSecurity(boolean onlineSecurity) {
        OnlineSecurity = onlineSecurity;
    }

    public void setOnlineBackup(boolean onlineBackup) {
        OnlineBackup = onlineBackup;
    }

    public void setDeviceProtection(boolean deviceProtection) {
        DeviceProtection = deviceProtection;
    }

    public void setTechSupport(boolean techSupport) {
        TechSupport = techSupport;
    }

    public void setHDStreamingServc(boolean HDStreamingServc) {
        this.HDStreamingServc = HDStreamingServc;
    }

    public void set_4KStreamingServc(boolean _4KStreamingServc) {
        this._4KStreamingServc = _4KStreamingServc;
    }

    public void setContract(String contract) {
        Contract = contract;
    }

    public void setSeviceQualityFdback(String seviceQualityFdback) {
        SeviceQualityFdback = seviceQualityFdback;
    }

    public void setPaperlessBilling(boolean paperlessBilling) {
        PaperlessBilling = paperlessBilling;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }

    public void setMonthlyCharges(double monthlyCharges) {
        MonthlyCharges = monthlyCharges;
    }

    public void setTotalCharges(float totalCharges) {
        TotalCharges = totalCharges;
    }

    public void setChurn(boolean churn) {
        Churn = churn;
    }

    public void setBilling_Erros_M1(int billing_Erros_M1) {
        Billing_Erros_M1 = billing_Erros_M1;
    }

    public void setBilling_Errors_M2(int billing_Errors_M2) {
        Billing_Errors_M2 = billing_Errors_M2;
    }

    public void setBilling_Errors_M3(int billing_Errors_M3) {
        Billing_Errors_M3 = billing_Errors_M3;
    }

    @JsonProperty("MonthlyCharges")
    private double MonthlyCharges;
    @JsonProperty("TotalCharges")
    private float TotalCharges;
    @JsonProperty("Churn")
    private boolean Churn;

    @JsonProperty("Billing_Erros_M1")
    private int Billing_Erros_M1;
    @JsonProperty("Billing_Errors_M2")
    private int Billing_Errors_M2;
    @JsonProperty("Billing_Errors_M3")
    private int Billing_Errors_M3;
}
