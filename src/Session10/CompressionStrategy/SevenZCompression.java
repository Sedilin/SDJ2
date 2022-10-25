package Session10.CompressionStrategy;

public class SevenZCompression implements CompressionMethod{
    @Override
    public String compress(String filename) {
        System.out.println("Compressing " + filename);
        System.out.println("...");
        return filename + "-7z";
    }
}
