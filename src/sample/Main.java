package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    public static int sumaCifara(int a) {
         int suma=0;
         if (a<0) a=-a;
         while(a!=0){
             suma+=a%10;
             a/=10;
         }


         return suma;
    }


    public static void main(String[] args) {

        int a,b;
        String unos = "5 100";
        Scanner tok = new Scanner(unos);
        a= tok.nextInt();
        b= tok.nextInt();

        for(int i=a; i<=b;i++) {
            if(i%sumaCifara(i)==0){
                System.out.println(i);
            }

        }


        System.out.println();

        launch(args);
    }
}
