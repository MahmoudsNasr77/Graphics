/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myframe;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;

/**
 *
 * @author SaWa
 */
public class MyFrame extends Frame {

    public void paint(Graphics g) {
        Graphics2D g2d1 = (Graphics2D) g;
        GeneralPath gp1 = new GeneralPath();
        GeneralPath gp2 = new GeneralPath();
        GeneralPath gp3 = new GeneralPath();

        g2d1.setColor(Color.BLUE);
        g2d1.fillRect(0, 0, 1000, 600);
        g2d1.setColor(Color.orange);
        g2d1.fillOval(436, 360, 150, 150);
        g2d1.setColor(Color.white);
        g2d1.fillOval(30, 70, 90, 40);
        g2d1.fillOval(70, 70, 90, 40);
        g2d1.fillOval(40, 60, 50, 50);
        g2d1.fillOval(90, 60, 50, 50);
        g2d1.fillOval(210, 90, 90, 40);
        g2d1.fillOval(250, 90, 90, 40);
        g2d1.fillOval(220, 80, 50, 50);
        g2d1.fillOval(270, 80, 50, 50);
        g2d1.fillOval(820, 50, 90, 40);
        g2d1.fillOval(860, 50, 90, 40);
        g2d1.fillOval(830, 40, 50, 50);
        g2d1.fillOval(880, 40, 50, 50);

        g2d1.setColor(Color.red);
        g2d1.fillRect(100, 300, 150, 50);
        g2d1.setColor(Color.WHITE);

        g2d1.fillRect(100, 350, 150, 50);

        g2d1.setColor(Color.BLACK);
        g2d1.fillRect(0, 570, 1000, 200);
        gp1.moveTo(600, 450);
        g2d1.setColor(Color.WHITE);
        for (int i = 0; i < 80; i++) {
            for (int j = 10; j < 1000; j += 100) {
                g2d1.fillRect(j, 620, 60, 5);
            }
        }
        gp1.moveTo(20, 570);
        gp1.quadTo(320, 120, 520, 510);
        gp1.quadTo(720, 10, 1000, 570);
        g2d1.setColor(Color.DARK_GRAY);
        g2d1.fill(gp1);

        g2d1.setColor(Color.red);
        g2d1.fillRect(100, 300, 150, 50);
        g2d1.setColor(Color.WHITE);
        g2d1.fillRect(100, 350, 150, 50);
        gp2.moveTo(103, 360);
        gp2.lineTo(95, 570);
        g2d1.draw(gp2);

        g2d1.setColor(Color.BLUE);

        g2d1.setColor(Color.green);
        g2d1.fillOval(720, 480, 30, 40);
        g2d1.fillOval(710, 470, 30, 30);
        g2d1.fillOval(730, 470, 30, 30);
        g2d1.fillRect(730, 510, 9, 60);

        g2d1.fillOval(820, 480, 30, 40);
        g2d1.fillOval(810, 470, 30, 30);
        g2d1.fillOval(830, 470, 30, 30);
        g2d1.fillRect(830, 510, 9, 60);

        g2d1.fillOval(670, 580, 30, 40);
        g2d1.fillOval(660, 570, 30, 30);
        g2d1.fillOval(680, 570, 30, 30);
        g2d1.fillRect(680, 610, 9, 60);

        g2d1.fillOval(610, 580, 30, 40);
        g2d1.fillOval(600, 570, 30, 30);
        g2d1.fillOval(620, 570, 30, 30);
        g2d1.fillRect(620, 610, 9, 60);

        g2d1.setColor(Color.blue);
        g2d1.fillRect(210, 600, 100, 30);
        g2d1.fillOval(210, 575, 100, 45);
        g2d1.fillArc(180, 593, 60, 70, 0, 180);
        g2d1.fillArc(285, 593, 60, 70, 0, 180);

        g2d1.setColor(Color.BLACK);
        g2d1.fillOval(200, 610, 30, 30);
        g2d1.fillOval(300, 610, 30, 30);
        g2d1.setColor(Color.white);
        g2d1.fillOval(204, 614, 20, 20);
        g2d1.fillOval(304, 614, 20, 20);

        g2d1.setColor(Color.black);
        g2d1.fillArc(234, 581, 64, 36, 0, 90);

        g2d1.setColor(Color.black);
        g2d1.fillArc(223, 581, 68, 36, 90, 90);

        g2d1.setColor(Color.gray);
        g2d1.fillRect(0, 670, 1000, 500);

        g2d1.setColor(Color.GREEN);
        int s = 20;
        int t = 50;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                s += 32;
                g2d1.fillArc(s, 900, 40, 40, 0, 360);
                if (j == 3) {
                    s += 50;
                }
            }
            for (int q = 1; q <= 5; q++) {
                for (int k = 1; k <= 2; k++) {
                    t += 25;
                    g2d1.fillArc(t, 875, 40, 40, 0, 380);
                    if (k == 2) {
                        t += 95;
                    }

                }
            }
        }

        g2d1.setColor(Color.WHITE);
        g2d1.fillRect(800, 800, 200, 150);
        g2d1.setColor(Color.BLACK);
        g2d1.drawString("Name : Mahmoud", 850, 890);
        g2d1.drawString("Section : 19", 850, 920);

    }

    public static void main(String[] args) {
        MyFrame fram1 = new MyFrame();
        fram1.setSize(1000, 1000);
        fram1.setVisible(true);
    }

}
