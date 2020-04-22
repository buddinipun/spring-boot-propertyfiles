package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
//@PropertySource("classpath:application.properties")
@PropertySource(value = {"file:/⁩Users/buddinipun/Documents/learnings/application.properties⁩"})
public class MyProperties {
	
	String name;
	int version;
	boolean messagingused;
	
	Myapp myapp;
	Mail mail;
	
	Integer[] zip;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public boolean isMessagingused() {
		return messagingused;
	}

	public void setMessagingused(boolean messagingused) {
		this.messagingused = messagingused;
	}

	public Myapp getMyapp() {
		return myapp;
	}

	public void setMyapp(Myapp myapp) {
		this.myapp = myapp;
	}

	public Mail getMail() {
		return mail;
	}

	public void setMail(Mail mail) {
		this.mail = mail;
	}

	public Integer[] getZip() {
		return zip;
	}

	public void setZip(Integer[] zip) {
		this.zip = zip;
	}

	public static class Myapp {
		
		String language;
		String build;
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String getBuild() {
			return build;
		}
		public void setBuild(String build) {
			this.build = build;
		}
		
		
	}
	
	public static class Mail {
		
		String host;
		int port;
		String protocol;
		public String getHost() {
			return host;
		}
		public void setHost(String host) {
			this.host = host;
		}
		public int getPort() {
			return port;
		}
		public void setPort(int port) {
			this.port = port;
		}
		public String getProtocol() {
			return protocol;
		}
		public void setProtocol(String protocol) {
			this.protocol = protocol;
		} 
		
		
	}
	
	

}
