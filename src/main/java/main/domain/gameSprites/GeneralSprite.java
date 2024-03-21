package main.domain.gameSprites;

import main.domain.utils.SizedLinkedList;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class GeneralSprite {
    protected BufferedImage image;

    protected List<BufferedImage> temporalBufferedImg = new ArrayList<>();
    protected SizedLinkedList<List<BufferedImage>> animationsList = new SizedLinkedList<>(100);

    protected final int SPRITE_WIDTH;
    protected final  int SPRITE_HEIGHT;
    protected final String imgURI;

    public GeneralSprite(int SPRITE_WIDTH, int SPRITE_HEIGHT, String imgURI) {
        this.SPRITE_WIDTH = SPRITE_WIDTH;
        this.SPRITE_HEIGHT = SPRITE_HEIGHT;
        this.imgURI = imgURI;
        importImg();

    }

    protected void importImg() {
        InputStream inputStream = getClass().getResourceAsStream(imgURI);
        try {
            image = ImageIO.read(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void getAnimationSprites(int animationIdentifier, int numberOfSprites, int row) {
        for (int i = 0; i < numberOfSprites; i++) {
            temporalBufferedImg.add(image.getSubimage(i * SPRITE_WIDTH, SPRITE_HEIGHT * row, SPRITE_WIDTH, SPRITE_HEIGHT));
        }
        animationsList.add(animationIdentifier, List.copyOf(temporalBufferedImg));
        temporalBufferedImg.clear();
    }


    public List<BufferedImage> getAnimationsList(int animationIdentifier) {
        return animationsList.get(animationIdentifier);
    }



}
