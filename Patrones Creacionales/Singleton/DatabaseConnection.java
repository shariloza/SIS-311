public class DatabaseConnection {
    private static DatabaseConnection instance;

    // Constructor privado para evitar instanciacion externa
    private DatabaseConnection() {
        System.out.println("-> Inicializando la conexion a la base de datos...");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Ejecutando consulta SQL: " + sql);
    }
}