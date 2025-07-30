package dto;

public record KycDTO(
        Integer cus_id,
        Boolean is_deleted,
        Boolean is_verified,
        String national_card_id
) {
}
