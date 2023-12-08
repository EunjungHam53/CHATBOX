module com.example.chatbox {
    requires javafx.controls;
    requires javafx.fxml;

    opens Chatbox to javafx.fxml;
    exports Chatbox;
}