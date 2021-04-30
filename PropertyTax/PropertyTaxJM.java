/*

CISP1020 - Computer Science II

Assignment - Chapter 12: #4 Property Tax

PropertyTaxJM.java file

Due Date: October 30, 2020

A county collects property taxes on the assessment value of property, which is 60 percent 
of the property’s actual value. If an acre of land is valued at $10,000, its assessment 
value is $6,000. The property tax is then $0.64 for each $100 of the assessment value. 
The tax for the acre assessed at $6,000 will be $38.40. Create a GUI application that 
displays the assessment value and property tax when a user enters the actual value of a 
property.


Student: James Mitchell
Date: October 28, 2020

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


public class PropertyTaxJM extends Application
{

    // Create Fields used in program.
    private TextField inputField;
    private Label actualLabel;
    private Label assessmentLabel;
    private Label taxesLabel;
    private Label actualValueLabel;
    private Label assessedValueLabel;
    private Label taxesAmountLabel;



    public static void main(String[] args)
    {
        // Launch the application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        // Set Main Label.
        Label mainLabel = new Label("Please enter your Properties Actual Value in the box below.\n"
                                 + "When you press calculate you will be presented the following:\n"
                                 + "Your properties Actual Value, it’s Assessed Value, and the\n"
                                 + "amount of Taxes that are owed on the property.\n");
                                 
        // Set Footer Label that explains how values are calculated.
        Label footerLabel = new Label("Assessed Property Value is 60% of Actual Property Value.\n"
                                 + "Taxes are Calculated at $0.64 per $100 of Assessed Property Value.\n"); 

        // SetProperty Value Label control.
        Label actualLabel = new Label("Actual Value: ");

        // Create a TextField for input
        inputField = new TextField();

        // Create a Button Control.
        Button calcButton = new Button("Calculate");

        // Register the event handler.
        calcButton.setOnAction(new CalcButtonHandler());

        // Create Labels to display info.
        Label assessmentLabel = new Label("Assessed Value: ");
        Label taxesLabel = new Label("Tax Amount Due: ");

        // Create emply Labels for results of calculation.
        actualValueLabel = new Label();
        assessedValueLabel = new Label();
        taxesAmountLabel = new Label();

        // Put Main Label and button in an HBox.
        HBox hbox = new HBox(actualLabel, inputField, calcButton);

        // Set the HBox's alignment to center
        hbox.setAlignment(Pos.CENTER);

        // Create a GridPane.
        GridPane gridpane = new GridPane();

        // Add the Labels to the GridPane.
        gridpane.add(actualLabel, 0, 0); // Column 0, Row 0 
        gridpane.add(actualValueLabel, 1, 0); // Column 1, Row 0
        gridpane.add(assessmentLabel, 0, 1); // Column 0, Row 1
        gridpane.add(assessedValueLabel, 1, 1); // Column 1, Row 1
        gridpane.add(taxesLabel, 0, 2); // Column 0, Row 2
        gridpane.add(taxesAmountLabel, 1, 2); // Column 1, Row 2

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
        VBox vbox = new VBox(5, mainLabel, hbox, gridpane, footerLabel);

        // Set VBox's alignment to center.
        vbox.setAlignment(Pos.CENTER);

        // Set VBox's padding to 10 pixels.
        vbox.setPadding(new Insets(10));

        // Create a Scene and set the dimensions.
        Scene scene = new Scene(vbox, 450, 350);
        
        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the stage title.
        primaryStage.setTitle("Property Tax - James Mitchell");

        // Show the window.
        primaryStage.show();
        
    }


    /**
     Event handler class for calcButton
     */

    class CalcButtonHandler implements EventHandler<ActionEvent>
    {

        @Override // Override handle method.
        public void handle(ActionEvent event)
        {
            // Create Variables for Calculation
            double actualValueAmount;
            double assessedValueAmount;
            double taxValueAmount;

            // Get Actual Property Value from User Field
            actualValueAmount = Double.parseDouble(inputField.getText());

            // Calculate Assessed Property Value and Taxes Amount Due
            assessedValueAmount = actualValueAmount * 0.6;
            taxValueAmount = (assessedValueAmount / 100) * 0.64;


            // Display the Results in the previously blank labels.
            actualValueLabel.setText(String.format("$ %,.2f", actualValueAmount));
            assessedValueLabel.setText(String.format("$ %,.2f", assessedValueAmount));
            taxesAmountLabel.setText(String.format("$ %,.2f", taxValueAmount));
        }

    }

}