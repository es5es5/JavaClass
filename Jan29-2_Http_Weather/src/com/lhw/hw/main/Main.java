package com.lhw.hw.main;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.lhw.hw.town.Location;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = null;
		HttpURLConnection huc = null;
		
		// http://www.weather.go.kr/weather/lifenindustry/sevice_rss.jsp?sido=2800000000&gugun=2824500000&dong=2824561200&x=21&y=11
		// RSS 에서 가져옴.
		Location l1 = new Location("강원도 춘천시 효자동", 73, 133);
		Location l2 = new Location("충청북도 충주시 대소원면", 75, 114);
		Location l3 = new Location("인천광역시 계양구 계산2동", 56, 126);

		Location[] locations = { l1, l2, l3 };

		for (int i = 0; i < locations.length; i++) {
			System.out.printf("%d) %s\n", i + 1, locations[i].getName());
		}

		System.out.println("뭐 : ");
		
		

		try {
			keyboard = new Scanner(System.in);
			int i = keyboard.nextInt();

			String url = String.format("http://www.weather.go.kr/wid/queryDFS.jsp?gridx=%d&gridy=%d",
					locations[i - 1].getX(), locations[i - 1].getY());
			URL u = new URL(url);
			
			huc = (HttpURLConnection) u.openConnection();

			InputStream is = huc.getInputStream();

			// XML or JSON에서 필요한 것만 빼내는 가공 행위.
			
			// https://sourceforge.net/projects/kxml/postdownload?source=dlp
			// XML Parser
			// 공장에서 찍어냄
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");
			
			String tagName = null;
			
			int what = xpp.getEventType(); // 현재 위치에 있는게 뭐냐
			
			while (what != XmlPullParser.END_DOCUMENT) {
				if(what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					
				}else if (what == XmlPullParser.TEXT) {
					if (tagName.equals("hour")) { // 문자열(String) 비교
						System.out.printf("~%s시 : ", xpp.getText());
					} else if (tagName.equals("temp")) {
						System.out.printf("%s도, \n", xpp.getText());
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
