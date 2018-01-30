package tech.shunzi.demo.websocket.point2point;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Version:v1.0 (description:  ) Date:2018/1/30 0030  Time:21:11
 */
@Controller
public class WsController {

	// 通过该 template 向浏览器发送信息
	@Autowired
	private SimpMessagingTemplate messagingTemplate;

	@MessageMapping("/chat")
	public void handleChat(Principal principal, String message) {

		// 硬编码实现逻辑（根据登录用户判断要发送的对象）
		if (principal.getName().equals("shunzi")) {
			// 通过messagingTemplate 的 convertAndSendToUser向用户发送信息
			// public void convertAndSendToUser(String user, String destination, Object payload)
			messagingTemplate.convertAndSendToUser("Elvis", "/queue/notifications",
					principal.getName() + "-" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
							.format(new Date()) + "-send:" + message);
		} else {
			messagingTemplate.convertAndSendToUser("shunzi", "/queue/notifications",
					principal.getName() + "-" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
							.format(new Date()) + "-send:" + message);
		}
	}
}
