package vd;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Emty {
        public int worldX;
        public int worldY;
        public int speed;
        public String huong;
        public Rectangle solid;
        public boolean upfre , leftfre , rightfre, dowfre;
        BufferedImage up1, up2, left1, left2, right1, right2, dow1, dow2;
        public int soluong = 0, maso=1;
        public boolean cham = false;
        public int solidAreaDefaultX = 0 , solidAreaDefaultY =0;
}
