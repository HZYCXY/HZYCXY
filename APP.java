import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Font;
import javax.swing.JLabel;
public class APP{
    public static void main(String[] args){
        JFrame f=new JFrame("测试");
        Font fnt=new Font("Serief",Font.ITALIC+Font.BOLD,28);    //设置字体，Serief/批量 ITALIC/斜体 BOLD/粗体 字体大小/28
        JLabel lab=new JLabel("Hello Worid!",JLabel.CENTER);  //设置内容居中
        lab.setFont(fnt);
        f.add(lab);
        Dimension d=new Dimension();
        d.setSize(400,300);
        f.setSize(d);        //设置组件大小
        f.setBackground(Color.WHITE);   //背景色设置为白色
        Point p=new Point(400,100);    //指定组件显示位置
        f.setLocation(p);     //设置组件显示位置
        f.setVisible(true);    //设置组件可见
    }
}
