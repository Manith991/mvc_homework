package dto;

public record CusSegDTO(
        Integer id,
        String description,
        Boolean is_deleted,
        String segment
) {
}
