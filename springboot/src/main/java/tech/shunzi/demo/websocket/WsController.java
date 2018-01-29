package tech.shunzi.demo.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Version:v1.0 (description:  ) Date:2018/1/29 0029  Time:21:37
 */
@Controller
public class WsController {

	// 浏览器向服务端发送请求时映射相应的地址，服务端有消息时，会对订阅了@SendTo中的路径的浏览器发送消息
	@MessageMapping("/welcome")
	@SendTo("/topic/getResponse")
	public WiselyResponse say(WiselyMessage message) throws Exception {
		Thread.sleep(3000);
		return new WiselyResponse("Welcome, " + message.getName() + "!");
	}
}
