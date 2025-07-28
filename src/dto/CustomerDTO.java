package dto;

public class CustomerDTO {
    private String fullName;
    private String email;

    public CustomerDTO(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() { return fullName; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return fullName + " | " + email;
    }
}
