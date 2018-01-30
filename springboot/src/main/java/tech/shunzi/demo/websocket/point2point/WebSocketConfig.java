package tech.shunzi.demo.websocket.point2point;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Version:v1.0 (description:  ) Date:2018/1/30 0030  Time:20:55
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

	// 注册endpoint
	@Override
	public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
		stompEndpointRegistry.addEndpoint("/endpointWisely").withSockJS();
		stompEndpointRegistry.addEndpoint("/endpointChat").withSockJS();
	}

	// 点对点式增加一个 “/queue” 消息代理（在广播式 "\topic"的基础之上）
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		registry.enableSimpleBroker("/queue","/topic");
	}
}
