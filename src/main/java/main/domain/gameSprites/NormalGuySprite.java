package main.domain.gameSprites;

import static main.domain.utils.SpritesAnimationsConstants.*;

public class NormalGuySprite extends GeneralSprite {


    public NormalGuySprite(int SPRITE_WIDTH, int SPRITE_HEIGHT, String imgURI) {
        super(SPRITE_WIDTH, SPRITE_HEIGHT, imgURI);
        getAnimations();
    }

    private void getAnimations() {
        getAnimationSprites(ANIMATION_STANDING, 1, 0);
        getAnimationSprites(ANIMATION_WALKING_RIGHT, 4, 1);
        getAnimationSprites(ANIMATION_WALKING_LEFT, 4, 2);
        getAnimationSprites(ANIMATION_WALKING_UP, 4, 3);
        getAnimationSprites(ANIMATION_WALKING_DOWN, 4, 0);

    }

}
