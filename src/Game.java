import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;

import javax.imageio.ImageIO;

public class Game {

	public static void main(String[] args) {
		
		
		//TextureLoader.loadList();
		
		//TODO Set up level animations using properties.  The properties will be defined by the tile to be animated.  The value of the property will be the filePath to the animation spriteSheet
		TestDriver game = new TestDriver();
		game.start();
		
		/*
		 // Rectangle detection:
		  public boolean overlaps (Rectangle r) {
		  	return x < r.x + r.width && x + width > r.x && y < r.y + r.height && y + height > r.y;
		  }
		 */
		/*
		try{
			File file = new File("resources\\tilemaps\\series1\\sewer_1.png");
			FileInputStream fis = new FileInputStream(file);
		BufferedImage[] tileset = new BufferedImage[16*Math.floorDiv(352,256)];
		BufferedImage tileBase = ImageIO.read(fis);//This contains the tileSet image and is accessed through the key which is it's name.
		for(int a = 0; a< 16*Math.floorDiv(352,256); a++){
			
			tileset[a] = tileBase.getSubimage(a*16, a*16, 16, 16);
			Graphics2D gr = tileset[a].createGraphics();  
			gr.drawImage(tileBase, 0, 0, 16, 16, 16 * a%32, 16 * a, 16 * a%32 + 16, 16 * a + 16, null);  
			gr.finalize();
			
		}
		
		*/
		//TextureLoader.loadList();
		//Graphics2DDrawImage.main(null);

		

		//test
	//	}catch(Exception e){
		//	e.printStackTrace();
		//}


	}

}



/*

Graphic will be set up like this:

the base gamestate will load all the tilemaps, then the current gamestate will inherit the tilemaps and load the proper one to be rendered



need to have a function to load all the xml files at runtime and then create a method that renders each gamestate.  The gamestate.render() function will pass its map and tilemap 
(or maybe not tilemap, if it is already inherited by the graphics class and is constant for every class)


*/

