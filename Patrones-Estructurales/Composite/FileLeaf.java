public class FileLeaf implements FileSystemComponent {
    private String name;
    private int size;

    public FileLeaf(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("Archivo: " + name + " (" + size + " KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}
