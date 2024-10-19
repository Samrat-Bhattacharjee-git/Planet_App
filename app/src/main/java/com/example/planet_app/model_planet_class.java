package com.example.planet_app;

public class model_planet_class {
    private int img;
    private String planet;
    private String moons;

    public model_planet_class(int img, String planet, String moons) {
        this.img = img;
        this.planet = planet;
        this.moons = moons;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getMoons() {
        return moons;
    }

    public void setMoons(String moons) {
        this.moons = moons;
    }
}
