package cn.cpf.app.gobang.global;

import cn.cpf.app.gobang.algorithm.Situation;

public class Global {

	
	/**
	 * 全局局势
	 */
	private static Situation situation = null;
	
	private static boolean comRunnable;

	/**
	 * @return the comRunnable
	 */
	public static boolean isComRunnable() {
		return comRunnable;
	}

	/**
	 * @param comRunnable the comRunnable to set
	 */
	public static void setComRunnable(boolean comRunnable) {
		Global.comRunnable = comRunnable;
	}

	public static void init(){
		situation = new Situation();
	}
	
	public static Situation getSituation() {
		return situation;
	}
	
}
