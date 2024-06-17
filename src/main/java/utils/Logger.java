package com.carrental.utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class AppLogger {
    private static final Logger LOGGER = Logger.getLogger(AppLogger.class.getName());
    private static FileHandler fileHandler;

    static {
        try {
            // Configurer le gestionnaire de fichier pour stocker les logs
            fileHandler = new FileHandler("CarRental.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
            LOGGER.setLevel(Level.ALL);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Failed to initialize logger handler", e);
        }
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}