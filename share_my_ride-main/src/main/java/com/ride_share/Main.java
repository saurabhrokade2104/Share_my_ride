package com.ride_share;

import com.ride_share.initialize.InitializeApp;

import javafx.application.Application;

public class Main {

    // Main method to launch the JavaFX application
    public static void main(String[] args) {
        // Launch the InitializeApp class which extends Application
        Application.launch(InitializeApp.class,
                args);

    }
}