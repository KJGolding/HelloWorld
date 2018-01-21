package javafx_helloworld;

/**
 * @Author Name: Kimberly Golding
 * @Date: Jun 16, 2017
 * @Description: Hello World Output for First GitHub Repository
 */
//Imports 
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

//Begin Class JavaFX_HelloWorld 
public class JavaFX_HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Create VBox
        VBox v = new VBox();
        v.setAlignment(Pos.CENTER);

        //Create text & set characteristics
        Text heading = new Text("Hello World!");
        heading.setFont(Font.font("SansSerif", FontWeight.BOLD,
                FontPosture.ITALIC, 75));
        heading.setFill(Color.web("#B200A0"));
        heading.setStrokeWidth(1.5);
        heading.setStroke(Color.web("#FF70F0"));

        //Create text & set characteristics
        Text note = new Text("This is my first GitHub repository!");
        note.setFont(Font.font("SansSerif", 40));

        //Add text to VBox
        v.getChildren().addAll(heading, note);
        
        //Animation
        FadeTransition ft = new FadeTransition();
        ft.setDuration(Duration.millis(4000));
        ft.setNode(heading);
        ft.setFromValue(0.1);
        ft.setToValue(1.0);
        ft.setCycleCount(3);
        ft.play(); // Start animation
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(v, 750, 500);
        primaryStage.setTitle("Hello World!"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.centerOnScreen();
        primaryStage.show(); // Display the stage
    }
} //End Class JavaFX_HelloWorld
