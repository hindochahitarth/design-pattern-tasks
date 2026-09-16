package Day_2;
// File: UserProfile.java
import java.util.ArrayList;
import java.util.List;

public class UserProfile {
    private final String username;
    private final String email;
    private final int age;
    private final List<String> interests;

    // Private constructor accepting the interface-based implementation
    private UserProfile(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.age = builder.age;
        this.interests = builder.interests;
    }

    // Getters
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public List<String> getInterests() { return interests; }

    // Static nested class implementing the single interface
    public static class Builder implements ProfileBuilder {
        private String username;
        private String email;
        private int age = 0;
        private List<String> interests = new ArrayList<>();

        @Override
        public ProfileBuilder username(String username) {
            this.username = username;
            return this;
        }

        @Override
        public ProfileBuilder email(String email) {
            this.email = email;
            return this;
        }

        @Override
        public ProfileBuilder age(int age) {
            this.age = age;
            return this;
        }
        @Override
        public UserProfile build() {
            // Validation rules checked at runtime execution
            if (username == null || username.isBlank()) {
                throw new IllegalStateException("Missing required field: username");
            }
            if (email == null || email.isBlank()) {
                throw new IllegalStateException("Missing required field: email");
            }
            return new UserProfile(this);
        }
    }
}
