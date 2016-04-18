package com.david.java.json;

import org.json.JSONObject;

/**
 * @author David
 *
 */
public class KeyRenaming {
	static String dataString = "{\"cluster\":\"nyc oracle rac cluster\",\"skip_sync\":\"false\",\"operational_status\":\"Operational\",\"sys_updated_on\":\"2011-03-10 17:42:39\",\"first_discovered\":\"\",\"discovery_source\":null,\"sys_updated_by\":\"glide.maint\",\"due_in\":null,\"sys_created_on\":\"2011-03-10 17:41:58\",\"sys_domain\":\"global\",\"install_date\":\"\",\"gl_account\":\"\",\"invoice_number\":\"\",\"sys_created_by\":\"glide.maint\",\"warranty_expiration\":\"\",\"asset_tag\":\"\",\"node_status\":\"\",\"fqdn\":\"\",\"change_control\":\"\",\"owned_by\":\"\",\"checked_out\":\"\",\"sys_domain_path\":\"/\",\"maintenance_schedule\":\"\",\"delivery_date\":\"\",\"install_status\":\"Installed\",\"cost_center\":\"\",\"supported_by\":\"\",\"dns_domain\":\"\",\"name\":\"Node 1\",\"assigned\":\"\",\"purchase_date\":\"\",\"subcategory\":\"\",\"short_description\":\"\",\"server\":\"dbaix900nyc\",\"assignment_group\":\"\",\"managed_by\":\"\",\"last_discovered\":\"\",\"can_print\":\"false\",\"sys_class_name\":\"Cluster Node\",\"manufacturer\":\"\",\"sys_id\":\"a29395190a0004954108310b382033f4\",\"po_number\":\"\",\"checked_in\":\"\",\"vendor\":\"\",\"mac_address\":\"\",\"company\":\"\",\"justification\":\"\",\"model_number\":\"\",\"department\":\"\",\"assigned_to\":\"\",\"start_date\":\"\",\"cost\":\"\",\"comments\":\"\",\"sys_mod_count\":\"1\",\"monitor\":\"false\",\"serial_number\":\"\",\"ip_address\":\"\",\"model_id\":\"\",\"sys_tags\":\"\",\"cost_cc\":\"USD\",\"support_group\":\"\",\"order_date\":\"\",\"schedule\":\"\",\"due\":\"\",\"unverified\":\"false\",\"correlation_id\":\"\",\"location\":\"\",\"attributes\":\"\",\"asset\":\"\",\"category\":\"\",\"fault_count\":\"0\",\"lease_id\":\"\"}";

	public static void main(String[] args) {
		System.out.println("am in main");
		try {
			System.out.println("am in try");
			JSONObject data = new JSONObject(dataString);
			dataString.replace("category", "devType");
			dataString.replace("dns_domain", "domainName");
			dataString.replace("ip_address", "discoveredIpAddr");
			dataString.replace("mac_address", "deviceFingerprint");
			dataString.replace("model_id", "model");
			dataString.replace("name", "hostName");
			dataString.replace("serial_number", "serialNumber");
			dataString.replace("subcategory", "devSubType");

			System.out.println("am in replace");

			data.put("reachableList", "SN");
			data.put("unreachableList", "SN");

			System.out.println("data :: " + dataString);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}