class Mainn {
    public static void main(String[] args) {
        int height = 70;
        Ladder.climb(height);

        int timesToFoldLadder = 6 - 3; // Corrected the subtraction
        Ladder.fold(timesToFoldLadder);

        String name = "Dosa";
        FoodItem.prepare(name);

        String style = "Classic";
        FoodItem.serve(style);

        String shape = "Rectangle";
        Paper.cut(shape);

        int timesToFoldPaper = 2;
        Paper.fold(timesToFoldPaper);

        String type = "Glass";
        Beer.brew(type);

        int temperature = 42;
        Beer.serve(temperature);

        String content = "Green Board";
        WhiteBoard.write(content);

        int newSizeBoard = 29;
        WhiteBoard.resize(newSizeBoard);

        String outfit = "Deer";
        TeddyBear.dress(outfit);

        int newSizeTeddy = 63;
        TeddyBear.adjustSize(newSizeTeddy);

        int level = 10;
        Tubelight.adjustBrightness(level);

        String installationMethod = "Download";
        Tubelight.install(installationMethod);
    }
}

