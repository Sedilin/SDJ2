package Session14.ReaderWriter;

public interface ReadWrite
{
    void write();
    int read();
    void acquireRead();	// some condition
    void releaseRead();
    void acquireWrite(); // some other condition
    void releaseWrite();
}
