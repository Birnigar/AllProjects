package Repl_It;

public class Repl_220 {
    private String data;
    private int yint;


    public Repl_220(String data,int yint){
        getData();
        getYint();
        setData(data);
        setYint(yint);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }
}
