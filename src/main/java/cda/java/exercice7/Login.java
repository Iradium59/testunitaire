package cda.java.exercice7;

import java.util.HashMap;
import java.util.Map;

public class Login {

    private Map<String, String> users = new HashMap<>();

    public Login() {
        users.put("validuser", "validpassword");
    }

    public boolean authenticate(String username, String password) throws Exception {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            throw new Exception("Le nom d'utilisateur et le mot de passe sont obligatoires.");
        }

        if (!users.containsKey(username) || !users.get(username).equals(password)) {
            throw new Exception("Nom d'utilisateur ou mot de passe incorrect.");
        }

        return true;
    }
}
