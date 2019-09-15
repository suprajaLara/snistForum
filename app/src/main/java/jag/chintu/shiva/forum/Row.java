package jag.chintu.shiva.forum;

public class Row
{
    private String link;
    private String name;
    
    public Row() {
    }
    
    public Row(final String name, final String link) {
        this.name = name;
        this.link = link;
    }
    
    public String getLink() {
        return this.link;
    }
    
    public String getName() {
        return this.name;
    }
}
