package com.scci.component;

public class LoginServiceImpl implements LoginService {
	private LoginDao loginDao;
	public LoginDao getLoginDao() {
		return loginDao;
	}
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	@Override
	public String login(String user) {
		return loginDao.login(user);
	}
}
