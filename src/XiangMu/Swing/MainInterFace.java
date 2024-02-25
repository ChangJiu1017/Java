package XiangMu.Swing;

import javax.swing.*;

public class MainInterFace extends JFrame{

//    JFrame jf = new JFrame("ºÚÂþÍ¼Êé¹Ý");
    final int WIDTH = 500;
    final int HEIGHT = 300;

    public  void init()
    {
        //jf.setBounds((ScreenUtils.getScreenWidth()-WIDTH)/2,(ScreenUtils.getScreenHeight()-HEIGHT)/2,WIDTH,HEIGHT);
        this.setVisible(true);
        this.setSize(WIDTH,HEIGHT);
        this.setLocationRelativeTo(null);
        this.setTitle("³£öÎÓî");
    }

    public static void main(String[] args) {
        MainInterFace window = new MainInterFace();
        window.init();
    }
}
