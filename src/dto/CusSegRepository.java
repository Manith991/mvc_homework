package dto;

public record CusSegRepository(
        Integer id,
        String description,
        Boolean is_deleted,
        String segment
) {
}
