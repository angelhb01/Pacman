import java.awt.*;

public class Mon {
    //properties
    String name;
    int x;
    int y;
    Color color;
    int dir;
    World w;
    //constructor
    public Mon(String n, World wv){
        w = wv;
        x = w.monspawnx+10;
        y = w.monspawny+10;
        name = n;
        color = new Color(255,0,0);
        dir = 1;

    }

    //methods
    public void move(){
        if(dir==1 && w.m[x][y-1]<9)
            y--;
        else if(dir==3 && w.m[x][y+1]<9)
            y++;
        else if(dir==4 && w.m[x-1][y]<9)
            x--;
        else if(dir==2 && w.m[x+1][y]<9)
            x++;
        else{
            setDir();
        }
    }

    private void setDir(){
        dir=(int)(Math.random()*4)+1;
    }


    public void paint(Graphics g){
        g.setColor(color);
        //paint the circle

        g.fillOval(x*w.size+200,y*w.size+6, 25,21);
        g.setColor(new Color(0,0,0));
        g.fillOval(x*w.size+215,y*w.size+w.s2+1,10,10);
    }
    public void paint1(Graphics g){
        g.setColor(color);
        //paint the circle

        g.fillOval(x*w.size+200,y*w.size+4, 25,21);
        g.fillRect(x*w.size+210,y*w.size+w.s2,10,15);
        g.setColor(new Color(0,0,0));
        g.fillOval(x*w.size+210,y*w.size+w.s2-5,8,10);
        g.fillOval(x*w.size+200,y*w.size+w.s2-5,8,10);
    }

    public void paint2(Graphics g){
        color = new Color(76, 194, 194);
        g.setColor(color);
        //paint the circle

        g.fillOval(x*w.size+200,y*w.size+4, 25,21);
        g.fillRect(x*w.size+210,y*w.size+w.s2,10,15);
        g.setColor(new Color(0,0,0));
        g.fillOval(x*w.size+210,y*w.size+w.s2-5,5,5);
        g.fillOval(x*w.size+200,y*w.size+w.s2-5,5,5);
    }
    public void paint3(Graphics g){
        color = new Color(253, 110, 225);
        g.setColor(color);
        //paint the circle

        g.fillOval(x*w.size+200,y*w.size+4, 25,21);
        g.fillRect(x*w.size+200,y*w.size+w.s2,25,10);

        g.setColor(new Color(0,0,0));
        g.fillRect(x*w.size+205,y*w.size+w.s2+10,10,2);
        g.fillOval(x*w.size+210,y*w.size+w.s2-5,5,5);
        g.fillOval(x*w.size+200,y*w.size+w.s2-5,5,5);
    }
    public void paint4(Graphics g){
        color = new Color(255, 111, 8);
        g.setColor(color);
        //paint the circle

        g.fillOval(x*w.size+200,y*w.size+w.s2-10, 25, 21);
        g.fillRect(x*w.size+200,y*w.size+w.s2,25,10);
        g.setColor(new Color(0,0,0));
        g.fillRect(x*w.size+210,y*w.size+w.s2+5,15,3);
        g.fillOval(x*w.size+220,y*w.size+w.s2-5,5,5);
        g.fillOval(x*w.size+200,y*w.size+w.s2-5,5,5);
    }
}