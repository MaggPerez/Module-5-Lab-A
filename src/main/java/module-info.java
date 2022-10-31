module test.module_5_laba {
    requires javafx.controls;
    requires javafx.fxml;

    opens test.module_5_laba to javafx.fxml;
    exports test.module_5_laba;
}
