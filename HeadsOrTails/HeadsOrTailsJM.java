/*

CISP1020 - Computer Science II

Assignment - Chapter 12: #5 Heads or Tails

HeadsOrTailsJM.java file

Due Date: October 30, 2020

Create a JavaFX application that simulates a coin being tossed.
When the user clicks a button, the application should generate a random number 
in the range of 0 to 1. If the number is 0, the coin has landed on “heads,” and 
if the number is 1, the coin has landed on “tails.” Use an ImageView control, 
and the coin images in this book’s Student Sample Programs to display the side of 
the coin when it is tossed.


Student: James Mitchell
Date: October 30, 2020

*/

// Import Classes used from JavaFX Library.
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import java.util.Random; // For random number.


public class HeadsOrTailsJM extends Application
{

    // Create Fields used in program.
    private Label mainLabel;
    private Label resultLabel;
    
    // Create Image components.
    // Images are located inside "Coins" folder.
    private Image headsImage = new Image("file:Coins\\Heads2.bmp");
    private Image tailsImage = new Image("file:Coins\\Tails2.bmp");
        
    // Create ImageView component.
    private ImageView coinIView;
    

    // Main method.
    public static void main(String[] args)
    {
        // Launch the application
        launch(args);
    }


   // Override the start method in the stage library
    @Override
    public void start(Stage primaryStage)
    {
        // Set Main Label.
        mainLabel = new Label("Play Heads or Tails by flipping a coin!");

        // Create a Button Control.
        Button flipButton = new Button("Flip Coin");

        // Register the event handler.
        flipButton.setOnAction(new FlipButtonHandler());
        
        // Create an empty Label for result of Heads or Tails
        resultLabel = new Label();
        
        // Create ImageView component.
        // Beginning with no image.
        coinIView = new ImageView();
        
        // Set coinIView size and preserve aspect ration.
        coinIView.setFitWidth(200);
        coinIView.setPreserveRatio(true);

        // Create a VBox to hold everything.
        VBox vbox = new VBox(10, mainLabel, flipButton, coinIView, resultLabel);

        // Set VBox's alignment to center.
        vbox.setAlignment(Pos.CENTER);

        // Set VBox's padding to 10 pixels.
        vbox.setPadding(new Insets(10));

        // Create a Scene.
        Scene scene = new Scene(vbox, 300, 400);

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the stage title.
        primaryStage.setTitle("Heads or Tails - James Mitchell");

        // Show the window.
        primaryStage.show();
    }


    /**
     Event handler class for flipButton
     */

    class FlipButtonHandler implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event)
        {
            // Create an instance of Random Class.
            Random rand = new Random();
            
            // Generate a random number 0 or 1.
            int randomNum = rand.nextInt(2);
            
            // If statement to change image.
            if (randomNum == 0) // If randomNum is 0(heads). else: randomNum is 1(tails).
            {
               // Set coinIView to headsImage.
               coinIView.setImage(headsImage);
               
               // Display the Results of coin flip in text.
               resultLabel.setText("Heads");
            } 
            else 
            { 
               // Set coinIView to tailsImage.
               coinIView.setImage(tailsImage);
               
               // Display the Results of coin flip in text.
               resultLabel.setText("Tails");
            }

        }

    }

}