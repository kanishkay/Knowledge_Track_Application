module cs151.application {
    requires javafx.controls;
    requires javafx.fxml;
    //requires com.dlsc.formsfx;

    opens knowledgeBase.application to javafx.fxml;
    exports knowledgeBase.application;
}