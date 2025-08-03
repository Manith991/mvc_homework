package dto;

public record CustomerDTO(
        int id,
        String address,
        String cityOrProvince,
        String companyName,
        String country,
        String dob,
        String email,
        String employmentType,
        String fullName,
        String gender,
        boolean isDeleted,
        String mainSourceOfIncome,
        String monthlyIncomeRange,
        String phoneNumber,
        String position,
        String remark,
        String zipCode,
        int customerSegmentId
) { }
