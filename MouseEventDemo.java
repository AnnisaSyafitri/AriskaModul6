/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseeventdemo;

import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Ariska
 */
public class MouseEventDemo extends Frame implements
        MouseListener, MouseMotionListener {
    
    TextField tf;
    public MouseEventDemo(String title){
        super(title);
        tf = new TextField(60);
        addMouseListener(this);
    }
    
    public void launchFrame(){
        add(tf, BorderLayout.SOUTH);
        setSize(300, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MouseEventDemo me = new MouseEventDemo("Close Window Example");me.launchFrame();
    }
    
    @Override
    public void mouseMoved(MouseEvent e){
         String mag = "Mouse Moved";
        tf.setText (mag);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String mag = "Mouse Clicked";
        tf.setText(mag);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        String mag = "Mouse Pressed";
        tf.setText(mag);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        String mag = "Mouse Realesed";
        tf.setText(mag);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String mag = "Mouse Entered";
        tf.setText(mag);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        String mag = "Mouse Exited";
        tf.setText(mag);
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        String mag = "Mouse Dragged at" + e.getX() + "," + e.getY();
        tf.setText(mag);
    }
    
}
