package cda.java.exercice7;

import java.util.HashSet;
import java.util.Set;

public class CreateAccount {

    private Set<String> registeredEmails = new HashSet<>();

    public CreateAccount() {
        registeredEmails.add("exist@gmail.com");
    }

    public boolean isEmailAvailable(String email) {
        return !registeredEmails.contains(email);
    }

    public boolean createAccount(String email, String username, String password) throws Exception {
        if (email == null || email.isEmpty() || username == null || username.isEmpty() || password == null || password.isEmpty()) {
            throw new Exception("Tous les champs sont obligatoires.");
        }

        if (!isEmailAvailable(email)) {
            throw new Exception("Cet email est déjà utilisé.");
        }
        registeredEmails.add(email);
        return true;
    }
}
