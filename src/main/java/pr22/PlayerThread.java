package pr22;

import java.util.Date;

public class PlayerThread extends Thread {

    static final int maxAmountOfHit = 10;
    static int counter = 0;
    static final String[] ball = new String[]{""};

    public void run(){
        while(counter < maxAmountOfHit){
            synchronized(ball){
                play();
            }
        }
    }

    private void play() {
        if(null == ball[0] && !ball[0].equals(getName())){
            ball[0] = getName();
            System.out.println(new Date().getTime() + " " + ball + " " + counter++);
        }
    }

    public PlayerThread(String name){
        this.setName(name);
    }
}
