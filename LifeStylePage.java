import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LifeStylePage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("E-Commerce Home Page");

        VBox mainLayout = new VBox(120);
        mainLayout.setPadding(new Insets(40));

        Label titleLabel = new Label("Life Style");
        titleLabel.setStyle("-fx-font-size: 28px; -fx-font-weight: bold;");

        HBox firstProductRow = createProductRow1();
        HBox secondProductRow = createProductRow2();

        mainLayout.getChildren().addAll(titleLabel, firstProductRow, secondProductRow);

        Scene scene = new Scene(mainLayout, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private HBox createProductRow1() {
        HBox productRow = new HBox(100);
        productRow.setAlignment(Pos.CENTER);
        Random random = new Random();

        VBox productBox1 = createProductBox("Child.jpg", "ChildWear", "Rs: " + (10 + random.nextInt(100000)) + "." + random.nextInt(100));
        VBox productBox2 = createProductBox("Jeans.jpg", "JeansSet", "Rs: " + (10 + random.nextInt(100000)) + "." + random.nextInt(100));
        VBox productBox3 = createProductBox("Jacket.webp", "JacketSet", "Rs: " + (10 + random.nextInt(100000)) + "." + random.nextInt(100));

        productRow.getChildren().addAll(productBox1, productBox2, productBox3);

        return productRow;
    }

    private HBox createProductRow2() {
        HBox productRow1 = new HBox(100);
        productRow1.setAlignment(Pos.CENTER);
        Random random = new Random();

        VBox productBox1 = createProductBox("Kurtas.webp", "Kurta", "Rs: " + (10 + random.nextInt(100000)) + "." + random.nextInt(100));
        VBox productBox2 = createProductBox("Thsirts.jpg", "Tshirt", "Rs: " + (10 + random.nextInt(100000)) + "." + random.nextInt(100));
        VBox productBox3 = createProductBox("Core2Web Special.jpg", "Core2Web Premium", "Rs: " + (10 + random.nextInt(100000)) + "." + random.nextInt(100));

        productRow1.getChildren().addAll(productBox1, productBox2, productBox3);

        return productRow1;
    }

private VBox createProductBox(String imagePath, String productName, String productPrice) {
        VBox productBox = new VBox(10);

        ImageView productImage = new ImageView(imagePath);
        productImage.setFitHeight(200);
        productImage.setFitWidth(200);

        Label productNameLabel = new Label(productName);
        Label productPriceLabel = new Label(productPrice);

        Button buyButton = new Button("Buy");

        productBox.getChildren().addAll(productImage, productNameLabel, productPriceLabel, buyButton);

        return productBox;
    }
}