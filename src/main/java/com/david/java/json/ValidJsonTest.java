package com.david.java.json;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.logging.Logger;

/**
 * This class demonstrates JSON processing using the org.json library.
 * It checks if the values associated with keys in a JSON object are valid JSON objects.
 * It uses java.util.logging for logging purposes.
 *
 * @author David
 */
public class ValidJsonTest {

    // Example JSON string
    static String jsonValue = "{\"checked_in\":\"\",\"unverified\":\"false\",\"location\":{\"display_value\":\"30 Katharinenstr, Hamburg\",\"link\":\"https://dev10824.service-now.com/api/now/table/cmn_location/5d000ca93790200044e0bfc8bcbe5d8c\"},\"po_number\":\"PO100010\",\"justification\":\"\",\"correlation_id\":\"\",\"supported_by\":\"\",\"sys_tags\":\"\",\"sys_domain\":{\"display_value\":\"global\",\"link\":\"https://dev10824.service-now.com/api/now/table/sys_user_group/global\"},\"sys_mod_count\":\"7\",\"first_discovered\":\"\",\"cost_cc\":\"USD\",\"owned_by\":\"\",\"gl_account\":\"\",\"monitor\":\"false\",\"asset\":{\"display_value\":\"P1000640 - Apple MacBook Air 13\",\"link\":\"https://dev10824.service-now.com/api/now/table/alm_asset/04a9a80d3790200044e0bfc8bcbe5d1b\"},\"managed_by\":\"\",\"maintenance_schedule\":\"\"}";

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ValidJsonTest.class.getName());

        JSONObject jobject = new JSONObject(jsonValue);

        for (int i = 0; i < jobject.names().length(); i++) {
            String key = jobject.names().getString(i);
            String value = String.valueOf(jobject.get(key));

            if (isJSONValid(value)) {
                logger.info("Key: " + key + ", Value: " + value);
            } else {
                logger.warning("Key: " + key + ", Invalid Value: " + value);
            }
        }
    }

    /**
     * Checks if a given JSON string is valid by attempting to create a JSONObject from it.
     *
     * @param jsonString The JSON string to validate.
     * @return True if the JSON string is valid, otherwise false.
     */
    public static boolean isJSONValid(final String jsonString) {
        try {
            new JSONObject(jsonString);
            return true;
        } catch (JSONException ex) {
            return false;
        }
    }
}
