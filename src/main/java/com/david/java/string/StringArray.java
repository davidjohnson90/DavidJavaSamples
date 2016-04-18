package com.david.java.string;

import java.util.Arrays;

/**
 * @author David
 *
 */
public class StringArray {
	public static void main(String[] args) {
		String deviceType = null;
		String deviceValue = "cmdb_ci_computer_room";
		String[] dtApplication = new String[] { "cmdb_ci_app_server_java",
				"cmdb_ci_appl", "cmdb_ci_application_software" };
		String[] dtDevice = new String[] { "cmdb_ci", "cmdb_ci_acc",
				"cmdb_ci_aix_server", "cmdb_ci_cluster",
				"cmdb_ci_cluster_node", "cmdb_ci_cluster_vip",
				"cmdb_ci_computer" };
		String[] dtSite = new String[] { "cmdb_ci_computer_room" };
		if (Arrays.asList(dtApplication).contains(deviceValue)) {
			deviceType = "Application";
		} else if (Arrays.asList(dtDevice).contains(deviceValue)) {
			deviceType = "Device";
		} else if (Arrays.asList(dtSite).contains(deviceValue)) {
			deviceType = "Site";
		} else {
			deviceType = "";
		}
		System.out.println(deviceType);
	}
}