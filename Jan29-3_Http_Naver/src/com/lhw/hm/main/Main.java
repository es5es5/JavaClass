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
			System.out.println("�˻���");
			String str = keyboard.next();
			// ���ͳ� �ּҿ��� �ѱ�, Ư������ => %2A �̷������� �ٲ����
			//							URLEncoding
			str = URLEncoder.encode(str, "utf-8");
			
			String url = "https://openapi.naver.com/v1/search/news.xml";

			// query ���� �˻��� �ֱ�.
			url += "?query=" + str;
			
			URL u = new URL(url);
						
			huc = (HttpsURLConnection) u.openConnection();
			
			// ���̹��� �䱸�ϴ´�� ����.
			huc.addRequestProperty("X-Naver-Client-Id", clientId);
			huc.addRequestProperty("X-Naver-Client-Secret", clientSecret);


			// ���� ���� �غ�
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			// ��ü ���� ���
//			String line = null;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");
			
			String tagName = null;
			
			int what = xpp.getEventType(); // ���� ��ġ�� �ִ°� ����
			
			while (what != XmlPullParser.END_DOCUMENT) {
				if(what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					
				}else if (what == XmlPullParser.TEXT) {
					if (tagName.equals("title")) { // ���ڿ�(String) ��
						System.out.printf("%s", xpp.getText());
					} else if (tagName.equals("description")) {
						System.out.printf("%s\n", xpp.getText());
						System.out.println("------------");
					}
				} else if (what == XmlPullParser.END_TAG) {
					tagName = "";
				}
				
				xpp.next(); // ����ĭ����
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
