/*

CISP1020 - Computer Science II

Assignment - Chapter 12: #3 Tip, Tax, and Total

TipTaxTotalJM.java file

Due Date: October 30, 2020

Create a JavaFX application that lets the user enter the food charge for a meal at a restaurant.
When a button is clicked, the application should calculate and display the amount of an 18
percent tip on the total food charge, 7 percent sales tax, and the total of all three amounts.


Student: James Mitchell
Date: October 27, 2020

*/

// Import Classes used from JavaFX Library.
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


public class TipTaxTotalJM extends Application
{

    // Create Fields used in Program
    private TextField inputField;
    private Label mealCostLabel;
    private Label tipResultLabel;
    private Label taxResultLabel;
    private Label totalResultLabel;


    public static void main(String[] args)
    {
        // Launch the application
        launch(args);
    }


    @Override  // Used to Override the "start(abstract)" Method in the Application Class
    public void start(Stage primaryStage)
    {
        // Set Main Label.
        Label mainLabel = new Label("Please enter your meal cost below \n "
                                    + "      to Calculate your total bill.");

        // Set Meal Cost Label control.
        Label costLabel = new Label("Meal: ");

        // Create a TextField for input
        inputField = new TextField();

        // Create a Button Control.
        Button calcButton = new Button("Calculate Bill");

        // Register the event handler.
        calcButton.setOnAction(new CalcButtonHandler());

        // Create Labels to display info.
        Label tipLabel = new Label("Tip 18%: ");
        Label taxLabel = new Label("Tax 7%: ");
        Label totalLabel = new Label("Total: ");

        // Create emply Labels for results.
        mealCostLabel = new Label();
        tipResultLabel = new Label();
        taxResultLabel = new Label();
        totalResultLabel = new Label();

        // Put Main Label and button in an HBox.
        HBox hbox = new HBox(costLabel, inputField);

        // Set the HBox's alignment to center
        hbox.setAlignment(Pos.CENTER);

        // Create a GridPane.
        GridPane gridpane = new GridPane();

        // Add the Labels to the GridPane.
        gridpane.add(costLabel, 0, 0); // Column 0, Row 0
        gridpane.add(mealCostLabel, 1, 0); // Column 1, Row 0
        gridpane.add(tipLabel, 0, 1); // Column 0, Row 1
        gridpane.add(tipResultLabel, 1, 1); // Column 1, Row 1
        gridpane.add(taxLabel, 0, 2); // Column 0, Row 2
        gridpane.add(taxResultLabel, 1, 2); // Column 1, Row 2
        gridpane.add(totalLabel, 0, 3); // Column 0, Row 3
        gridpane.add(totalResultLabel, 1, 3); // Column 1, Row 3

        // Set the gap sizes.
        gridpane.setVgap(10);
        gridpane.setHgap(10);
        
        // Set the Preferred Width of gridpane.
        gridpane.setPrefWidth(300);

        // Set the GridPane's padding.
        gridpane.setPadding(new Insets(30));
        
        // Set GriPane's alignment to center
        gridpane.setAlignment(Pos.CENTER);

        // Create a VBox to hold everything.
        VBox vbox = new VBox(5, mainLabel, hbox, calcButton, gridpane);

        // Set VBox's alignment to center.
        vbox.setAlignment(Pos.CENTER);

        // Set VBox's padding to 10 pixels.
        vbox.setPadding(new Insets(10));


        // Create a Scene.
        Scene scene = new Scene(vbox, 300, 300);


        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the stage title.
        primaryStage.setTitle("Tip, Tax, and Total - James Mitchell");

        // Show the window.
        primaryStage.show();
    }


    /**
     Event handler class for calcButton
     */

    class CalcButtonHandler implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event)
        {
            // Create Variables for calculations
            double mealCost;
            double tip;
            double tax;
            double totalBill;

            // Get mealCost from User Field
            mealCost = Double.parseDouble(inputField.getText());

            // Calculate Tip, Tax, and Total
            tip = mealCost * 0.18;
            tax = mealCost * 0.07;
            totalBill = mealCost + tip + tax;

            // Display the Results.
            mealCostLabel.setText(String.format("$ %,.2f", mealCost));
            tipResultLabel.setText(String.format("$ %,.2f", tip));
            taxResultLabel.setText(String.format("$ %,.2f", tax));
            totalResultLabel.setText(String.format("$ %,.2f", totalBill));


        }

    }

}