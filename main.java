import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class main {
    public static void main(String[] args) {



String FilePath = "c:\\Users\\Lenovo\\Desktop\\BABYMONSTER - ‘MONSTERS (Intro)’ (Official Audio) - BABYMONSTER (128k).wav";
File file = new File (FilePath);

try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

    Scanner sc = new Scanner (System.in);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);
    clip.start();

    String response = "";

    while(!response.equals("Q")){
    System.out.println("P = Play");
    System.out.println("S= Start");
    System.out.println("R = Reset");
    System.out.println("Q = Quit");
    System.out.print( "Enter your choice : " );

    response = sc.next().toUpperCase();


    }
}
catch (UnsupportedAudioFileException e){
System.out.println(" Audio is not supported   " );
}
catch ( LineUnavailableException e ){
System.out.println( " Unavailable to access audio ");
}
catch ( FileNotFoundException e){
System.out.println(" Could not locate file ");
}

catch ( IOException e ){
System.out.println(" Something is wrong ");
}
finally{
System.out.println(" Bye! ");
}

}}