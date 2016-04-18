package com.david.java.json;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author David
 *
 */
public class ValidJsonTest {
	static String jsonValue = "{\"checked_in\":\"\",\"unverified\":\"false\",\"location\":{\"display_value\":\"30 Katharinenstr, Hamburg\",\"link\":\"https://dev10824.service-now.com/api/now/table/cmn_location/5d000ca93790200044e0bfc8bcbe5d8c\"},\"po_number\":\"PO100010\",\"justification\":\"\",\"correlation_id\":\"\",\"supported_by\":\"\",\"sys_tags\":\"\",\"sys_domain\":{\"display_value\":\"global\",\"link\":\"https://dev10824.service-now.com/api/now/table/sys_user_group/global\"},\"sys_mod_count\":\"7\",\"first_discovered\":\"\",\"cost_cc\":\"USD\",\"owned_by\":\"\",\"gl_account\":\"\",\"monitor\":\"false\",\"asset\":{\"display_value\":\"P1000640 - Apple MacBook Air 13\",\"link\":\"https://dev10824.service-now.com/api/now/table/alm_asset/04a9a80d3790200044e0bfc8bcbe5d1b\"},\"managed_by\":\"\",\"maintenance_schedule\":\"\"}";

	public static void main(String[] args) {
		JSONObject jobject = new JSONObject(jsonValue);

		for (int i = 0; i < jobject.names().length(); i++) {
			if (isJSONValid(String.valueOf(jobject.get(jobject.names()
					.getString(i))))) {
				System.out.println("key = " + jobject.names().getString(i)
						+ " value = "
						+ jobject.get(jobject.names().getString(i)));
			} else {
				System.out.println("am in else ::: "
						+ jobject.get(jobject.names().getString(i)));
			}

		}
	}

	public static boolean isJSONValid(final String jsonString) {
		try {
			new JSONObject(jsonString);
		} catch (JSONException ex) {
			return false;
		}
		return true;
	}
}
