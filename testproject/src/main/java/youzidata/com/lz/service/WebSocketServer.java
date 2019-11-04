package youzidata.com.lz.service;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@ServerEndpoint(value = "/websocket")
@Component
public class WebSocketServer {

	private Session session;

	/**
	 * 连接成功回调的方法
	 * @param session
	 */
	@OnOpen
	public void onOpen(Session session) {
		this.session = session;
		try {
			sendMessage("连接成功！！！"+"11111111111111");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 连接关闭回调的方法
	 */
	@OnClose
	public void onClose() {
		if(session != null){
			try {
				session.close();
				System.out.println("连接关闭");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 收到消息回调的方法
	 * @param message
	 * @param session
	 */
	@OnMessage
	public void onMessage(String message, Session session) {
		try {
			sendMessage("您发送的消息是--->" + message+"11111111111111");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@OnMessage
	public void onMessage(byte[] message, Session session){
		System.out.println("文件流...");
		File file = new File("C:\\Users\\leizhuang\\filename");
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file, true);
			fileOutputStream.write(message);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fileOutputStream != null){
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	/**
	 * 发生错误时回调的方法
	 * @param session
	 * @param error
	 */
	@OnError
	public void onError(Session session, Throwable error) {
		error.printStackTrace();
	}

	public void sendMessage(String message) throws IOException {
		session.getBasicRemote().sendText(message);
	}

}