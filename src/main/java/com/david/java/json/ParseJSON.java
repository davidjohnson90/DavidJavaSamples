package com.david.java.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates JSON parsing and validation using the org.json library.
 * It reads a JSON object, processes its contents, and validates JSON arrays.
 *
 * @author David
 */
public class ParseJSON {

    // Initialize a logger for this class
    private static final Logger logger = Logger.getLogger(ParseJSON.class.getName());

    /**
     * The main method of the application.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        String jsonString = "{\"CustomerUserID\":null,\"TypeID\":\"1\",\"Owner\":\"david.johnson@techmahindra.com\",\"EscalationSolutionTime\":\"0\",\"CreateTimeUnix\":\"1456223732\",\"Article\":[{\"Cc\":\"\",\"CustomerUserID\":null,\"Owner\":\"david.johnson@techmahindra.com\",\"ToRealname\":\"Raw\",\"ContentType\":\"text/plain;charset\u003diso-8859-15\",\"SLA\":\"\",\"QueueID\":\"2\",\"CustomerID\":null,\"ReplyTo\":\"\",\"TicketID\":\"50\",\"FromRealname\":\"david.johnson@techmahindra.com\",\"DynamicField\":[{\"Value\":null,\"Name\":\"ProcessManagementActivityID\"},{\"Value\":null,\"Name\":\"ProcessManagementProcessID\"},{\"Value\":null,\"Name\":\"deviceFingerprint\"},{\"Value\":\"123\",\"Name\":\"deviceId\"},{\"Value\":\"Network\",\"Name\":\"deviceSubType\"},{\"Value\":\"Compute\",\"Name\":\"deviceType\"},{\"Value\":null,\"Name\":\"fqdn\"},{\"Value\":\"127.1.2.3\",\"Name\":\"ipAddress\"},{\"Value\":\"2\",\"Name\":\"orgId\"},{\"Value\":\"1\",\"Name\":\"siteId\"}],\"TicketNumber\":\"2016022315000388\",\"SLAID\":null,\"EscalationUpdateTime\":\"0\",\"To\":\"Raw\",\"ArticleType\":\"webrequest\",\"CreatedBy\":\"2\",\"SenderTypeID\":\"1\",\"Priority\":\"4 high\",\"ServiceID\":null,\"ContentCharset\":\"iso-8859-15\",\"OwnerID\":\"2\",\"State\":\"open\",\"UntilTime\":0,\"InReplyTo\":\"\",\"ArticleID\":\"50\",\"TypeID\":\"1\",\"EscalationSolutionTime\":\"0\",\"CreateTimeUnix\":\"1456223732\",\"MimeType\":\"text/plain\",\"Created\":\"2016-02-23 10:35:33\",\"AgeTimeUnix\":2,\"StateType\":\"open\",\"Changed\":\"2016-02-23 10:35:33\",\"Responsible\":\"root@localhost\",\"EscalationTime\":\"0\",\"Body\":\"Ticket created for 123\",\"Queue\":\"Raw\",\"LockID\":\"1\",\"Age\":3,\"MessageID\":\"\",\"IncomingTime\":\"1456223733\",\"RealTillTimeNotUsed\":\"0\",\"StateID\":\"4\",\"SenderType\":\"agent\",\"Service\":\"\",\"Title\":\"123 Ticket for 10000\",\"Charset\":\"iso-8859-15\",\"ArticleTypeID\":\"8\",\"From\":\"david.johnson@techmahindra.com\",\"Subject\":\"123\",\"Lock\":\"unlock\",\"Type\":\"Unclassified\",\"EscalationResponseTime\":\"0\",\"References\":\"\",\"ResponsibleID\":\"1\",\"PriorityID\":\"4\"}],\"CreateBy\":\"2\",\"QueueID\":\"2\",\"CustomerID\":null,\"GroupID\":\"1\",\"Created\":\"2016-02-23 10:35:32\",\"TicketID\":\"50\",\"DynamicField\":[{\"Value\":null,\"Name\":\"ProcessManagementActivityID\"},{\"Value\":null,\"Name\":\"ProcessManagementProcessID\"},{\"Value\":null,\"Name\":\"deviceFingerprint\"},{\"Value\":\"123\",\"Name\":\"deviceId\"},{\"Value\":\"Network\",\"Name\":\"deviceSubType\"},{\"Value\":\"Compute\",\"Name\":\"deviceType\"},{\"Value\":null,\"Name\":\"fqdn\"},{\"Value\":\"127.1.2.3\",\"Name\":\"ipAddress\"},{\"Value\":\"2\",\"Name\":\"orgId\"},{\"Value\":\"1\",\"Name\":\"siteId\"}],\"StateType\":\"open\",\"TicketNumber\":\"2016022315000388\",\"SLAID\":\"\",\"Changed\":\"2016-02-23 10:35:33\",\"EscalationUpdateTime\":\"0\",\"Responsible\":\"root@localhost\",\"EscalationTime\":\"0\",\"Queue\":\"Raw\",\"LockID\":\"1\",\"Age\":3,\"ArchiveFlag\":\"n\",\"RealTillTimeNotUsed\":\"0\",\"Priority\":\"4 high\",\"StateID\":\"4\",\"Title\":\"123 Ticket for 10000\",\"ServiceID\":\"\",\"Lock\":\"unlock\",\"Type\":\"Unclassified\",\"EscalationResponseTime\":\"0\",\"OwnerID\":\"2\",\"State\":\"open\",\"UntilTime\":0,\"ResponsibleID\":\"1\",\"UnlockTimeout\":\"0\",\"ChangeBy\":\"2\",\"PriorityID\":\"4\"}"; // Your JSON data string

        JSONObject jsonObject = new JSONObject(jsonString);
        JSONObject finalJSON = new JSONObject();

        // Loop through each key in the JSON object
        for (int j = 0; j < jsonObject.length(); j++) {
            String key = jsonObject.names().getString(j);
            Object value = jsonObject.get(key);

            // Log the key and value being processed
            logger.log(Level.INFO, "Processing key: {0}, value: {1}", new Object[]{key, value});

            // Check if the value is a JSON array
            if (isJSONArrayValid(String.valueOf(value))) {
                // Log if the value is a JSON array
                logger.log(Level.INFO, "Value is a JSON array");
                logger.log(Level.INFO, String.valueOf(value));
            } else {
                // If not an array, add the key-value pair to the final JSON object
                finalJSON.put(key, value);
            }
        }

        // Log the final JSON object
        logger.log(Level.INFO, "Final JSON object: {0}", finalJSON);
    }

    /**
     * Validate JSON String as an array.
     *
     * @param jsonString Json String to be validated
     * @return true if it's a valid JSON array
     */
    public static boolean isJSONArrayValid(final String jsonString) {
        try {
            new JSONArray(jsonString);
        } catch (JSONException ex) {
            return false;
        }
        return true;
    }
}
