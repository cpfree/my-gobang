package cn.cpf.app.gobang.res;

import cn.cpf.app.gobang.entity.Piece;
import cn.cpf.app.gobang.entity.Place;
import cn.cpf.app.gobang.entity.Pt;
import cn.cpf.app.gobang.res.ImageMapping;

public class PieceFactory {

	public static Piece getPieceByPart(Pt part, Place place) {
		if (Pt.WHITE.equals(part)) {
			return getWhitePiece(place);
		} else if (Pt.BLACK.equals(part)) {
			return getBlackPiece(place);
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}

	public static Piece getWhitePiece(Place place) {
		return new Piece(place, Pt.WHITE, ImageMapping.white.imageIcon);
	}

	public static Piece getBlackPiece(Place place) {
		return new Piece(place, Pt.BLACK, ImageMapping.black.imageIcon);
	}

}
