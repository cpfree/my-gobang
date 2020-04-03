package cn.cpf.app.gobang.res;

import javax.swing.*;
import java.awt.*;

/**
 * <b>Description : </b>
 *
 * @author CPF
 * Date: 2020/3/27 15:56
 */
public enum  ImageMapping {

    white("/cn/cpf/app/gobang/res/white.png"),
    black("/cn/cpf/app/gobang/res/black.png");

    public final ImageIcon imageIcon;

    ImageMapping(String path) {
        Image image = Toolkit.getDefaultToolkit().getImage(ImageMapping.class.getResource(path));
        imageIcon = new ImageIcon(image);
    }

}
