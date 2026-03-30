import java.util.ArrayList;
import java.util.List;

public class DirectoryComposite implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public DirectoryComposite(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directorio: [" + name + "]");
        // Delega la misma acción a todos sus hijos
        for (FileSystemComponent component : components) {
            component.showDetails(); 
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        // Pide recursivamente el tamaño de todos sus hijos
        for (FileSystemComponent component : components) {
            totalSize += component.getSize(); 
        }
        return totalSize;
    }
}
