import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class World {
    int[][] m;
    int rows = 0;
    int cols = 0;
    int monspawnx;
    int monspawny;
    int pacspawnx;
    int pacspawny;
    int size = 25;
    int s2 = size/2;

    public World(String filename){
        String strLine = null;
        StringTokenizer st = null;
        boolean firstRow = true;
        //int lines = 0;
        //int tokenNumber =0;
        String delims = "[,]";
        String [] tokens;
        String record;
        //read in the map
        try{
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            int row=0;
            while(scanner.hasNextLine()){
                record = scanner.nextLine();
                tokens = record.split(delims);

                if(firstRow){
                    this.cols = (Integer.parseInt(tokens[0]));
                    this.rows = (Integer.parseInt(tokens[1]));
                    this.monspawnx = (Integer.parseInt(tokens[2]));
                    this.monspawny = (Integer.parseInt(tokens[3]));
                    this.pacspawnx = (Integer.parseInt(tokens[4]));
                    this.pacspawny = (Integer.parseInt(tokens[5]));
                    m = new int[cols][rows];
                    firstRow = false;
                }
                else{
                    for(int k=0; k<cols; k++){
                        m[k][row] = Integer.parseInt(tokens[k]);

                    }
                    row ++;
                }
                System.out.println(record);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void printMap(){
        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                System.out.print(" "+m[col][row]);
            }
            System.out.println();
        }
    }

    public void paint(Graphics g){
        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                if(m[col][row]==9){
                    //print wall
                    g.setColor(new Color(0,0,255));
                    g.fillRect(col*size+200, row*size,size,size);

                }
                else{
                    g.setColor(new Color(0, 0, 0));
                    g.fillRect(col*size+200, row*size,size,size);
                    //check for dots
                    if(m[col][row]%2>0){
                        g.setColor(new Color(255,255,255));
                        g.fillOval(col*size+s2+200,row*size+s2, 5,5);
                    }
                }
            }
        }

    }
}