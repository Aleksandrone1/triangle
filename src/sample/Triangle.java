package sample;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;

public class Triangle extends Main {
    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;
    Triangle(double x1, double y1,double x2,double y2,double x3,double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    public Node rotate1() {
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(x1, y1,  x2, y2,x3, y3);
        triangle.setFill(Color.WHITE);
        triangle.setStroke(Color.RED);
        return  triangle;
    }
    public Node translate1(int x,int y,int z){
        Translate translate = new Translate();
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(x1, y1, x2, y2, x3, y3);
        triangle.setFill(Color.WHITE);
        triangle.setStroke(Color.RED);
        translate.setX(x);
        translate.setY(y);
        translate.setZ(z);
        triangle.getTransforms().addAll(translate);
        return triangle;
    }
    public  Node rotate2(int l){
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(x1, y1, x2, y2, x3, y3);
        triangle.setFill(Color.WHITE);
        triangle.setStroke(Color.RED);
        Rotate rotate = new Rotate();
        rotate.setAngle(l);
        rotate.setPivotX(150);
        rotate.setPivotY(100);
        triangle.getTransforms().addAll(rotate);
        return  triangle;
    }
    public  double S(){
        return 0.5 * Math.abs(((x2 - x1) * (y3 - y1) - ((x3 - x1) * (y2-y1))));
    }
}
