package it.cs.unicam.pa2022.logo.app;

import java.util.Objects;

/**
 * Record that handle the creation of colour using RGB
 * @param r represents the red tone
 * @param g represents the green tone
 * @param b represents the blue tone
 */
public record RGB(int r, int g, int b) {
    //TODO VERIFICARE CON TEST SE WORKA
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

    private void checkIfRGBIsValid(int r, int g, int b){
        if ((r <0 || r >255)||(g <0|| g >255)||(b <0|| b >255)){
            throw new IllegalArgumentException("This colour does not exist");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RGB rgb = (RGB) o;
        return r == rgb.r && g == rgb.g && b == rgb.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, g, b);
    }
}
