// https://developers.naver.com/docs/search/news/
// www.data.go.kr
// data.seoul.go.kr
// data.gg.go.kr


package com.lhw.hm.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class Main {
	// Client ID : gkXL6xjXGQqXV3z_kKPv
	// Client Secret : 7kpXc99CFu

	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		Scanner keyboard = null;
		
		String clientId = "gkXL6xjXGQqXV3z_kKPv";
		String clientSecret = "7kpXc99CFu";
		
		
		try {
			keyboard = new Scanner(System.in);
			System.out.println("검색어");
			String str = keyboard.next();
			// 인터넷 주소에는 한글, 특수문자 => %2A 이런식으로 바꿔야함
			//							URLEncoding
			str = URLEncoder.encode(str, "utf-8");
			
			String url = "https://openapi.naver.com/v1/search/news.xml";

			// query 이후 검색어 넣기.
			url += "?query=" + str;
			
			URL u = new URL(url);
						
			huc = (HttpsURLConnection) u.openConnection();
			
			// 네이버가 요구하는대로 해줌.
			huc.addRequestProperty("X-Naver-Client-Id", clientId);
			huc.addRequestProperty("X-Naver-Client-Secret", clientSecret);


			// 내용 빼낼 준비
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			// 전체 내용 출력
//			String line = null;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");
			
			String tagName = null;
			
			int what = xpp.getEventType(); // 현재 위치에 있는게 뭐냐
			
			while (what != XmlPullParser.END_DOCUMENT) {
				if(what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					
				}else if (what == XmlPullParser.TEXT) {
					if (tagName.equals("title")) { // 문자열(String) 비교
						System.out.printf("%s", xpp.getText());
					} else if (tagName.equals("description")) {
						System.out.printf("%s\n", xpp.getText());
						System.out.println("------------");
					}
				} else if (what == XmlPullParser.END_TAG) {
					tagName = "";
				}
				
				xpp.next(); // 다음칸으로
				what = xpp.getEventType();
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			huc.disconnect();
			keyboard.close();
		}
	}

}
