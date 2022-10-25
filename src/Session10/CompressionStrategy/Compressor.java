package Session10.CompressionStrategy;

import java.util.List;

public class Compressor {
    private CompressionMethod method;

    public void setMethod(CompressionMethod method) {
        this.method = method;
    }

    public void compress(List<String> files)
    {
        for(String file : files)
        {
            System.out.println(method.compress(file));
            System.out.println();
        }
    }
}
