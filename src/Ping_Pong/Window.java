/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ping_Pong;
import javax.swing.*;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
/**
 *
 * @author Lawal Nafiu
 */
public class Window {
    Color bg = new Color(0x0ff);
    public Window(int x, int y){
        JFrame window = new JFrame();
        window.setSize(x, y);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(100, 50);
        window.setVisible(true);
        Panel obj = new Panel();
        Animation ball = new Animation();
        window.getContentPane().add(obj);
        Rectangle2D a = new Rectangle2D();
    }
}
