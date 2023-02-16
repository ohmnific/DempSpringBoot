package com.example.demo;

public class User {

    private String userName;
    private String hostName;
    private String password;

    public User() {

    }

    public User(String userName, String hostName, String password) {
        this.userName = userName;
        this.hostName = hostName;
        this.password = password;
    }
    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
