import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Win {

private static final String DB_URL_WINDOWS = "jdbc:sqlserver://localhost:10367;databaseName=HOSPITAL;integratedSecurity=true;trustServerCertificate=true;";

public static void main(String[] args) {

try (Connection conexao = DriverManager.getConnection(DB_URL_WINDOWS )) {
// A linha acima executa a conexão e tenta se autenticar com credenciais do windows.
if (conexao != null) {
System.out.println(" Conexão estabelecida com sucesso!");
// A partir daqui, você pode criar Statements, PreparedStatement etc.
}
} catch (SQLException e) {
// Se houver qualquer problema (driver não encontrado, credenciais erradas, servidor offline, etc.)
System.err.println(" Erro ao conectar ao banco de dados SQL Server!");
e.printStackTrace();
} 
}
}