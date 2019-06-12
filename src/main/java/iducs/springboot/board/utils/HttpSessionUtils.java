package iducs.springboot.board.utils;

import javax.servlet.http.HttpSession;

import iducs.springboot.board.domain.User;

public class HttpSessionUtils {
	public static boolean isEmpty(HttpSession session, String key) {
		Object object = session.getAttribute(key);
		if(object == null ) {
			return true; //로그인 안된상태
		}
		return false;
	}
	public static boolean isSameUser(User login, User writer) {
		if(login.equals(writer)) return true;
		/*	if(login == writer ) {
			return true; //동일한 객체인가?
		}
		*/
		return false;
	}
}
