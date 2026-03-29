public class MainSingleton {
    public static void main(String[] args) {
        System.out.println("--- PATRON SINGLETON ---");
        
        DatabaseConnection conexion1 = DatabaseConnection.getInstance();
        conexion1.query("SELECT * FROM usuarios");

        DatabaseConnection conexion2 = DatabaseConnection.getInstance();
        conexion2.query("SELECT * FROM productos");

        System.out.println("Son la misma instancia en memoria? " + (conexion1 == conexion2));
    }
}