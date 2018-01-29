// developers.kakao.com
// 

package com.lhw.hd.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {

	// 172fc1fbb03529f956106c89d5a40c4a
	public static void main(String[] args) {

		Scanner keyboard = null;
		HttpsURLConnection huc = null;

		try {
			keyboard = new Scanner(System.in);
			System.out.print("검색어 : ");
			String str = keyboard.next();

			str = URLEncoder.encode(str, "utf-8");

			String url = "https://dapi.kakao.com/v2/search/book";
			url += "?query=" + str;

			URL u = new URL(url);

			huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("Authorization", "KakaoAK 172fc1fbb03529f956106c89d5a40c4a");

			// 내용 빼낼 준비
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			JSONParser jp = new JSONParser();
			
			// 전체 출력
			String line = null;
			while ((line = br.readLine())!=null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			keyboard.close();
			huc.disconnect();
		}

	}

}
