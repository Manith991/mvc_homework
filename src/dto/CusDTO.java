package dto;

public record CusDTO(
        Integer id,
        String address,
        String city_or_province,
        String company_name,
        String country,
        String dob,
        String email,
        String employment_type,
        String full_name,
        String gender,
        Boolean is_deleted,
        String main_source_of_income,
        String monthly_income_range,
        String phone_number,
        String position,
        String remark,
        String zip_code,
        Integer customer_segment_id

) {

}
