package sample;

import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

import static sample.Main.sumaCifara;

public class Controller {


    public TextField textField1;
    public TextField textField2;
    public TextField resultField3;


    public void ispisi(javafx.event.ActionEvent actionEvent) {
        int a = Integer.parseInt(textField1.getText());
        int b = Integer.parseInt(textField2.getText());
        String result = "";
        for(int i=a;i<b;i++){
            if(i%sumaCifara(i)==0){
                result=result+i+" ";

            }else result=result+i+" ";
        }


        resultField3.setText(result);
    }
}
