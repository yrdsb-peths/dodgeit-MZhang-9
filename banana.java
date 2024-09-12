import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class banana extends Actor
{
    
    public void act()
    {
        move(-20);
        if(getX() <= 0) {
            resetBanana();
        }
    }
    public void resetBanana() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(600, 100);
        }else {
            setLocation(600, 300);
        }
        
    }
}
