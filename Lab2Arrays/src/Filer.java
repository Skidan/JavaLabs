import java.io.File;

public class Filer {

    // Fields
    private String dirPath, fileName, fileExtension;

    // Getters/setters
    public String getFileName() {
        return fileName;
    }
    public String getFileExtension() {
        return fileExtension;
    }
    public String getDirPath() {
        return dirPath;
    }

    // Constructors
    public Filer(String dirPath, String fileName, String fileExtension) {
        this.dirPath = dirPath;
        this.fileName = fileName;
        this.fileExtension = fileExtension;
    }

    public Filer() {
        this("D:\\Work\\Development\\Java\\logs\\", "log", ".skd");
    }

    // Methods
    public void WriteFile() {
        new File(this.getDirPath() + this.getFileName() + this.getFileExtension()).mkdirs();
        System.out.println("Folder " + this.getDirPath() + this.getFileName() + this.getFileExtension() + " created;");
    }
}
