public class ClientApp {
    public static void main(String[] args) {
        // Creamos archivos individuales (Hojas)
        FileLeaf file1 = new FileLeaf("documento.txt", 15);
        FileLeaf file2 = new FileLeaf("foto.jpg", 250);
        FileLeaf file3 = new FileLeaf("video.mp4", 1024);

        // Creamos un directorio (Compuesto) y le agregamos archivos
        DirectoryComposite dirDocs = new DirectoryComposite("Mis Documentos");
        dirDocs.addComponent(file1);

        DirectoryComposite dirMedia = new DirectoryComposite("Archivos Multimedia");
        dirMedia.addComponent(file2);
        dirMedia.addComponent(file3);

        // Creamos un directorio raíz que contiene a los otros directorios (Compuesto de Compuestos)
        DirectoryComposite dirRoot = new DirectoryComposite("C:");
        dirRoot.addComponent(dirDocs);
        dirRoot.addComponent(dirMedia);
        
        // Añadimos un archivo directamente en la raíz
        FileLeaf systemFile = new FileLeaf("config.sys", 5);
        dirRoot.addComponent(systemFile);

        // ¡Aquí ocurre la magia! Al cliente no le importa si está ejecutando un archivo suelto o una super-carpeta.
        System.out.println("--- Detalles del Sistema de Archivos ---");
        dirRoot.showDetails(); // Esto llamará en cascada y dibujará TODO el árbol

        System.out.println("\n--- Tamaño Total ---");
        System.out.println("Tamaño de 'C:': " + dirRoot.getSize() + " KB"); // Esto sumará los MB de todos los hijos recursivamente
        
        System.out.println("\n--- Tratando una hoja individual exactamente igual que a la raíz ---");
        // El cliente usa EXACTAMENTE la misma interfaz (FileSystemComponent) para un solo archivo minúsculo
        file1.showDetails(); 
        System.out.println("Tamaño: " + file1.getSize() + " KB");
    }
}
