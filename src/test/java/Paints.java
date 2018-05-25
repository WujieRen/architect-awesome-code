import java.applet.Applet;
import java.awt.*;

/**
 * Created by renwujie on 2018/05/24 at 23:19
 */
public class Paints extends Applet {

    private static final long serialVersionUID = -6824097144718724775L;

    Image image;
    Graphics graphics;
    int width = 568;
    int height = 350;

    @Override
    public void init() {
        setBackground(Color.BLACK);
        this.setSize(width, height);
        image = createImage(width, height);
        graphics = image.getGraphics();
    }

    @Override
    public void paint(Graphics g) {
        //用红色来填充指定矩形
        graphics.clearRect(0, 0, width, height);
        graphics.setColor(Color.red);
        double x, y, r;
        //笛卡尔数学公式(x*x + y*y - 2ax)=4a*a(x*x + y*y)
        for(int i = 0; i <= 90; i++) {
            for(int j = 0; j <= 90; j++) {
                r = Math.PI / 45 * i * (1 - Math.sin(Math.PI / 45 * j)) * 18;
                x = r * Math.cos(Math.PI / 45 * j) * Math.sin(Math.PI / 45 * i) + width / 2;
                y = -r * Math.sin(Math.PI / 45 * j) + height / 4;
                graphics.fillOval((int) x, (int) y, 2, 2);
            }
        }
        g.drawImage(image, 0, 0, this);
    }
}