package com.david.java.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NestedParseJSON {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(NestedParseJSON.class.getName());

        JSONParser jsonParser = new JSONParser();
        Object object;

        try {
            // Parse the JSON file
            object = jsonParser.parse(new FileReader("src/main/resources/nestedobjects.json"));
            JSONObject jsonObject = (JSONObject) object;

            // Extract top-level properties
            String name = (String) jsonObject.get("name");
            String website = (String) jsonObject.get("website");

            logger.log(Level.INFO, "Name: " + name);
            logger.log(Level.INFO, "Website: " + website);

            // Extract nested technology object
            JSONObject technology = (JSONObject) jsonObject.get("technology");
            long java = (Long) technology.get("java");

            logger.log(Level.INFO, "Technology: " + technology);
            logger.log(Level.INFO, "java: " + java);

            // Extract nested compose object and its arrays
            JSONObject compose = (JSONObject) jsonObject.get("compose");
            long total = (Long) compose.get("total");
            JSONArray soundex = (JSONArray) compose.get("soundex");

            logger.log(Level.INFO, "Compose: " + compose);
            logger.log(Level.INFO, "total: " + total);
            logger.log(Level.INFO, "soundex: " + soundex);

            // Iterate over soundex array and extract info properties
            Iterator itr = soundex.iterator();

            while (itr.hasNext()) {
                Object slide = itr.next();
                JSONObject jsonObject2 = (JSONObject) slide;
                JSONObject info = (JSONObject) jsonObject2.get("info");

                String date_of_birth = (String) info.get("date_of_birth");
                String name_id = (String) info.get("name_id");

                logger.log(Level.INFO, "Date of Birth: " + date_of_birth);
                logger.log(Level.INFO, "Name Id: " + name_id);
            }
        } catch (FileNotFoundException e) {
            logger.log(Level.SEVERE, "File not found:", e);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "IO exception:", e);
        } catch (ParseException e) {
            logger.log(Level.SEVERE, "Parsing exception:", e);
        }
    }
}
