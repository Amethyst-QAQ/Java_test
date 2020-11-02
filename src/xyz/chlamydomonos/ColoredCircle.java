package xyz.chlamydomonos;

public class ColoredCircle extends Circle
{
    public int color;
    public ColoredCircle(int color, int radius)
    {
        super(radius);
        this.color = color;
    }

    public int getColor()
    {
        return this.color;
    }
}
