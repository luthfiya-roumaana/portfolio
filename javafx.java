import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.VBox; 
import javafx.stage.Stage; 
 
public class JavaFXDemo extends Application { 
 
    @Override 
    public void start(Stage primaryStage) { 
        Label nameLabel = new Label("Enter your name:"); 
        TextField nameField = new TextField(); 
        Button greetButton = new Button("Greet Me"); 
        Label outputLabel = new Label(); 
 
        // Event handling using lambda expression 
        greetButton.setOnAction(e -> { 
            String name = nameField.getText(); 
            outputLabel.setText("Hello, " + name + "! Welcome to JavaFX."); 
        }); 
        VBox layout = new VBox(10); 
        layout.setPadding(new Insets(20)); 
        layout.setAlignment(Pos.CENTER); 
        layout.getChildren().addAll(nameLabel, nameField, greetButton, outputLabel); 
 
        Scene scene = new Scene(layout, 350, 200); 
        primaryStage.setTitle("JavaFX GUI Application"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    } 
 
    public static void main(String[] args) { 
        launch(args); 
    } 
}