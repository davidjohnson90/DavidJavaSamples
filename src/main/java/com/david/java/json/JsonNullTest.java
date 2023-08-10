package com.david.java.json;

import org.json.JSONObject;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A class that demonstrates working with JSON using the org.json library.
 * It reads a JSON object, iterates through its keys, handles null values, and performs logging.
 * <p>
 * Author: David
 */
public class JsonNullTest {
    // Create a logger for the class
    private static final Logger logger = Logger.getLogger(JsonNullTest.class.getName());

    public static void main(String[] args) {
        // JSON object with sample data
        JSONObject inputDataJson = new JSONObject("{ 	\"docStatus\": null, 	\"lastUpdateTime\": null, 	\"sysUpTime\": 0, 	\"severity\": 3, 	\"probableCause\": null, 	\"description\": \"Creating from API\", 	\"eventType\": 0, 	\"count\": 0, 	\"firstOccurred\": 0, 	\"lastOccurred\": 0, 	\"eventCategory\": 0, 	\"sourceEventID\": null, 	\"fspEventID\": null, 	\"faultCode\": null, 	\"fsReceivedTimeStamp\": 0, 	\"rawTraps\": null, 	\"trapOID\": null, 	\"addInfo\": null, 	\"dcCreateTime\": null, 	\"deviceId\": null, 	\"parentId\": null, 	\"devType\": null, 	\"devTypeEnum\": null, 	\"devSubType\": null, 	\"devSubTypeEnum\": null, 	\"hostName\": null, 	\"faultName\": null, 	\"service\": null, 	\"hasCorrelated\": false, 	\"acknowledged\": false, 	\"acknowledgeTimestamp\": 0, 	\"acknowledgeUser\": null, 	\"note\": null, 	\"owner\": null, 	\"clearTimeStamp\": null, 	\"alertCreationTime\": 0, 	\"alertID\": 0, 	\"eventSource\": null, 	\"isAlertable\": false, 	\"autoCleared\": false, 	\"ipAddr\": null, 	\"affectedObject\": null, 	\"affectedObjectOID\": null, 	\"sourceType\": 0, 	\"sourceName\": null, 	\"dcId\": null, 	\"siteId\": null, 	\"orgId\": null, 	\"task_type\": null, 	\"event\": null, 	\"expected_start\": null, 	\"reopen_count\": null, 	\"close_notes\": null, 	\"impact\": \"3 - Low\", 	\"urgency\": \"3 - Low\", 	\"priority\": null, 	\"follow_up\": null, 	\"sla_due\": null, 	\"number\": null, 	\"work_end\": null, 	\"work_start\": null, 	\"business_duration\": null, 	\"category\": \"Request\", 	\"activity_due\": null, 	\"active\": null, 	\"due_date\": null, 	\"knowledge\": null, 	\"made_sla\": null, 	\"comments_and_work_notes\": null, 	\"state\": null, 	\"user_input\": null, 	\"order\": null, 	\"short_description\": \"Creating from API\", 	\"notify\": null, 	\"close_code\": null, 	\"approval\": null, 	\"upon_reject\": null, 	\"sys_id\": null, 	\"subcategory\": \"email\", 	\"contact_type\": \"phone\", 	\"time_worked\": null, 	\"assignment_group\": null, 	\"created_on\": null, 	\"updated_on\": null, 	\"location\": \"\", 	\"closed_by\": null, 	\"caller_id\": null, 	\"resolved_by\": null, 	\"assigned_to\": null, 	\"opened_by\": null, 	\"device_info\": { 		\"deviceFingerprint\": \"\", 		\"deviceType\": \"cmdb_ci_computer\", 		\"deviceSubType\": \"Computer\", 		\"orgId\": \"ACME North America\", 		\"siteId\": \"322 West 52nd Street, New York,NY\", 		\"name\": \"382735F5AD9E492\", 		\"deviceId\": \"46b673c6a9fe1981016c72cc01ac53c2\", 		\"ip_address\": \"\", 		\"fqdn\": \"\" 	}, 	\"alert\": true }");

        // Iterate through the keys of the JSON object
        for (int i = 0; i < inputDataJson.length(); i++) {
            String key = (String) inputDataJson.names().get(i);
            logger.log(Level.INFO, "Key {0}: {1}", new Object[]{i, key});

            // Check if the value is null and replace with an empty string if necessary
            if (inputDataJson.isNull(key)) {
                inputDataJson.put(key, "");
            }
        }

        // Log the modified JSON object
        logger.log(Level.INFO, "Modified JSON Object: {0}", inputDataJson);

        // Example of extracting data from the JSON object
        String sysUpTime = inputDataJson.get("sysUpTime").toString();
        logger.log(Level.INFO, "sysUpTime: {0}", sysUpTime);
    }
}
