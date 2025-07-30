package dto;

public record AccDTO(
        Integer id,
        String act_currency,
        String act_name,
        String act_no,
        Double balance,
        Boolean is_deleted,
        Boolean is_hide,
        Integer account_type_id,
        Integer cus_id,
        Double over_limit
) {
}
