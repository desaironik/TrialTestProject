package com.trial.testproject.models.models.real;
import java.util.List;
public class BusinessAccountRole {

    public String guid;

    public String ein;
    public Person person;

    //businessTitles: president, Director, Vice president, chief financial officer, partner
    public String businessTitle;


    //role: designated employee, shareholders, sole proprietor, partner, designatedOfficers
    public String role;
   // rolestatus: active, pending, expired, removed, declined
    public String roleStatus;
    public List<EmailAddress> emailAddresses;
    public List<AccessPeriod> accessPeriod;
    public String nominationDate;
    public String nominationExpirationDate;
    public String updateDate;
    public String lastValidationDate;
    public String validationEndDate;

}
