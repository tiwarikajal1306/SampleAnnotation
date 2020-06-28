package com.csvandjsondemo1;
import com.opencsv.bean.CsvBindByPosition;
public class CSVUser {
    @CsvBindByPosition(position = 2)
    private String name;
    @CsvBindByPosition(position = 1)
    private String email;
    @CsvBindByPosition(position = 3)
    private String phoneNo;
    @CsvBindByPosition(position = 0)
    private String country;
    public CSVUser(String country, String email, String name, String phoneNo) {
        this.country = country;
        this.email = email;
        this.name = name;
        this.phoneNo = phoneNo;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPhoneNo()
    {
        return phoneNo;
    }
    public String getCountry()
    {
        return country;
    }
    @Override
    public String toString() {
        return "CSVUser { " +
                "name='" + name + "'" +
                ", email='" + email + "'" +
                ", phone='" + phoneNo + "'" +
                ", country='" + country + "'" +
                " }";
    }
}