import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1); 
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        banana banana = new banana();
        addObject(banana, 300, 100);
        
    }
}
