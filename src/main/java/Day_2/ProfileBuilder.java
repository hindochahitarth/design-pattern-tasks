package Day_2;

public interface ProfileBuilder {
    ProfileBuilder username(String username);
    ProfileBuilder email(String email);
    ProfileBuilder age(int age);
    UserProfile build();
}
