package com.david.java.json;

import org.json.JSONObject;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Demonstrates key renaming and JSON manipulation using the org.json library.
 * Reads a JSON object, renames specified keys, adds new keys, and performs logging.
 * <p>
 * Author: David
 */
public class KeyRenaming {
    static String dataString = "{\"cluster\":\"nyc oracle rac cluster\",\"skip_sync\":\"false\",\"operational_status\":\"Operational\",\"sys_updated_on\":\"2011-03-10 17:42:39\",\"first_discovered\":\"\",\"discovery_source\":null,\"sys_updated_by\":\"glide.maint\",\"due_in\":null,\"sys_created_on\":\"2011-03-10 17:41:58\",\"sys_domain\":\"global\",\"install_date\":\"\",\"gl_account\":\"\",\"invoice_number\":\"\",\"sys_created_by\":\"glide.maint\",\"warranty_expiration\":\"\",\"asset_tag\":\"\",\"node_status\":\"\",\"fqdn\":\"\",\"change_control\":\"\",\"owned_by\":\"\",\"checked_out\":\"\",\"sys_domain_path\":\"/\",\"maintenance_schedule\":\"\",\"delivery_date\":\"\",\"install_status\":\"Installed\",\"cost_center\":\"\",\"supported_by\":\"\",\"dns_domain\":\"\",\"name\":\"Node 1\",\"assigned\":\"\",\"purchase_date\":\"\",\"subcategory\":\"\",\"short_description\":\"\",\"server\":\"dbaix900nyc\",\"assignment_group\":\"\",\"managed_by\":\"\",\"last_discovered\":\"\",\"can_print\":\"false\",\"sys_class_name\":\"Cluster Node\",\"manufacturer\":\"\",\"sys_id\":\"a29395190a0004954108310b382033f4\",\"po_number\":\"\",\"checked_in\":\"\",\"vendor\":\"\",\"mac_address\":\"\",\"company\":\"\",\"justification\":\"\",\"model_number\":\"\",\"department\":\"\",\"assigned_to\":\"\",\"start_date\":\"\",\"cost\":\"\",\"comments\":\"\",\"sys_mod_count\":\"1\",\"monitor\":\"false\",\"serial_number\":\"\",\"ip_address\":\"\",\"model_id\":\"\",\"sys_tags\":\"\",\"cost_cc\":\"USD\",\"support_group\":\"\",\"order_date\":\"\",\"schedule\":\"\",\"due\":\"\",\"unverified\":\"false\",\"correlation_id\":\"\",\"location\":\"\",\"attributes\":\"\",\"asset\":\"\",\"category\":\"\",\"fault_count\":\"0\",\"lease_id\":\"\"}";  // Your JSON data string

    public static void main(String[] args) {
        // Set up logger
        Logger logger = Logger.getLogger(KeyRenaming.class.getName());

        logger.log(Level.INFO, "Starting the main method...");

        try {
            logger.log(Level.INFO, "Trying JSON key renaming and manipulation...");

            // Replace keys in the JSON data string using proper escaping
            dataString = dataString.replace("\"category\"", "\"devType\"").replace("\"dns_domain\"", "\"domainName\"").replace("\"ip_address\"", "\"discoveredIpAddr\"").replace("\"mac_address\"", "\"deviceFingerprint\"").replace("\"model_id\"", "\"model\"").replace("\"name\"", "\"hostName\"").replace("\"serial_number\"", "\"serialNumber\"").replace("\"subcategory\"", "\"devSubType\"");

            logger.log(Level.INFO, "dataString :: " + dataString);

            // Create a JSONObject from the modified dataString
            JSONObject data = new JSONObject(dataString);

            logger.log(Level.INFO, "Performing JSON manipulation...");

            // Add new keys to the JSONObject
            data.put("reachableList", "SN");
            data.put("unreachableList", "SN");

            logger.log(Level.INFO, "Modified JSON data :: " + data);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An exception occurred:", e);
        }
    }
}
