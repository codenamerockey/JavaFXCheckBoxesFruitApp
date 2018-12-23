package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.EventListener;


public class Main extends Application implements EventHandler {
    private Label title, response, selected;

    private CheckBox bananaCB, grapeFruitCB, mangoCB, strawberriesCB, pineappleCB, applesCB;
    private String fruits;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Favorite Fruit");
        title = new Label("What fruits do you like?");
        response = new Label("");
        selected = new Label("");
        bananaCB = new CheckBox("Banana");
        grapeFruitCB = new CheckBox("Grapefruit");
        mangoCB = new CheckBox("Mango");
        strawberriesCB = new CheckBox("Strawberries");
        pineappleCB = new CheckBox("Pineapple");
        applesCB = new CheckBox("Apple");


        //Set up the Stage and Scene

        FlowPane flowPaneRoot = new FlowPane(Orientation.VERTICAL, 5, 5);
        flowPaneRoot.setAlignment(Pos.CENTER);


        // We add all of our controls
        flowPaneRoot.getChildren().add(title);
        // This allows you to add all your nodes, but they must be in order of how you instantiated them.
        flowPaneRoot.getChildren().addAll(bananaCB, grapeFruitCB, mangoCB, strawberriesCB,
                pineappleCB, applesCB, response, selected);

        // Attach eventListeners to our CheckBoxes you first implement the interface Event Handler then register checkboxes

        bananaCB.setOnAction(this);
        grapeFruitCB.setOnAction(this);
        mangoCB.setOnAction(this);
        strawberriesCB.setOnAction(this);
        pineappleCB.setOnAction(this);
        applesCB.setOnAction(this);


        Scene scene = new Scene(flowPaneRoot, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();


        showAll();
    }

    void showAll() {
        fruits = "";
        if (bananaCB.isSelected()) fruits += " Banana";
        if (grapeFruitCB.isSelected()) fruits += ", Grapefruit";
        if (mangoCB.isSelected()) fruits += ", Mango";
        if (strawberriesCB.isSelected()) fruits += ", Strawberries";
        if (pineappleCB.isSelected()) fruits += ", Pineapple";
        if (applesCB.isSelected()) fruits += ", Apple";

        selected.setText("Fruits selected: " + fruits);
    }


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void handle(Event event) {
        Object fruitChecked = event.getSource();
        if (bananaCB.equals(fruitChecked)) {
            if (bananaCB.isSelected()) {
                response.setText("Banana Selected");
            } else {
                response.setText("Banana Cleared! ");
            }
            showAll();
        }

        if (grapeFruitCB.equals(fruitChecked)) {
            if (grapeFruitCB.isSelected()) {
                response.setText("Grapefruit Selected");
            } else {
                response.setText("Grapefruit Cleared! ");
            }
            showAll();
        }

        if (mangoCB.equals(fruitChecked)) {
            if (mangoCB.isSelected()) {
                response.setText("Mango Selected");
            } else {
                response.setText("Mango Cleared! ");
            }
            showAll();
        }

        if (strawberriesCB.equals(fruitChecked)) {
            if (strawberriesCB.isSelected()) {
                response.setText("Strawberries Selected");
            } else {
                response.setText("Strawberries Cleared! ");
            }
            showAll();
        }

        if (pineappleCB.equals(fruitChecked)) {
            if (pineappleCB.isSelected()) {
                response.setText("Pineapple Selected");
            } else {
                response.setText("Pineapple Cleared! ");
            }
            showAll();
        }

        if (applesCB.equals(fruitChecked)) {
            if (applesCB.isSelected()) {
                response.setText("Apple Selected");
            } else {
                response.setText("Apple Cleared! ");
            }
            showAll();
        }
    }
}
