package jag.chintu.shiva.forum;

public class Deom
{
    int pic;
    String text;
    
    public Deom(final String text, final int pic) {
        this.text = text;
        this.pic = pic;
    }
    
    public int getPic() {
        return this.pic;
    }
    
    public String getText() {
        return this.text;
    }
    
    public void setPic(final int pic) {
        this.pic = pic;
    }
    
    public void setText(final String text) {
        this.text = text;
    }
}
