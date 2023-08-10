package com.david.java.json;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Demonstrates working with JSON using the org.json library.
 * Reads a JSON object, iterates through its keys, handles null values, and performs logging.
 * <p>
 * Author: David
 */
public class JsonObjectDemo {
    // Create a logger for the class
    private static final Logger logger = Logger.getLogger(JsonObjectDemo.class.getName());

    // JSON data as a string
    static String data = "{\"skip_sync\":\"false\",\"operational_status\":\"Operational\",\"sys_updated_on\":\"2015-09-17 15:21:41\",\"first_discovered\":\"\",\"discovery_source\":null,\"sys_updated_by\":\"system\",\"due_in\":null,\"sys_created_on\":\"2012-02-18 00:14:21\",\"sys_domain\":{\"display_value\":\"global\",\"link\":\"https://dev10150.service-now.com/api/now/table/sys_user_group/global\"},\"install_date\":\"2013-01-25 23:00:00\",\"gl_account\":\"\",\"invoice_number\":\"\",\"sys_created_by\":\"admin\",\"warranty_expiration\":\"2016-01-26\",\"asset_tag\":\"P1000503\",\"fqdn\":\"\",\"change_control\":\"\",\"owned_by\":\"\",\"checked_out\":\"\",\"sys_domain_path\":\"/\",\"maintenance_schedule\":\"\",\"delivery_date\":\"2012-12-08 00:00:00\",\"install_status\":\"Installed\",\"cost_center\":{\"display_value\":\"IT\",\"link\":\"https://dev10150.service-now.com/api/now/table/cmn_cost_center/d9d0a971c0a80a641c20b13d99a48576\"},\"supported_by\":\"\",\"dns_domain\":\"\",\"name\":\"MacBook Pro 15\\\"\",\"assigned\":\"2013-05-11 00:00:00\",\"purchase_date\":\"2012-11-23\",\"subcategory\":\"Computer\",\"short_description\":\"\",\"assignment_group\":\"\",\"managed_by\":\"\",\"last_discovered\":\"\",\"can_print\":\"false\",\"sys_class_name\":\"Computer\",\"manufacturer\":{\"display_value\":\"Apple\",\"link\":\"https://dev10150.service-now.com/api/now/table/core_company/b7e9e843c0a80169009a5a485bb2a2b5\"},\"sys_id\":\"00a96c0d3790200044e0bfc8bcbe5db4\",\"po_number\":\"PO100003\",\"checked_in\":\"\",\"vendor\":{\"display_value\":\"Apple\",\"link\":\"https://dev10150.service-now.com/api/now/table/core_company/b7e9e843c0a80169009a5a485bb2a2b5\"},\"mac_address\":\"\",\"company\":{\"display_value\":\"ACME France\",\"link\":\"https://dev10150.service-now.com/api/now/table/core_company/81fbfe03ac1d55eb286d832de58ae1fd\"},\"justification\":\"\",\"model_number\":\"\",\"department\":{\"display_value\":\"IT\",\"link\":\"https://dev10150.service-now.com/api/now/table/cmn_department/221f79b7c6112284005d646b76ab978c\"},\"assigned_to\":{\"display_value\":\"Eduardo Bellendir\",\"link\":\"https://dev10150.service-now.com/api/now/table/sys_user/92826bf03710200044e0bfc8bcbe5dbb\"},\"start_date\":\"\",\"cost\":\"1,799.99\",\"comments\":\"\",\"sys_mod_count\":\"6\",\"monitor\":\"false\",\"serial_number\":\"ABE-486-V17263-DO\",\"ip_address\":\"\",\"model_id\":{\"display_value\":\"Apple MacBook Pro 15\\\"\",\"link\":\"https://dev10150.service-now.com/api/now/table/cmdb_model/d501454f1b1310002502fbcd2c071334\"},\"sys_tags\":\"\",\"cost_cc\":\"USD\",\"support_group\":\"\",\"order_date\":\"2012-11-11 00:00:00\",\"schedule\":\"\",\"due\":\"\",\"unverified\":\"false\",\"correlation_id\":\"\",\"location\":{\"display_value\":\"27, Boulevard Vitton, Paris\",\"link\":\"https://dev10150.service-now.com/api/now/table/cmn_location/8226baa4ac1d55eb40eb653c02649519\"},\"attributes\":\"\",\"asset\":{\"display_value\":\"P1000503 - Apple MacBook Pro 15\",\"link\":\"https://dev10150.service-now.com/api/now/table/alm_asset/04a96c0d3790200044e0bfc8bcbe5db3\"},\"category\":\"Hardware\",\"fault_count\":\"0\",\"lease_id\":\"\"}";

    public static void main(String[] args) {
        JSONObject dataJSON = new JSONObject(data);

        if (isJSONValid(dataJSON.toString())) {
            logger.log(Level.INFO, "Number of elements in JSON object: {0}", dataJSON.length());

            for (int i = 0; i < dataJSON.length(); i++) {
                String key = dataJSON.names().getString(i);
                Object value = dataJSON.get(key);

                logger.log(Level.INFO, "Key name: {0}, Value name: {1}", new Object[]{key, value});

                try {
                    if (isJSONValid(dataJSON.getString(key))) {
                        String nestedKey = dataJSON.getString(key);
                        logger.log(Level.INFO, "Nested Key: {0} = Value: {1}", new Object[]{nestedKey, dataJSON.get(nestedKey)});
                    }
                } catch (Exception e) {
                    logger.log(Level.SEVERE, "Error processing nested JSON: {0}", e.getMessage());
                }
            }
        }
    }

    /**
     * Checks if a given JSON string is valid.
     *
     * @param jsonString The JSON string to validate.
     * @return true if the JSON string is valid, false otherwise.
     */
    public static boolean isJSONValid(final String jsonString) {
        try {
            new JSONObject(jsonString);
        } catch (JSONException ex) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
