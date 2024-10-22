package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegistroApp {

    private static final Logger logger = LogManager.getLogger(RegistroApp.class);

    public static void main(String[] args) {
        logger.trace("Mensaje de nivel TRACE");
        logger.debug("Mensaje de nivel DEBUG");
        logger.info("Mensaje de nivel INFO");
        logger.warn("Mensaje de nivel WARN");
        logger.error("Mensaje de nivel ERROR");
        logger.fatal("Mensaje de nivel FATAL");
    }
}