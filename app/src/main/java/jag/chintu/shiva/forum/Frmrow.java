package jag.chintu.shiva.forum;

public class Frmrow
{
    private String name;
    private String post;
    private String time;
    
    public Frmrow() {
    }
    
    public Frmrow(final String post) {
        this.post = post;
    }
    
    public Frmrow(final String name, final String post, final String time) {
        this.name = name;
        this.post = post;
        this.time = time;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getPost() {
        return this.post;
    }
    
    public String getTime() {
        return this.time;
    }
}
