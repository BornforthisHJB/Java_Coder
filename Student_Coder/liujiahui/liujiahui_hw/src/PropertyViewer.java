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
    private  Property property;
    private PropertyViewerGUI gui;     // the Graphical User Interface
    private Portfolio portfolio;
    static int index = 0;

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


    }

    /**
     * 按下 **"Next"** 按钮时，下一个地产项目应该被显示出来，并有正确的数据。此外，顶部的ID应该被正确更新，以及该地产是否是用户的最爱之一。
     * 如果在最后一个地产上按下 **"Next"** 按钮，应用程序应该返回到第一个地产。
     */
    public void nextProperty() {
        index += 1;
        if (index>=portfolio.numberOfProperties()){
            index=0;
        }
        property = portfolio.getProperty(index);
        gui.showID(property);
        gui.showProperty(property);
        gui.showFavourite(property);


    }

    /**
     * **“Previous”** 按钮被按下时，上一个地产应该被显示出来，并有正确的数据。此外，顶部的ID应该被正确更新，以及该地产是否是用户的最爱之一。
     * 如果在第一个地产上按下 **“Previous”** 按钮，应用程序应该转到最后一个地产。
     */
    public void previousProperty() {
        index -= 1;
        if (index<0){
            index=portfolio.numberOfProperties()-1;
        }
        property = portfolio.getProperty(index);
        gui.showID(property);
        gui.showProperty(property);
        gui.showFavourite(property);

    }

    /**
     * "Toggle Favourite" 按钮被按下时，该属性的 **isFavourite 字段** 应该被更新
     */
    public void toggleFavourite() {
        property=portfolio.getProperty(index);
        property.toggleFavourite();
        gui.showFavourite(property);
    }


    //----- methods for challenge tasks -----

    /**
     * This method opens the system's default internet browser
     * The Google maps page should show the current properties location on the map.
     */
    public void viewMap() throws Exception {
        double latitude = 51.512793;
        double longitude = -0.117149;

        URI uri = new URI("https://www.google.com/maps/place/" + latitude + "," + longitude);
        Desktop.getDesktop().browse(uri);
    }

    /**
     *
     */
    public int getNumberOfPropertiesViewed() {
        return 0;
    }

    /**
     *
     */
    public int averagePropertyPrice() {
        return 0;
    }
}
