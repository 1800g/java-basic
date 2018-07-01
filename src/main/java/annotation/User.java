package annotation;

@Table(name = "user")
public class User {
    @Id
    private String userId;
    private String name;
    private String password;
}
