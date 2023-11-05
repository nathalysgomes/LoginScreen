import java.util.HashMap;
import java.util.Map;

/**
 * classe de autenticacao com simulacao de banco de dados
 */
public class LoginScreen {
	/**
	 * criacao de variavel para simular banco de dados
	 */
    private Map<String, String> userDatabase; // Simulated user database (username, password)
    /**
     * construtor que faz instanciamento e criacao de usuario e senha dentro do userdataBase
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("nathy", "123");
        userDatabase.put("rafael", "1234");
    }
    /**
     * metodo de verificacao
     * @param username nome do usuario que sera verificado pelo metodo
     * @param password senha do usuario que sera verificado pelo metodo
     * @return retorno booleano do metodo
     */
    public boolean login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            if (storedPassword.equals(password)) {
                return true; // Autenticacao realizada com sucesso
            }
        }
        return false; // Falha na autenticacao
    }
    /**
     * adiciona um novo usuario dentro da simulacao de banco de dados
     * @param username
     * @param password
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }
}