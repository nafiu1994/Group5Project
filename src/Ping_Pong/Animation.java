/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ping_Pong;
import javax.swing.*;
import java.awt.*;
public class Animation
 {
   int x=0;
   int y=0;
       public static void main(String[] args)
       {
        Animation gui=new Animation();
       gui.play();
     }
public void play()
   {
           JFrame frame=new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            DrawPanel draw=new DrawPanel();
            frame.getContentPane().add(draw);
             frame.setSize(500,500);
              frame.setVisible(true);
             for(int i=0;i<150;i++)
              {
                 x++;
                 y++;
                 draw.repaint();  //tells the panel to redraw itself so we can see the circle in new location
              try{
               Thread.sleep(25);
                  }catch(Exception e)
                  {}
         }
     }

class DrawPanel extends JPanel{
     public void paintComponent(Graphics g)
       {
        g.setColor(Color.WHITE);
        g.fillRect(0,0,this.getWidth(),this.getHeight());
      g.setColor(Color.GREEN);
     g.fillOval(x,y,50,50);
}
}
private void moveIt() {
        while(true){
            if(x >= 283){
                right = false;
                left = true;
            }
            if(y <= 7){
                right = true;
                left = false;
            }
            if(oneY >= 259){
                up = true;
                down = false;
            }
            if(oneY <= 7){
                up = false;
                down = true;
            }
            if(up){
                oneY--;
            }
            if(down){
                oneY++;
            }
            if(left){
                oneX--;
            }
            if(right){
                oneX++;
            }
            try{
                Thread.sleep(10);
            } catch (Exception exc){}
            frame.repaint();
        }
    }
}