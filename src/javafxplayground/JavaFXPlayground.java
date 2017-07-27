/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxplayground;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Paopao
 */
public class JavaFXPlayground extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        
        Line seesaw = new Line(60, 340, 340, 140);
        seesaw.setStroke(Color.BLACK);
        seesaw.setStrokeWidth(15);
        
        Circle cir = new Circle(70, 280, 40);
        cir.setStroke(Color.RED);
        cir.setFill(Color.ORANGE);
        cir.setStrokeWidth(5);
        
        Circle sun = new Circle(-20, -20, 140);
        sun.setStroke(Color.YELLOW);
        sun.setFill(Color.YELLOW);
        
        Line ray = new Line(80, 80, 100, 100);
        ray.setStroke(Color.YELLOW);
        ray.setStrokeWidth(5);
        ray.setFill(Color.YELLOW);

        
        
        Rectangle rec = new Rectangle(240, 90, 80, 70);
        rec.setStroke(Color.GREEN);
        rec.setStrokeWidth(5);
        rec.setFill(Color.YELLOWGREEN);
        
        Line left = new Line(200, 240, 160, 340);
        left.setStrokeWidth(5);
        Line right = new Line(200, 240, 240, 340);
        right.setStrokeWidth(5);
        
        root.getChildren().addAll(seesaw, cir, rec, left, right, sun, ray);
        
        
        
        
                
        
        Scene scene = new Scene(root, 400, 400, Color.SKYBLUE);
        
        primaryStage.setTitle("Playground");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
