public class Sign {
    String msg;
    int width;
    public Sign (String m, int w) {
        msg = m;
        width = w;
    }
    public int numberOfLines () {
        if (msg.length()==0) return 0; //take care of this case that wouldn't work normally
        return (msg.length()-1)/width+1; //+1 to include last half line, -1 to avoid that extra line when length=width
    }
    public String getLines () {
        if (msg.length()==0) return null; //take care of this case that wouldn't work normally
        String lines = ""; //set up string to append to and return
        for (int i=0;i<numberOfLines();i++) {
            if (i==numberOfLines()-1) lines += msg.substring(i*width); //last line just uses the remaining part of the msg string
            else lines += msg.substring(i*width,(i+1)*width)+";"; //appends section for line i and the semicolon as required 
        }
        return lines;
    }
}