package dto;

public class CustomerDTO {
    private final int id;
    private final String address;
    private final String cityOrProvince;
    private final String companyName;
    private final String country;
    private final String dob;
    private final String email;
    private final String employmentType;
    private final String fullName;
    private final String gender;
    private final boolean isDeleted;
    private final String mainSourceOfIncome;
    private final String monthlyIncomeRange;
    private final String phoneNumber;
    private final String position;
    private final String remark;
    private final String zipCode;
    private final int customerSegmentId;


    public CustomerDTO(int id, String address, String cityOrProvince, String companyName, String country, String dob, String email, String employmentType, String fullName, String gender, boolean isDeleted, String mainSourceOfIncome, String monthlyIncomeRange, String phoneNumber, String position, String remark, String zipCode,int customerSegmentId) {
        this.id = id;
        this.address = address;
        this.cityOrProvince = cityOrProvince;
        this.companyName = companyName;
        this.country = country;
        this.dob = dob;
        this.email = email;
        this.employmentType = employmentType;
        this.fullName = fullName;
        this.gender = gender;
        this.isDeleted = isDeleted;
        this.mainSourceOfIncome = mainSourceOfIncome;
        this.monthlyIncomeRange = monthlyIncomeRange;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.remark = remark;
        this.zipCode = zipCode;
        this.customerSegmentId = customerSegmentId;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getCityOrProvince() {
        return cityOrProvince;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public String getCountry() {
        return country;
    }

    public String getDob() {
        return dob;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public String getGender() {
        return gender;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public String getMainSourceOfIncome() {
        return mainSourceOfIncome;
    }

    public String getMonthlyIncomeRange() {
        return monthlyIncomeRange;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public String getRemark() {
        return remark;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public int getCustomerSegmentId() {
        return customerSegmentId;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", cityOrProvince='" + cityOrProvince + '\'' +
                ", companyName='" + companyName + '\'' +
                ", country='" + country + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", employmentType='" + employmentType + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", isDeleted=" + isDeleted +
                ", mainSourceOfIncome='" + mainSourceOfIncome + '\'' +
                ", monthlyIncomeRange='" + monthlyIncomeRange + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", position='" + position + '\'' +
                ", remark='" + remark + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", customerSegmentId=" + customerSegmentId +
                '}';
    }
}
