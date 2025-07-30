package dto;

public record TranDTO(
        Integer id,
        Double amount,
        Boolean is_deleted,
        String remark,
        String status,
        Integer receiver_id,
        Integer sender_id,
        Integer transaction_type_id
) {

}
