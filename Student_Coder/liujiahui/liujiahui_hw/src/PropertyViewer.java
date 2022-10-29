import javax.swing.*;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * This project implements a simple application. Properties from a fixed
 * file can be displayed.
 *
 * @author Michael Kölling and Josh Murphy
 * @version 1.0
 */
public class PropertyViewer {
    /*private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）*/
    private Property property;
    private PropertyViewerGUI gui;     // the Graphical User Interface
    private Portfolio portfolio;
    /*为了实现一些其他的功能，Java 也提供了许多非访问修饰符。
    static 修饰符，用来修饰类方法和类变量。
    final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。
    abstract 修饰符，用来创建抽象类和抽象方法。
    synchronized 和 volatile 修饰符，主要用于线程的编程。
    static 修饰符
    静态变量：
        static 关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。 静态变量也被称为类变量。局部变量不能被声明为 static 变量。
    静态方法：
        static 关键字用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据。
*/
    static int index = 0;
    static int View_Number = 1;
    static int Total_Money = 0;
    static int average;


    /**
     * Create a PropertyViewer and display its GUI on screen.
     */
    public PropertyViewer() {
        gui = new PropertyViewerGUI(this);
        portfolio = new Portfolio("airbnb-london.csv");
        property = portfolio.getProperty(index);
        gui.showID(property);
        gui.showProperty(property);
        gui.showFavourite(property);
        Total_Money += property.getPrice();
    }

    /**
     * 按下 **"Next"** 按钮时，下一个地产项目应该被显示出来，并有正确的数据。此外，顶部的ID应该被正确更新，以及该地产是否是用户的最爱之一。
     * 如果在最后一个地产上按下 **"Next"** 按钮，应用程序应该返回到第一个地产。
     */
    public void nextProperty() {
        // 查看次数
        View_Number += 1;
        index += 1;
        if (index >= portfolio.numberOfProperties()) {
            index = 0;
        }
        property = portfolio.getProperty(index);
        System.out.println("啊哈，我被翻牌啦，来侍寝～");
        gui.showID(property);
        gui.showProperty(property);
        gui.showFavourite(property);
        Total_Money += property.getPrice();
    }

    /**
     * **“Previous”** 按钮被按下时，上一个地产应该被显示出来，并有正确的数据。此外，顶部的ID应该被正确更新，以及该地产是否是用户的最爱之一。
     * 如果在第一个地产上按下 **“Previous”** 按钮，应用程序应该转到最后一个地产。
     */
    public void previousProperty() {
        // 查看次数
        View_Number += 1;
        index -= 1;
        if (index < 0) {
            index = portfolio.numberOfProperties() - 1;
        }
        property = portfolio.getProperty(index);
        gui.showID(property);
        gui.showProperty(property);
        gui.showFavourite(property);
        Total_Money += property.getPrice();

    }

    /**
     * "Toggle Favourite" 按钮被按下时，该属性的 **isFavourite 字段** 应该被更新
     */
    public void toggleFavourite() {
        property = portfolio.getProperty(index);
        property.toggleFavourite();
        gui.showFavourite(property);
    }


    //----- methods for challenge tasks -----

    /**
     * This method opens the system's default internet browser
     * The Google maps page should show the current properties location on the map.
     */
    public void viewMap() throws Exception {
//        double latitude = 51.512793;
//        double longitude = -0.117149;
        double latitude;
        double longitude;
        latitude = property.getLatitude();
        longitude = property.getLongitude();

        URI uri = new URI("https://www.google.com/maps/place/" + latitude + "," + longitude);
        Desktop.getDesktop().browse(uri);
    }

    /**
     *
     */
    public int getNumberOfPropertiesViewed() {
        // 查看次数
        View_Number += 1;
        return View_Number;
    }

    /**
     *
     */
    public int averagePropertyPrice() {
//        int average;
        average = Total_Money / View_Number;
        return average;
    }

    public void Statistics() {
        averagePropertyPrice();
        JFrame frame = new JFrame("Statistics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
//        JButton button1 = new JButton("" + average + "\n" + View_Number);
//        JFrame Frame = new JFrame("HelloWorldSwing");
        JTextArea text1 = new JTextArea("查看次数：" + View_Number + "\n平均数：" + average);
        frame.getContentPane().add(text1);
//        frame.getContentPane().add(text2);
        frame.setVisible(true);
//            }
//    }
    }
}
