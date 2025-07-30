package model;

public class Customer {
    private int id;
    private String address;
    private String cityOrProvince;
    private String companyName;
    private String country;
    private String dob;
    private String email;
    private String employmentType;
    private String fullName;
    private String gender;
    private boolean isDeleted;
    private String mainSourceOfIncome;
    private String monthlyIncomeRange;
    private String phoneNumber;
    private String position;
    private String remark;
    private String zipCode;
    private int customerSegmentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityOrProvince() {
        return cityOrProvince;
    }

    public void setCityOrProvince(String cityOrProvince) {
        this.cityOrProvince = cityOrProvince;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getMainSourceOfIncome() {
        return mainSourceOfIncome;
    }

    public void setMainSourceOfIncome(String mainSourceOfIncome) {
        this.mainSourceOfIncome = mainSourceOfIncome;
    }

    public String getMonthlyIncomeRange() {
        return monthlyIncomeRange;
    }

    public void setMonthlyIncomeRange(String monthlyIncomeRange) {
        this.monthlyIncomeRange = monthlyIncomeRange;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getCustomerSegmentId() {
        return customerSegmentId;
    }

    public void setCustomerSegmentId(int customerSegmentId) {
        this.customerSegmentId = customerSegmentId;
    }
}
