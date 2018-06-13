/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bounceboxapp;

import bouncebox.BounceBox;
import bouncebox.Circle;
import bouncebox.Square;
import bounceboxframework.Shape;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author p0073862
 */
public class Main extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //setUpDemo1();
        //For practical exercises, comment out the line above, and uncomment the one
        //below        
        //simpleDemo();
        //exercise3();
        //exercise4();
        //exercise5();
        exercise6();
    }

    public static void setUpDemo1() {
        BounceBox box = new BounceBox(700, 500);

        Circle c1 = new Circle(20, 50, 20);
        c1.setColor(Color.BLUE);
        c1.setVelocity(100, 0);

        Circle c2 = new Circle(300, 50, 20);
        c2.setColor(Color.CYAN);
        Circle c3 = new Circle(360, 50, 20);
        c3.setColor(Color.MAGENTA);
        Circle c4 = new Circle(420, 50, 20);
        c4.setColor(Color.ORANGE);
        Circle c5 = new Circle(480, 50, 20);
        c5.setColor(Color.PINK);
        Circle c6 = new Circle(540, 50, 20);
        c6.setColor(Color.RED);
        Circle c7 = new Circle(400, 440, 40);
        c7.setColor(Color.CYAN);
        c7.setVelocity(30, 30);

        Circle c8 = new Circle(300, 440, 40);
        c8.setColor(Color.BLUE);
        c8.setVelocity(30, 20);

        Circle c9 = new Circle(500, 440, 40);
        c9.setColor(Color.GREEN);
        c9.setVelocity(-20, 30);

        Circle c10 = new Circle(120, 50, 20);
        c10.setColor(Color.CYAN);
        Circle c11 = new Circle(180, 50, 20);
        c11.setColor(Color.ORANGE);
        Circle c12 = new Circle(240, 50, 20);
        c12.setColor(Color.PINK);

        Square s1 = new Square(120, 120, 40);
        s1.setColor(Color.BLUE);
        s1.setVelocity(30, 20);

        Square s2 = new Square(240, 120, 40);
        s2.setColor(Color.GREEN);
        s2.setVelocity(-20, 30);

        //c2.setVelocity(-100,0);
        box.addShape(c1);
        box.addShape(c2);
        box.addShape(c3);
        box.addShape(c4);
        box.addShape(c5);
        box.addShape(c6);
        box.addShape(c7);
        box.addShape(c8);
        box.addShape(c9);
        box.addShape(c10);
        box.addShape(c11);
        box.addShape(c12);

        box.addShape(s1);
        box.addShape(s2);

        box.start();
    }

    public static void simpleDemo() throws FileNotFoundException {
        BounceBox box = new BounceBox(700, 500);
        
        Circle c1 = new Circle(40, 50, 40);
        c1.setColor(Color.BLUE);
        c1.setVelocity(100, 0);
        
        Square s1 = new Square(560, 45, 50);
        s1.setColor(Color.RED);
        s1.setVelocity(100, 0);
        
        box.addShape(c1);
        
        box.addShape(s1);
        
        box.start();
    }

    public static void exercise3() throws FileNotFoundException {
        BounceBox box = new BounceBox(700, 500);
        FileInputStream fileln = new FileInputStream("ex3.txt");
        Scanner scan = new Scanner(fileln);
        while(scan.hasNext()) {
          int x = scan.nextInt();
          int y = scan.nextInt();
          int radius = scan.nextInt();
          int vx = scan.nextInt();
          int vy = scan.nextInt();
          Circle c1 = new Circle(x,y,radius);
          c1.setColor(Color.BLACK);
          c1.setVelocity(vx,vy);
          box.addShape(c1);
        }
        
        box.start();
        
    }
    
    public static void exercise4() throws FileNotFoundException {
        BounceBox box = new BounceBox(700, 500);
        FileInputStream fileln = new FileInputStream("ex4.txt");
        Scanner scan = new Scanner(fileln);
        while (scan.hasNext()) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int size = scan.nextInt();
            int vx = scan.nextInt();
            int vy = scan.nextInt();
            Shape shape = null;
            switch (type) {
                case "Circle":
                    shape = new Circle(x,y,size);
                    break;
                case "Square":
                    shape = new Square(x,y,size);
                    
             }
          if(shape !=null) {
            shape.setVelocity(vx, vy);
            box.addShape(shape);
         }
         //box.start();
        
       }
       box.start();
    }
        
    public static void exercise5() throws FileNotFoundException {
        BounceBox box = new BounceBox(700, 500);
        FileInputStream fileln = new FileInputStream("ex5a.txt");
        Scanner scan = new Scanner(fileln);
        while (scan.hasNext()) {
            String type = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int size = scan.nextInt();
            Shape shape = null;
            switch (type) {
                case "Circle":
                    shape = new Circle(x, y, size);
                    break;
                case "Square":
                    shape = new Square(x, y, size);
            }
            if (shape != null) {
                if (scan.hasNext()) {
                    int vx = scan.nextInt();
                    int vy = scan.nextInt();
                    shape.setVelocity(vx, vy);
                }
                
                box.addShape(shape);
            }
        }
        box.start();
    }
    
    public static void exercise6() throws FileNotFoundException {
        BounceBox box = new BounceBox(700, 500);
        FileInputStream fileln = new FileInputStream("ex6a.txt");
        Scanner scan = new Scanner(fileln);
        while (scan.hasNext()) {
            String type = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int size = scan.nextInt();
            Shape shape = null;
            switch (type) {
                case "Circle":
                    shape = new Circle(x, y, size);
                    break;
                case "Square":
                    shape = new Square(x, y, size);
            }
            if (shape != null) {
                if (scan.hasNext()) {
                    int vx = scan.nextInt();        
                    int vy = scan.nextInt();
                    shape.setVelocity(vx,vy);
                    if (scan.hasNextInt()) {
                        int red = scan.nextInt();
                        int green = scan.nextInt();
                        int blue = scan.nextInt();
                        shape.setColor(red,green,blue);
                    }
                }
                box.addShape(shape);
            }
        }
        box.start();
    }   
}
