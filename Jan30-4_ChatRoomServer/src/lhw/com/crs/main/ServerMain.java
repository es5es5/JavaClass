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
				// ���ο� Ŭ���̾�Ʈ�� �����ϸ�
				// �ݺ��� �ӿ��� ���� Ŭ���� ����ϸ� �ݺ��� �ȿ��� ���� ������ ��
				Socket s = ss.accept();
				// ArrayList�� �߰���Ű��
				sockets.add(s);
				// �� Ŭ���̾�Ʈ�� ���� ���ο� thread ����
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
