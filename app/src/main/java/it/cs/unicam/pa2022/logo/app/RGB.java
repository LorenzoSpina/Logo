package it.cs.unicam.pa2022.logo.app;

/**
 * Record that handle the creation of colour using RGB
 * @param r represents the red tone
 * @param g represents the green tone
 * @param b represents the blue tone
 */
public record RGB(int r, int g, int b) {

    public RGB{
     checkIfRGBIsValid(r,g,b);
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    private void checkIfRGBIsValid(int colour1, int colour2, int colour3){
        if ((colour1<0 || colour1>255)||(colour2<0||colour2>255)||(colour3<0||colour3>255)){
            throw new IllegalArgumentException("This colour does not exist");
        }
    }
}
