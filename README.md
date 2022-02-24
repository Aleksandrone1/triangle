# triangle
package sample;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

 public class Main extends Application {
public void start(Stage stage) {
        Button button = new Button("Кнопка для создания фигуры");
        button.setMinWidth(220.0);
        button.setMaxWidth(190.0);
        button.setTextFill(Color.DARKBLUE);
        Button button1 = new Button("Кнопка для удаления фигуры");
        button1.setMinWidth(220.0);
        button1.setMaxWidth(190.0);
        button1.setTextFill(Color.DARKBLUE);
        Button button2 = new Button("Кнопка для перемещения фигуры");
        button2.setMinWidth(220.0);
        button2.setMaxWidth(190.0);
        button2.setTextFill(Color.DARKBLUE);
        Button button3 = new Button("Кнопка для поворота треугольника");
        button3.setMinWidth(220.0);
        button3.setMaxWidth(190.0);
        button3.setTextFill(Color.DARKBLUE);
        Button button4 = new Button("Инструкция");
        button4.setMinWidth(220.0);
        button4.setMaxWidth(190.0);
        button4.setTextFill(Color.DARKBLUE);
        button3.setTextFill(Color.DARKBLUE);
        Button button5 = new Button("Вычисление площади ");
        button5.setMinWidth(220.0);
        button5.setMaxWidth(190.0);
        button5.setTextFill(Color.DARKBLUE);
        Label label1=new Label("Напишите три координаты x,y,z для перемещения. :");
        AnchorPane.setBottomAnchor(label1,350.0);
        AnchorPane.setLeftAnchor(label1, 400.0);
        AnchorPane.setTopAnchor(label1, 100.0);
        Label label2=new Label("Напишите угол :");
        AnchorPane.setBottomAnchor(label2,150.0);
        AnchorPane.setLeftAnchor(label2, 600.0);
        AnchorPane.setTopAnchor(label2, 350.0);
        Label label3=new Label("Напишите 6 координат:");
        AnchorPane.setTopAnchor(label3, 10.0);
        AnchorPane.setLeftAnchor(label3, 550.0);
        AnchorPane.setBottomAnchor(label3, 650.0);
        Label label4=new Label("Вывод площади:");
        AnchorPane.setTopAnchor(label4, 600.0);
        AnchorPane.setLeftAnchor(label4, 600.0);
        AnchorPane.setBottomAnchor(label4, 100.0);

        TextField textField = new TextField();
        AnchorPane.setTopAnchor(textField, 10.0);
        AnchorPane.setLeftAnchor(textField, 700.0);
        AnchorPane.setBottomAnchor(textField, 700.0);
        TextField textField1 = new TextField();
        AnchorPane.setBottomAnchor(textField1,450.0);
        AnchorPane.setLeftAnchor(textField1, 700.0);
        AnchorPane.setTopAnchor(textField1, 250.0);
        TextField textField2 = new TextField();
        AnchorPane.setBottomAnchor(textField2,250.0);
        AnchorPane.setLeftAnchor(textField2, 700.0);
        AnchorPane.setTopAnchor(textField2, 450.0);
        TextField textField3 = new TextField();
        AnchorPane.setBottomAnchor(textField3,100.0);
        AnchorPane.setLeftAnchor(textField3, 700.0);
        AnchorPane.setTopAnchor(textField3, 600.0);
        VBox vBox = new VBox();
        AnchorPane.setBottomAnchor(vBox,50.0);
        AnchorPane.setLeftAnchor(vBox, 200.0);
        AnchorPane.setTopAnchor(vBox, 400.0);
        VBox vBox1 = new VBox(10,button1,button,button2,button3,button4,button5);
        AnchorPane anchorPane= new AnchorPane();
        button.setOnAction(event->{
                String s=textField.getText();
                String [] s0=s.split(" ");
               double[] a=new double[s0.length];
               try {
                       for (int i = 0; i < s0.length; i++) {
                               a[i] = Double.parseDouble(s0[i]);
                       }

                               Triangle triangle = new Triangle(a[0], a[1], a[2], a[3], a[4], a[5]);
                               vBox.getChildren().addAll(triangle.rotate1());
               }catch (Exception e) {
                       textField.setText("Введите восем цифр для создания фигуры. Пример 0.0");
               }
        });
        button1.setOnAction(event->{
                vBox.getChildren().clear();
        });
        button2.setOnAction(event-> {
                        String s = textField.getText();
                        String[] s0 = s.split(" ");
                        double[] a = new double[s0.length];
                        for (int i = 0; i < s0.length; i++) {
                                a[i] = Double.parseDouble(s0[i]);
                        }
                        Triangle triangle = new Triangle(a[0], a[1], a[2], a[3], a[4], a[5]);
                String s1 = textField1.getText();
                String[] s3 = s1.split(" ");
                int [] a1 = new int [s3.length];
                try {
                        for (int i = 0; i < s3.length; i++) {
                                a1[i] = Integer.parseInt(s3[i]);
                        }
                        vBox.getChildren().addAll(triangle.translate1(a1[0], a1[1], a1[2]));
                }catch (Exception e){
                        textField1.setText("Введите три символа. Пример 0 0 0");
                }
                });
        button3.setOnAction(event->{
                String s = textField.getText();
                String[] s0 = s.split(" ");
                double[] a = new double[s0.length];
                try {
                for (int i = 0; i < s0.length; i++) {
                        a[i] = Double.parseDouble(s0[i]);
                }
                Triangle triangle = new Triangle(a[0], a[1], a[2], a[3], a[4], a[5]);
                String s6=textField2.getText();
                int f=Integer.parseInt(s6);
                vBox.getChildren().addAll(triangle.rotate2(f));
                } catch (Exception e){
                        textField1.setText("Введите три символа. Пример 0 0 0");
                }
        });
        button4.setOnAction(event->{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Инструкция");
                alert.setHeaderText("Для начала необходимо указать восемь координат. Вы можете удалять и изменять данные.Если хотите изменить фигуру то удалите старую и введите новые координатыю Либо появится две фигуры.Можете изменять и перемещать.Не забывайте удалять");
                alert.setContentText("  Удачи!!");
                alert.show();
        });
        button5.setOnAction(event-> {
                String s = textField.getText();
                String[] s0 = s.split(" ");
                double[] a = new double[s0.length];
                try {
                        for (int i = 0; i < s0.length; i++) {
                                a[i] = Double.parseDouble(s0[i]);
                        }
                        Triangle triangle = new Triangle(a[0], a[1], a[2], a[3], a[4], a[5]);
                        triangle.S();

                        textField3.setText(String.valueOf(triangle.S()));
                }catch (Exception e){
                        textField3.setText("Отсутсвуют данные");
                }
        });
                AnchorPane root1 = new AnchorPane(vBox,vBox1,
                        textField,label1,textField1,textField2,label2,label3,textField3,label4);
        Scene scene = new Scene(root1,900,800);
        stage.setScene(scene);
        stage.setTitle("Треугольник");
        stage.show();
        }

public static void main(String[] args) {
        launch(args);
        }
        }
