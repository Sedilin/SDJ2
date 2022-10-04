package Session8.Multiton_Singleton;

public class LogLine {
    private String text;
    private DataTime dataTime;

    public LogLine(String text)
    {
        this.text = text;
        dataTime = new DataTime();
    }
    public String getText()
    {
        return text;
    }
    public DataTime getDataTime()
    {
        return dataTime;
    }

    @Override
    public String toString() {
        return "LogLine{" +
                "text='" + text + '\'' +
                ", dataTime=" + dataTime +
                '}';
    }
}
