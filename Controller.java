package sample;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import org.w3c.dom.events.MouseEvent;

public class Controller implements Initializable{

    private String startGame = "X";
    private int Xcount = 0;
    private int Ocount = 0;

    @FXML
    private Label lblCountX;
    @FXML

    private Label lblCountO;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;


    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnX;

    @FXML
    private Button btnO;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnExit;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
//        gameScore();


    }

    @FXML
    public void handleExit() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("Do you want to exit");

        Optional<ButtonType> result = alert.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK) {
            Platform.exit();
        }

    }

    public void gameScore() {
        lblCountX.setText(String.valueOf(Xcount));
        lblCountO.setText(String.valueOf(Ocount));
    }

    public void choosePlayer() {
        if(startGame.equalsIgnoreCase("X")) {
            startGame="O";

        }else {
            startGame = "X";
        }
    }

    @FXML
    public void handleReset() {
        btn2.setText(null);
        btn1.setText(null);

        btn3.setText(null);

        btn4.setText(null);

        btn5.setText(null);

        btn6.setText(null);

        btn7.setText(null);

        btn8.setText(null);

        btn9.setText(null);

//		btn1.setStyle("-fx-background-color: MediumSeaGreen");
    }

    public void winningGame(){
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        /** XXXXXXXXXXXXXXXXXXXXXXXXXXXX */

        if (b1==("X") && b2==("X") && b3==("X")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player X wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Xcount++;
                gameScore();
                handleReset();
            }

        }
        if (b4==("X") && b6==("X") && b5==("X")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player X wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Xcount++;
                gameScore();
                handleReset();
            }
        }
        if (b3==("X") && b4==("X") && b5==("X")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player X wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Xcount++;
                gameScore();
                handleReset();
            }
        }
        if (b7==("X") && b8==("X") && b9==("X")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player X wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Xcount++;
                gameScore();
                handleReset();
            }
        }
        if (b1==("X") && b4==("X") && b7==("X")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player X wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Xcount++;
                gameScore();
                handleReset();
            }
        }
        if (b2==("X") && b5==("X") && b8==("X")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player X wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Xcount++;
                gameScore();
                handleReset();
            }
        }
        if (b3==("X") && b6==("X") && b9==("X")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player X wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Xcount++;
                gameScore();
                handleReset();
            }
        }
        if (b1==("X") && b5==("X") && b9==("X")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player X wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Xcount++;
                gameScore();
                handleReset();
            }
        }
        if (b3==("X") && b5==("X") && b7==("X")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player X wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Xcount++;
                gameScore();
                handleReset();
            }
        }

        /** OOOOOOOOOOOOOOOOOOOOOOOOOOOOOO*/
        if (b1==("O") && b2==("O") && b3==("O")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player O wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Ocount++;
                gameScore();
                handleReset();
            }
        }
        if (b3==("O") && b4==("O") && b5==("O")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player O wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Ocount++;
                gameScore();
                handleReset();
            }
        }
        if (b7==("O") && b8==("O") && b9==("O")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player O wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Ocount++;
                gameScore();
                handleReset();
            }
        }
        if (b1==("O") && b4==("O") && b7==("O")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player O wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Ocount++;
                gameScore();
                handleReset();
            }
        }
        if (b2==("O") && b5==("O") && b8==("O")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player O wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Ocount++;
                gameScore();
                handleReset();
            }
        }
        if (b3==("O") && b6==("O") && b9==("O")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player O wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Ocount++;
                gameScore();
                handleReset();
            }
        }
        if (b1==("O") && b5==("O") && b9==("O")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player O wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Ocount++;
                gameScore();
                handleReset();
            }
        }
        if (b3==("O") && b5==("O") && b7==("O")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player O wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Ocount++;
                gameScore();
                handleReset();
            }
        }
        if (b4==("O") && b5==("O") && b6==("O")){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Player O wins");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK){
                Ocount++;
                gameScore();
                handleReset();
            }
        }



    }
    @FXML
    public void handleButtons(){
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                btn1.setText(startGame);

                if (startGame.equalsIgnoreCase("X")){
                    btn1.setTextFill(Color.RED);
                }else{
                    btn1.setTextFill(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }

        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                btn2.setText(startGame);

                if (startGame.equalsIgnoreCase("X")){
                    btn2.setTextFill(Color.RED);
                }else{
                    btn2.setTextFill(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }

        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                btn3.setText(startGame);

                if (startGame.equalsIgnoreCase("X")){
                    btn3.setTextFill(Color.RED);
                }else{
                    btn3.setTextFill(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }

        });
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                btn4.setText(startGame);

                if (startGame.equalsIgnoreCase("X")){
                    btn4.setTextFill(Color.RED);
                }else{
                    btn4.setTextFill(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }

        });
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                btn5.setText(startGame);

                if (startGame.equalsIgnoreCase("X")){
                    btn5.setTextFill(Color.RED);
                }else{
                    btn5.setTextFill(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }

        });
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                btn6.setText(startGame);

                if (startGame.equalsIgnoreCase("X")){
                    btn6.setTextFill(Color.RED);
                }else{
                    btn6.setTextFill(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }

        });
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                btn7.setText(startGame);

                if (startGame.equalsIgnoreCase("X")){
                    btn7.setTextFill(Color.RED);
                }else{
                    btn7.setTextFill(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }

        });
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                btn8.setText(startGame);

                if (startGame.equalsIgnoreCase("X")){
                    btn8.setTextFill(Color.RED);
                }else{
                    btn8.setTextFill(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }

        });
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                btn9.setText(startGame);

                if (startGame.equalsIgnoreCase("X")){
                    btn9.setTextFill(Color.RED);
                }else{
                    btn9.setTextFill(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }

        });
    }
}
