package com.lhw.hc.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main2 {

	public static void main(String[] args) {
		HttpURLConnection huc = null;

		try {
			URL u = new URL("http://www.kangwon.ac.kr");
			huc = (HttpURLConnection) u.openConnection();

			// 내용 빼낼 준비
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			String line = null;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			huc.disconnect();
		}
	}

}
