package tech.shunzi.demo.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Version:v1.0 (description:  ) Date:2018/1/28 0028  Time:23:38
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

	// 注册STMOP协议的节点endpoint，并映射指定的URL
	@Override
	public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
		// 注册节点并指定使用SockJS协议
		stompEndpointRegistry.addEndpoint("/endpointWisely").withSockJS();
	}

	// 配置消息代理
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		registry.enableSimpleBroker("/topic");
	}
}
