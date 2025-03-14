module com.lms.lmsdesktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.jfoenix;
    requires javafx.media;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;
    requires java.desktop;


    opens com.lms.lmsdesktop to javafx.fxml;
    exports com.lms.lmsdesktop;
    opens com.lms.lmsdesktop.student to javafx.fxml;
    exports com.lms.lmsdesktop.student;
    opens com.lms.lmsdesktop.faculty to javafx.fxml;
    exports com.lms.lmsdesktop.faculty;
    opens com.lms.lmsdesktop.admin to javafx.fxml;
    exports com.lms.lmsdesktop.admin;
    opens com.lms.lmsdesktop.student_courseSelection to javafx.fxml;
    exports com.lms.lmsdesktop.student_courseSelection;
    opens com.lms.lmsdesktop.chat to javafx.fxml;
    exports com.lms.lmsdesktop.chat;
    opens com.lms.lmsdesktop.calculator to javafx.fxml;
    exports com.lms.lmsdesktop.calculator;
}