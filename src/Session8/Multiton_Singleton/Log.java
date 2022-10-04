package Session8.Multiton_Singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Log {

    private String filename;
    private static Map<String, Log> map = new HashMap<>();
    private static Log log;
//    private static Object lock = new Object(); for singleton

    private ArrayList<LogLine> logs;

    public static Log getInstance(String filename)
    {

        //MULTITION
        Log instance = map.get(filename);
        if (instance == null)
        {
            synchronized (map)
            {
                instance = map.get(filename);
                if (instance == null)
                {
                    instance = new Log();
                    map.put(filename, instance);
                    instance.setFilename(filename);
                }
            }
        }
        return instance;
            // SINGLETON
//        if (log == null)
//        {
//            synchronized (lock)
//            {
//                if (log == null)
//                {
//                    log = new Log();
//                }
//            }
//        }
//        return log;
    }

    public void setFilename(String filename)
    {
        this.filename = "src/Session8/Multiton_Singleton/" + filename + ".txt";
    }
    private Log()
    {
        logs = new ArrayList<>();
    }
    public void addLog(String text)
    {
        LogLine logLine = new LogLine(text);
        logs.add(logLine);
        addToFile(logLine);
        System.out.println(text);
    }

    public ArrayList<LogLine> getAll()
    {
        return logs;
    }

    @Override
    public String toString() {
        return "Log{" +
                "logs=" + logs +
                '}';
    }

    private void addToFile(LogLine log)
    {
        if (log == null)
        {
            return;
        }
        BufferedWriter out = null;
        try
        {
            System.out.println(filename);
            out = new BufferedWriter(new FileWriter(filename, true));
            out.write(log + "\n");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                out.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

}
