package tech.shunzi.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;

/**
 * Version:v1.0 (description:  ) Date:2018/1/28 0028  Time:16:02
 */
@ConfigurationProperties(prefix = "spring.http.encoding")
public class HttpEncodingProperties {

	public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

	private Charset charset = DEFAULT_CHARSET;

	private boolean forceEncoding = true;

	public Charset getCharset() {
		return charset;
	}

	public void setCharset(Charset charset) {
		this.charset = charset;
	}

	public boolean isForceEncoding() {
		return forceEncoding;
	}

	public void setForceEncoding(boolean forceEncoding) {
		this.forceEncoding = forceEncoding;
	}
}
