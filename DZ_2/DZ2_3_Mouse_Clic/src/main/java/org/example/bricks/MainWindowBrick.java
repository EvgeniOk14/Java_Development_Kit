package org.example.bricks;

import org.example.common.*;

    public class MainWindowBrick extends MainWindow {

        public MainWindowBrick() {
            super("Кирпичи", createBricks(), createBackgrounds());
        }

        private static Sprite[] createBricks() {
            Sprite[] bricks = new Brick[10];
            for (int i = 0; i < bricks.length; i++) {
                bricks[i] = new Brick();
            }
            return  bricks;
        }

        private static AbstrackBackground[] createBackgrounds()
        {
            return new AbstrackBackground[]{new BackGroundForBricks()};
        }

}

