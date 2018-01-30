package lhw.com.crs.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(8000);
			ArrayList<Socket> sockets = new ArrayList<>();
//			Socket s = null;
			while (true) {
				// 새로운 클라이언트가 접속하면
				// 반복문 속에서 내부 클래스 사용하면 반복문 안에서 변수 만들어야 함
				Socket s = ss.accept();
				// ArrayList에 추가시키고
				sockets.add(s);
				// 그 클라이언트를 위한 새로운 thread 시작
				new Thread() {
					public void run() {
						try {
							InputStream is = s.getInputStream();
							InputStreamReader isr = new InputStreamReader(is);
							BufferedReader br = new BufferedReader(isr);

							
							String txt = br.readLine();
							
							for (Socket socket : sockets) {
								OutputStream os = socket.getOutputStream();
								OutputStreamWriter osw = new OutputStreamWriter(os);
								BufferedWriter bw = new BufferedWriter(osw);
								bw.write(txt+"\r\n");
								bw.flush();
							}
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					};
				}.start();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
