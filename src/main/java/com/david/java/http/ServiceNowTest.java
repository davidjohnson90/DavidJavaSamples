package com.david.java.http;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ServiceNowTest {
	CredentialsProvider credentialsProvider;
	static CloseableHttpClient client;
	String url = "https://dev22351.service-now.com/api/now/table/";
	String tableName = "incident";
	String sys_id = "3e198763db1322007707711ebf96191e";
	String accept = "Accept";
	String ctype = "Content-Type";
	String ajson = "application/json";

	public ServiceNowTest() {
		credentialsProvider = new BasicCredentialsProvider();
		credentialsProvider.setCredentials(new AuthScope(new HttpHost("dev22351.service-now.com")),
				new UsernamePasswordCredentials("admin", "Gods*Child1"));
		client = HttpClients.custom().setDefaultCredentialsProvider(credentialsProvider).build();
	}

	public static void main(String[] args) throws HttpException, IOException {
		ServiceNowTest serviceNowTest = new ServiceNowTest();
		serviceNowTest.createSN(client);
		serviceNowTest.putSN(client);
		serviceNowTest.getSN(client);
		serviceNowTest.deleteSN(client);
	}

	private void createSN(CloseableHttpClient client) throws HttpException, IOException {
		try {
			String postData = "{\"short_description\":\"Rest Test Creation by David\"}";
			HttpPost httpPost = new HttpPost(url + tableName);
			httpPost.setHeader(accept, ajson);
			httpPost.setHeader(ctype, ajson);
			HttpEntity entity = new ByteArrayEntity(postData.getBytes("utf-8"));
			httpPost.setEntity(entity);
			System.out.println("Request - " + httpPost.getRequestLine());
			CloseableHttpResponse response = client.execute(httpPost);
			try {
				System.out.println(response.getStatusLine());
				String responseBody = EntityUtils.toString(response.getEntity());
				System.out.println(responseBody);
			} finally {
				response.close();
			}
		} finally {
			client.close();
		}
	}

	private void putSN(CloseableHttpClient client) throws HttpException, IOException {
		try {
			String putData = "{\"short_description\":\"Rest Test Creation by David\"}";
			HttpPut httpPut = new HttpPut(url + tableName + "/" + sys_id);
			httpPut.setHeader(accept, ajson);
			httpPut.setHeader(ctype, ajson);
			HttpEntity entity = new ByteArrayEntity(putData.getBytes("utf-8"));
			httpPut.setEntity(entity);
			System.out.println("Request - " + httpPut.getRequestLine());
			CloseableHttpResponse response = client.execute(httpPut);
			try {
				System.out.println(response.getStatusLine());
				String responseBody = EntityUtils.toString(response.getEntity());
				System.out.println(responseBody);
			} finally {
				response.close();
			}
		} finally {
			client.close();
		}
	}

	private void getSN(CloseableHttpClient client) throws HttpException, IOException {
		try {
			HttpGet httpGet = new HttpGet(url + tableName);
			httpGet.setHeader("Accept", "application/json");
			System.out.println("Request - " + httpGet.getRequestLine());
			CloseableHttpResponse response = client.execute(httpGet);
			try {
				System.out.println(response.getStatusLine());
				String responseBody = EntityUtils.toString(response.getEntity());
				System.out.println(responseBody);
			} finally {
				response.close();
			}
		} finally {
			client.close();
		}
	}

	private void deleteSN(CloseableHttpClient client) throws HttpException, IOException {
		try {
			HttpDelete httpDelete = new HttpDelete(url + tableName + "/" + sys_id);
			httpDelete.setHeader(accept, ajson);
			System.out.println("Request - " + httpDelete.getRequestLine());
			CloseableHttpResponse response = client.execute(httpDelete);
			try {
				System.out.println(response.getStatusLine());
			} finally {
				response.close();
			}
		} finally {
			client.close();
		}
	}
}