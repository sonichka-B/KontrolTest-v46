import java.util.Objects;

public class Email {
    private final String email;

    public Email(String email){
        if (email == null || !email.contains("@")) {
            throw new InvalidData("Invalid email");
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Email email1)) return false;
        return Objects.equals(email, email1.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
