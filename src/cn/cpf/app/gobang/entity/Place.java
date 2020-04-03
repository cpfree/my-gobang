package cn.cpf.app.gobang.entity;

import cn.cpf.app.gobang.global.Config;

public class Place {

	private static Place[][] placePool;

	static {
		placePool = new Place[Config.BOARDLENGTH][Config.BOARDLENGTH];
		for (int x = 0; x < Config.BOARDLENGTH; x++){
			for (int y = 0; y < Config.BOARDLENGTH; y++){
				placePool[x][y] = new Place(x, y);
			}
		}
	}

	public static Place of(int x, int y){
		return placePool[x][y];
	}

	public final int x;
	public final int y;

	private Place(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}

	public boolean equals(Place obj) {
		return this.x == obj.x && this.y == obj.y;
	}
}