package sample;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

 public class Main extends Application {
public void start(Stage stage) {
        Button button = new Button("Кнопка для создания фигуры");
        button.setMinWidth(220.0);
        button.setMaxWidth(190.0);
        button.setTextFill(Color.DARKBLUE);
        Button button1 = new Button("Кнопка для удаления фигуры");
        button1.setMinWidth(220.0);
        button1.setMaxWidth(190.0);
        button1.setTextFill(Color.DARKBLUE);
        Button button2 = new Button("Кнопка для перемещения фигуры");
        button2.setMinWidth(220.0);
        button2.setMaxWidth(190.0);
        button2.setTextFill(Color.DARKBLUE);
        Button button3 = new Button("Кнопка для поворота треугольника");
        button3.setMinWidth(220.0);
        button3.setMaxWidth(190.0);
        button3.setTextFill(Color.DARKBLUE);
        Button button4 = new Button("Инструкция");
        button4.setMinWidth(220.0);
        button4.setMaxWidth(190.0);
        button4.setTextFill(Color.DARKBLUE);
        button3.setTextFill(Color.DARKBLUE);
        Button button5 = new Button("Вычисление площади ");
        button5.setMinWidth(220.0);
        button5.setMaxWidth(190.0);
        button5.setTextFill(Color.DARKBLUE);
        Label label1=new Label("Напишите три координаты x,y,z для перемещения. :");
        AnchorPane.setBottomAnchor(label1,350.0);
        AnchorPane.setLeftAnchor(label1, 400.0);
        AnchorPane.setTopAnchor(label1, 100.0);
        Label label2=new Label("Напишите угол :");
        AnchorPane.setBottomAnchor(label2,150.0);
        AnchorPane.setLeftAnchor(label2, 600.0);
        AnchorPane.setTopAnchor(label2, 350.0);
        Label label3=new Label("Напишите 6 координат:");
        AnchorPane.setTopAnchor(label3, 10.0);
        AnchorPane.setLeftAnchor(label3, 550.0);
        AnchorPane.setBottomAnchor(label3, 650.0);
        Label label4=new Label("Вывод площади:");
        AnchorPane.setTopAnchor(label4, 600.0);
        AnchorPane.setLeftAnchor(label4, 600.0);
        AnchorPane.setBottomAnchor(label4, 100.0);

        TextField textField = new TextField();
        AnchorPane.setTopAnchor(textField, 10.0);
        AnchorPane.setLeftAnchor(textField, 700.0);
        AnchorPane.setBottomAnchor(textField, 700.0);
        TextField textField1 = new TextField();
        AnchorPane.setBottomAnchor(textField1,450.0);
        AnchorPane.setLeftAnchor(textField1, 700.0);
        AnchorPane.setTopAnchor(textField1, 250.0);
        TextField textField2 = new TextField();
        AnchorPane.setBottomAnchor(textField2,250.0);
        AnchorPane.setLeftAnchor(textField2, 700.0);
        AnchorPane.setTopAnchor(textField2, 450.0);
        TextField textField3 = new TextField();
        AnchorPane.setBottomAnchor(textField3,100.0);
        AnchorPane.setLeftAnchor(textField3, 700.0);
        AnchorPane.setTopAnchor(textField3, 600.0);
        VBox vBox = new VBox();
        AnchorPane.setBottomAnchor(vBox,50.0);
        AnchorPane.setLeftAnchor(vBox, 200.0);
        AnchorPane.setTopAnchor(vBox, 400.0);
        VBox vBox1 = new VBox(10,button1,button,button2,button3,button4,button5);
        AnchorPane anchorPane= new AnchorPane();
        button.setOnAction(event->{
                String s=textField.getText();
                String [] s0=s.split(" ");
               double[] a=new double[s0.length];
               try {
                       for (int i = 0; i < s0.length; i++) {
                               a[i] = Double.parseDouble(s0[i]);
                       }

                               Triangle triangle = new Triangle(a[0], a[1], a[2], a[3], a[4], a[5]);
                               vBox.getChildren().addAll(triangle.rotate1());
               }catch (Exception e) {
                       textField.setText("Введите восем цифр для создания фигуры. Пример 0.0");
               }
        });
        button1.setOnAction(event->{
                vBox.getChildren().clear();
        });
        button2.setOnAction(event-> {
                        String s = textField.getText();
                        String[] s0 = s.split(" ");
                        double[] a = new double[s0.length];
                        for (int i = 0; i < s0.length; i++) {
                                a[i] = Double.parseDouble(s0[i]);
                        }
                        Triangle triangle = new Triangle(a[0], a[1], a[2], a[3], a[4], a[5]);
                String s1 = textField1.getText();
                String[] s3 = s1.split(" ");
                int [] a1 = new int [s3.length];
                try {
                        for (int i = 0; i < s3.length; i++) {
                                a1[i] = Integer.parseInt(s3[i]);
                        }
                        vBox.getChildren().addAll(triangle.translate1(a1[0], a1[1], a1[2]));
                }catch (Exception e){
                        textField1.setText("Введите три символа. Пример 0 0 0");
                }
                });
        button3.setOnAction(event->{
                String s = textField.getText();
                String[] s0 = s.split(" ");
                double[] a = new double[s0.length];
                try {
                for (int i = 0; i < s0.length; i++) {
                        a[i] = Double.parseDouble(s0[i]);
                }
                Triangle triangle = new Triangle(a[0], a[1], a[2], a[3], a[4], a[5]);
                String s6=textField2.getText();
                int f=Integer.parseInt(s6);
                vBox.getChildren().addAll(triangle.rotate2(f));
                } catch (Exception e){
                        textField1.setText("Введите три символа. Пример 0 0 0");
                }
        });
        button4.setOnAction(event->{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Инструкция");
                alert.setHeaderText("Для начала необходимо указать восемь координат. Вы можете удалять и изменять данные.Если хотите изменить фигуру то удалите старую и введите новые координатыю Либо появится две фигуры.Можете изменять и перемещать.Не забывайте удалять");
                alert.setContentText("  Удачи!!");
                alert.show();
        });
        button5.setOnAction(event-> {
                String s = textField.getText();
                String[] s0 = s.split(" ");
                double[] a = new double[s0.length];
                try {
                        for (int i = 0; i < s0.length; i++) {
                                a[i] = Double.parseDouble(s0[i]);
                        }
                        Triangle triangle = new Triangle(a[0], a[1], a[2], a[3], a[4], a[5]);
                        triangle.S();

                        textField3.setText(String.valueOf(triangle.S()));
                }catch (Exception e){
                        textField3.setText("Отсутсвуют данные");
                }
        });
                AnchorPane root1 = new AnchorPane(vBox,vBox1,
                        textField,label1,textField1,textField2,label2,label3,textField3,label4);
        Scene scene = new Scene(root1,900,800);
        stage.setScene(scene);
        stage.setTitle("Треугольник");
        stage.show();
        }

public static void main(String[] args) {
        launch(args);
        }
        }
