package controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController  {
    Stage customerManagement = new Stage();
    Stage itemManagement = new Stage();
    Stage orderManagement = new Stage();
    Stage orderDtlManagement = new Stage();


    @FXML
    void btnManageCustomers(ActionEvent event) {
        try {
            customerManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/customerManagement.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        customerManagement.show();

    }

    @FXML
    void btnManageItems(ActionEvent event) {
        try {
            itemManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/itemManagement.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        itemManagement.show();

    }

    @FXML
    void btnManageOrderDetails(ActionEvent event) {
        try {
            orderDtlManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/orderDtlManagement.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        orderDtlManagement.show();

    }

    @FXML
    void btnManageOrders(ActionEvent event) {
        try {
            orderManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/orderManagement.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        orderManagement.show();
    }
}
