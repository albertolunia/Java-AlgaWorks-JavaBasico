public class ValidadorEmail {
    public static boolean validar(String email) {
        return email.matches("^[a-zA-Z0-9._-]+@[a-z-0-9.-]+\\.[a-z]{2,4}$");
    }
}
