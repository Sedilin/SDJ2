package Session10.CompressionStrategy;

import java.util.ArrayList;
import java.util.List;

public class CompressorTest {
    public static void main(String[] args) {
        CompressionMethod methodForZip = new ZipCompression();
        CompressionMethod methodFor7Z = new SevenZCompression();
        Compressor compressor = new Compressor();

        List<String> filesForZip = new ArrayList<>();
        List<String> filesFor7Z = new ArrayList<>();

        String file1Zip = "game1";
        String file2Zip = "game2";
        String file3Zip = "game3";
        String file4Zip = "game4";

        filesForZip.add(file1Zip);
        filesForZip.add(file2Zip);
        filesForZip.add(file3Zip);
        filesForZip.add(file4Zip);


        String file17Z = "game5";
        String file27Z = "game6";
        String file37Z = "game7";
        String file47Z = "game8";

        filesFor7Z.add(file17Z);
        filesFor7Z.add(file27Z);
        filesFor7Z.add(file37Z);
        filesFor7Z.add(file47Z);

        compressor.setMethod(methodForZip);
        compressor.compress(filesForZip);

        compressor.setMethod(methodFor7Z);
        compressor.compress(filesFor7Z);
    }
}
