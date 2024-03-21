package main.domain.gameSprites;
import static main.domain.utils.SpritesAnimationsConstants.*;


public class PirateSprite extends GeneralSprite {

    public PirateSprite(int SPRITE_WIDTH, int SPRITE_HEIGHT, String imgURI) {
        super(SPRITE_WIDTH, SPRITE_HEIGHT, imgURI);
        getAnimations();
    }

    private void getAnimations() {
        getAnimationSprites(ANIMATION_STANDING, 5,0);
        getAnimationSprites(ANIMATION_RUNNING, 6,1);
        getAnimationSprites(ANIMATION_JUMPING, 3,2);
        getAnimationSprites(ANIMATION_BACKING, 1,3);
        getAnimationSprites(ANIMATION_STANDING2, 2,4);
        getAnimationSprites(ANIMATION_DAMAGE, 4,5);
        getAnimationSprites(ANIMATION_FRONTAL_ATTACK, 3,6);
        getAnimationSprites(ANIMATION_UPPER_ATTACK, 3,7);
        getAnimationSprites(ANIMATION_DOWN_ATTACK, 3,8);
        getAnimationSprites(ANIMATION_WALKING_RIGHT, 6, 1);
        getAnimationSprites(ANIMATION_WALKING_LEFT, 6, 1);
        getAnimationSprites(ANIMATION_WALKING_UP, 6, 1);
        getAnimationSprites(ANIMATION_WALKING_DOWN, 6, 1);


    }



}
